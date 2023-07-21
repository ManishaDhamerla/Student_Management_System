package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.repository.StudentRepository;
@SpringBootApplication

public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
 private StudentRepository studentRepository;
 
	@Override
	public void run(String... args) throws Exception {
//  Students student=new Students("Manisha","Dhamerla","manishadhamerla@gmail.com");
//  studentRepository.save(student);
//  
//		Students student =new Students(2,"Sai","Dhamerla","said@gmail.com");
//		studentRepository.save(student);
 
	}

}
