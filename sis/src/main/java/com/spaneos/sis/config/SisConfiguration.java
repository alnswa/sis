package com.spaneos.sis.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan("com.spaneos.sis")
@PropertySource(value = "classpath:db.properties")
public class SisConfiguration {

	private @Value("${db.driverclass:com.mysql.jdbc.Driver}") String driverClassName;
	private @Value("${db.url:jdbc:mysql://localhost:3306/irp}") String url;
	private @Value("${db.username:root}") String userName;
	private @Value("${db.password:spaneos}") String password;

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver obj = new InternalResourceViewResolver();
		obj.setPrefix("/WEB-INF/views/");
		obj.setSuffix(".jsp");
		return obj;
	}

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource obj = new BasicDataSource();
		obj.setDriverClassName(driverClassName);
		obj.setUrl(url);
		obj.setUsername(userName);
		obj.setPassword(password);

		return obj;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new HibernateTransactionManager(sessionfactory().getObject());
	}

	@Bean
	public LocalSessionFactoryBean sessionfactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setPackagesToScan("com.spaneos.sis.domain");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect",
				org.hibernate.dialect.Oracle10gDialect.class.getName());
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.hbm2dll.auto", "update");
		return properties;
	}

	// Mongo Db Connection

	public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(), "irp");
	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		return mongoTemplate;

	}
	@Bean
	public PersistenceExceptionTranslationPostProcessor processor(){
		return new PersistenceExceptionTranslationPostProcessor();
	}

}
