package com.example.studentgroup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupResponseDto {

    Integer groupId;
    String groupName;
    List<StudentResponseDto> studentList;
    int quantity;


}
