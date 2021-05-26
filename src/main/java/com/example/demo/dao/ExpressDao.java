package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import com.example.demo.entities.Express;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpressDao extends JpaRepository<Express,Integer> {
    @Query(value = "select * from 快递单",nativeQuery = true)
    public List<Express> find();
}
