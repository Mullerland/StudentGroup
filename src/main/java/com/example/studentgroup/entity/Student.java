package com.example.studentgroup.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "createAt")
    private LocalDate createAt;

    @ManyToOne
    @JoinColumn(name = "group_id")
    Group group;


    public void addSection(){

    }


}
