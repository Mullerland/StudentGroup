package com.example.studentgroup.service;

import com.example.studentgroup.entity.Group;
import com.example.studentgroup.entity.Student;
import com.example.studentgroup.repository.GroupRepository;
import com.example.studentgroup.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentServiceImpl implements StudentService {

    private final GroupRepository groupRepository;
    private final StudentRepository studentRepository;


    public StudentServiceImpl(GroupRepository groupRepository, StudentRepository studentRepository) {
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void add(Integer id, String name) {
        Group group = groupRepository.findById(id).get();

        Student student = new Student();
        student.setGroup(group);
        student.setName(name);
        student.setCreateAt(LocalDate.now());

        studentRepository.save(student);
    }
}