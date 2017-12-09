package org.muyu.server.web;

import java.util.List;

import org.muyu.server.entity.Student;
import org.muyu.server.service.StudentService;
import org.muyu.server.util.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/studentApi/")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("findAllStudentInfo")
	public @ResponseBody ResultVo<List<Student>> findAllStudentInfo (@RequestParam("id") String id){
		Student student=new Student();  
		if ("0".equals(id)){
			student=null;
		} else {
			student.setId(new Integer(id));
			}
		return studentService.findAllStudent(student);
		}
	 
}
