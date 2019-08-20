package com.hundsun.TAdemo.service;

import com.hundsun.TAdemo.dao.StudentMapper;
import com.hundsun.TAdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAllStudents() {
        List<Student> studentList =  studentMapper.findAll();
        if(studentList.size() == 0) {
            studentList.add(new Student(0, "nothing", 0));  //如果数据库里没有学生，就加一条默认的数据，service层主要做一些逻辑判断
        }
        return studentList;
    }
}
