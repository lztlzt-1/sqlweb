package com.example.demo.dao;

import com.example.demo.entities.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeInfoDao extends JpaRepository<EmployeeInfo,Integer> {
    @Query(value = "select * from 员工信息单",nativeQuery = true)
    public List<EmployeeInfo> find();
}
