package org.muyu.server.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.muyu.server.entity.Student;
import org.muyu.server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
	@Autowired
	private StudentService studentService;
	@Test
	public void testAddStudent() {
		Student student = new Student();
		student.setAddress("sksfsfsf");
		student.setId(1);
		student.setName("abd");
		student.setSex(false);
		studentService.addStudent(student);
	}
	@Test
	public void testAddStudent02() {
		Student student = new Student();
		student.setAddress("河南省夏邑县");
		student.setId(5);
		student.setName("张建国");
		student.setSex(false);
		studentService.addStudent(student);
	}
}
