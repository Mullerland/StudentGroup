package com.example.studentgroup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GroupRequestDto {
    private String name;
    private String creator;
}
