package com.example.studentgroup.controller;


import com.example.studentgroup.dto.GroupResponseDto;
import com.example.studentgroup.service.GroupService;
import com.example.studentgroup.dto.GroupRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupController {

   private final GroupService groupService;

    public GroupController(@Autowired GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping (path = "/groups")
    public void add(@RequestBody GroupRequestDto groupRequestDto)
    {
        groupService.add(groupRequestDto);
    }

    @GetMapping (path = "/groups")
    public List<GroupResponseDto> getAllGroups(){

        return groupService.getAllGroups();

    }

    @GetMapping(path = "/groups/{id}")
    public GroupResponseDto getById(@PathVariable Integer id){
    return  groupService.getGroupById(id);
    }
}

