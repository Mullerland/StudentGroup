package com.example.studentgroup.service;

import com.example.studentgroup.dto.GroupRequestDto;
import com.example.studentgroup.dto.GroupResponseDto;
import com.example.studentgroup.dto.StudentResponseDto;
import com.example.studentgroup.entity.Group;
import com.example.studentgroup.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void add(GroupRequestDto groupRequestDto) {
        Group group = new Group();
        group.setName(groupRequestDto.getName());
        group.setCreateAt(LocalDateTime.now());

        groupRepository.save(group);

    }

    @Override
    public List<GroupResponseDto> getAllGroups() {

        return  groupRepository.findAll().stream().map(group -> {
            GroupResponseDto groupResponseDto = new GroupResponseDto();
            groupResponseDto.setGroupId(group.getId());
            groupResponseDto.setGroupName(group.getName());
            groupResponseDto.setQuantity(group.getStudents().size());

            return groupResponseDto;
        }).collect(Collectors.toList());

    }

    @Override
    public GroupResponseDto getGroupById(Integer id) {
        Group group = groupRepository.findById(id).get();

        GroupResponseDto groupResponseDto = new GroupResponseDto();
        groupResponseDto.setGroupId(group.getId());
        groupResponseDto.setGroupName(group.getName());
        groupResponseDto.setStudentList(group.getStudents().stream().map(student ->
        {StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setStudentId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setCreateAt(student.getCreateAt());

        return studentResponseDto;}).collect(Collectors.toList()));

        return groupResponseDto;
    }
}
