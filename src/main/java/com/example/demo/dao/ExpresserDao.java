package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import com.example.demo.entities.Expresser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpresserDao extends JpaRepository<Expresser,Integer> {
    @Query(value = "select * from 快递员信息单",nativeQuery = true)
    public List<Expresser> find();
}
