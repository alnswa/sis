package com.spaneos.sis.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spaneos.sis.domain.Student;
import com.spaneos.sis.service.SisService;

@Controller
public class SisController {

	private String message = "welcome to spring mvc world";
	@Autowired
	private SisService sisService;
	
	@RequestMapping(value = { "/", "/homepage" })
	public String homePage(Model model) {
		model.addAttribute("message", message);
		return "homepage";
	}
	@RequestMapping("/viewallstudents")
	public String viewAllStudents(Model model) {
		
		List<Student> list = sisService.getStudents();
		model.addAttribute("studentList", list);
		return "viewallstudents";
	}
	@RequestMapping("/addstudentform")
	public String addStudentForm(){
		return "addnewstudent";
	}
	@RequestMapping(value={"/addstudent"},method=RequestMethod.POST)
	public String addStudent(Student student){
		if(sisService.addStudent(student)){
			return "success";
		}
		else{
			return "errorpage";
		}
	}
	
	public SisService getSisService() {
		return sisService;
	}
	public void setSisService(SisService sisService) {
		this.sisService = sisService;
	}

	
}
