package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import com.example.demo.entities.ExpressChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpressChangeDao extends JpaRepository<ExpressChange,Integer> {
    @Query(value = "select * from 快递转运单",nativeQuery = true)
    public List<ExpressChange> find();
}
