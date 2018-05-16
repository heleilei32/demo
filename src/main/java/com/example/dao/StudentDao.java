package com.example.dao;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM STUDENT WHERE id= ?", new Object[]{1});

        List<Student> students = new ArrayList<>();
        return students;
    }

}
