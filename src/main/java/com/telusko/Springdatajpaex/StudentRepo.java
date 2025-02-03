package com.telusko.Springdatajpaex;

import com.telusko.Springdatajpaex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    List<Student> findByName(String aswin);

    List<Student> findByMarksGreaterThan(int i);

    @Query("Select s from Student s where s.name like ?1%")
    List<Student> findByNameWithAlpha(String a);
}
