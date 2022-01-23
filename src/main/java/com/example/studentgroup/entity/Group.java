package com.example.studentgroup.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "university_groups")
@NoArgsConstructor
@Getter
@Setter
public class Group {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
       private Integer id;
        @Column(name = "name")
        private String name;

        @Column(name = "createAt")
        private LocalDateTime createAt;

        @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
        Set<Student> students;


    }


