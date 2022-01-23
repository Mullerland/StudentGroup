package com.example.studentgroup.service;

import com.example.studentgroup.dto.GroupRequestDto;
import com.example.studentgroup.dto.GroupResponseDto;

import java.util.List;

public interface GroupService {
    public void add(GroupRequestDto groupRequestDto);

    public List<GroupResponseDto> getAllGroups();

    public GroupResponseDto getGroupById(Integer id);
}
