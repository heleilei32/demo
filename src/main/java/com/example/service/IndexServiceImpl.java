package com.example.service;

import com.example.dao.StudentDao;
import com.example.dao.StudentRepository;
import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentDao studentDao;


    @Override
    public void addStudent() {
        Student student = new Student();
        student.setName("小红");
        student.setAge(23);
        student.setSex("男");
        student.setCreateTime(new Date());
        studentRepository.save(student);
    }

    @Override
    public void findAllStudents() {
        List<Student> students = studentDao.findAll();
        for (Student student: students) {
            System.out.println("学生的ID是"+student.getId());
        }
    }
}
