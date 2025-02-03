package com.telusko.Springdatajpaex;

import com.telusko.Springdatajpaex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

/*		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Aswin");
		s1.setMarks(87);


		s2.setRollNo(2);
		s2.setName("Arun Kumar MG");
		s2.setMarks(79);


		s3.setRollNo(3);
		s3.setName("Mohan Raj");
		s3.setMarks(86);

		s4.setRollNo(4);
		s4.setName("Kasi Vishwa");
		s4.setMarks(90);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);*/

		//SELECT QUERY

		//To find all data
		//System.out.println(repo.findAll());


		//when the data is not found, it will throw a exception, so we are storing the data
		//And if the value is not present create a dummy object
		//Optional<Student> s = repo.findById(1);
		//System.out.println(s.orElse(new Student()));

		//Inbuild query
		//System.out.println(repo.findByName("Aswin"));
		//System.out.println(repo.findByMarksGreaterThan(80));


		//own query
		//System.out.println(repo.findByNameWithAlpha("A"));

		//UPDATE QUERY

		//s4.setRollNo(4);
		//s4.setName("Kasi Vishwa");
		//s4.setMarks(90);

		//repo.save(s4);

		//DELETE QUERY

		// repo.delete(s4);

	}

}
