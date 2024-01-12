package com.greatlearning.debate.event.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotaion.RequestMapping;
import org.springframework.web.bind.annotaion.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.debate.event.entity.Student;
import com.greatlearning.debate.event.service.IStudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET,path="/show-form")
	public String sgoeFormToUser() {
		return "welcome";
	}
	
	@RequestMapping(method = RequestMethod.DELETE,path = "/delete-student")
	public String deleteStudentDetails(@RequestParam("id")Integer id)
	  if (studentService.deleteStudent(id)) {
		  System.out.print("Student deleted");
	  }
	  else {
		  System.out.print("Student not deleted");
	  }
		  return "redirect:show-students";
	  
	@RequestMapping(method = RequestMethod.POST, path = "/new-student")
	public Student addStudentDetails(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("department") String department,@RequestParam("country") String country{
		Student student = new Student(id, name, department, country);
		StudentService.add(student);
		return "redirect:show-stuednts";
	}
	
	@RequestMapping(method = RequestMethod.GET , path = "/show-students")
	public ModelAndView getStudentsDetails(ModelAndView mav) {
		
		List<Student> students = studentService.getAllStudents();
		mav.setViewName("student-info");
		mav.addObject("studentInfo",students);	
		return mav;
	}

}
