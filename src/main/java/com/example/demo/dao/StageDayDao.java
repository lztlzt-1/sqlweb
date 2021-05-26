package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import com.example.demo.entities.StageDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StageDayDao extends JpaRepository<StageDay,Integer> {
    @Query(value = "select * from 驿站日志单",nativeQuery = true)
    public List<StageDay> find();
}
