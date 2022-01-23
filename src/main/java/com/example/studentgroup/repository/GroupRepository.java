package com.example.studentgroup.repository;

import com.example.studentgroup.entity.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {

    List<Group> findAll();
}
