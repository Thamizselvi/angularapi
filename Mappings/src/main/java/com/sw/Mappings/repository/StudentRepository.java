package com.sw.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.Mappings.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
