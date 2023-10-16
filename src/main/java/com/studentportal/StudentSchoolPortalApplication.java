package com.studentportal;

import com.studentportal.entity.Student;
import com.studentportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSchoolPortalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentSchoolPortalApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Daniel", "Theolasupo", "danielolasupo02@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Nikolas", "Tesla", "sanjay@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Tony", "Fire", "tonyfire@gmail.com");
//		studentRepository.save(student3);

	}
}
