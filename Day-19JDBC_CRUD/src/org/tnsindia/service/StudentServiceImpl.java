package org.tnsindia.service;

import java.sql.ResultSet;


import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import org.tnsindia.entities.Student;
import org.tnsindia.repository.StudentRepository;
import org.tnsindia.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{

	@Override
	public boolean AddStudent(Student student) {
		String query="INSERT INTO STUDENT VALUES(?,?)";
		StudentRepository repo =new  StudentRepositoryImpl();
		int count=repo.create(query, student);
		if(count==1)
		
			return true;
		
		return false;
	}

	@Override
	public boolean DeleteStudent(int rollno) {
		// TODO Auto-generated method stub
		String query="DELETE FROM STUDENT WHERE rollno="+rollno;
		StudentRepository repo =new  StudentRepositoryImpl();
		int count=repo.delete(query);
		if(count==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public Student updateStudent(Student student) {
		String query="UPDATE STUDENT SET name= ?  WHERE (rollno=?)";
		StudentRepository repo=new StudentRepositoryImpl();
		int count=repo.update(query, student);
		if(count==1)
		{
			Student s=GetStudent(student.getRollno());
			return s;
		}
		return null;
	}


	@Override
	public Student GetStudent(int rollno) {
		Student student=new Student();
		StudentRepository repo=new StudentRepositoryImpl();
		String query="SELECT * FROM STUDENT WHERE rollno="+rollno;
		ResultSet rs=repo.retrieve(query);
		
		try {
			
				rs.next();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));

			}
		catch (SQLException e) {
			System.out.println(e);
		}
		return student;
		
	}
	
	@Override
	public List<Student> GetStudents() {
		// TODO Auto-generated method stub
		List<Student> students= new ArrayList<Student>();
		String query="SELECT * FROM STUDENT";
		StudentRepository repo =new  StudentRepositoryImpl();
		ResultSet rs = repo.retrieve(query);
		try {
			while(rs.next()) {
				Student student = new Student();
				student.setRollno(rs.getInt(1));//0=>column index number
				student.setName(rs.getString(2));
				students.add(student);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return students;
		
	}

}
