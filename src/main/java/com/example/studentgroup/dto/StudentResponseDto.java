package com.example.studentgroup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDto {
    private Integer studentId;
    private String name;
    private LocalDate createAt;
}
