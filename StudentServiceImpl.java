package com.greatlearning.debate.event.service;
import org.springframework.stereotype.Service;
import java.util.List;

import com.greatlearning.debate.event.entity.Student;
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;
    
	@Override
	public Student add(Student student) {
		
		return studentDao.insertStudentDetails(student);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
