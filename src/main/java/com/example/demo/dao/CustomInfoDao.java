package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomInfoDao extends JpaRepository<CustomInfo,Integer> {
    @Query(value = "select * from 客户信息单",nativeQuery = true)
    public List<CustomInfo> find();
}
