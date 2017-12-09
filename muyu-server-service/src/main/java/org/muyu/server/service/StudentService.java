package org.muyu.server.service;

import java.util.List;

import org.muyu.server.entity.Student;
import org.muyu.server.util.ResultVo;

public interface StudentService {
	public Boolean addStudent(Student student);
	public Boolean deleteStudentById(Integer id);
	public Boolean updateStudentById(Student student);
	public ResultVo<List<Student>> findAllStudent(Student student);
}
