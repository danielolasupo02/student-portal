package com.studentportal.repository;

import com.studentportal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
//    A repository interface class, in the context of
//    Java application development and frameworks like
//    Spring Data JPA, serves as an abstraction layer that
//    provides a set of methods for interacting with a database.
//    It is used to perform CRUD (Create, Read, Update, Delete)
//    operations on database entities without directly writing SQL queries.

}
