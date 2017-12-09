package org.muyu.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.muyu.server.dao.StudentDao;
import org.muyu.server.entity.Student;
import org.muyu.server.service.StudentService;
import org.muyu.server.util.ResultVo;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{
	@Resource
    private StudentDao studentDao;
    
	public Boolean addStudent(Student student) {
		return studentDao.insert(student);
	}

	public Boolean deleteStudentById(Integer id) {
		Student student = new Student();
		student.setId(id);
		
		return studentDao.delete(student) ;
	}

	public Boolean updateStudentById(Student student) {
   
		return studentDao.update(student);
	}

	public ResultVo<List<Student>> findAllStudent(Student student) {
		ResultVo<List<Student>> resultVo = new ResultVo<List<Student>>();
		List<Student> list = studentDao.select(student);
		if(list!=null && list.size()>0) {
			resultVo.setSuccess(true);
			resultVo.setResult(list);
		}else {
			resultVo.setSuccess(false);
			resultVo.setMessage("没有找到相关信息,你知道吗？");
		}
		return resultVo;
	}

}
