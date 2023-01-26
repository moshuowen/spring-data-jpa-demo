package com.example.demo.student.repository;

import com.example.demo.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shuowenmo
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
