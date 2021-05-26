package com.example.demo.dao;

import com.example.demo.entities.Stage;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StageDao extends JpaRepository<Stage,Integer> {
    @Query(value = "select * from 驿站信息单",nativeQuery = true)
    public List<Stage> find();

}
