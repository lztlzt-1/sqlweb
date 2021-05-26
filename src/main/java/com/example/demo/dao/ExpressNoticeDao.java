package com.example.demo.dao;

import com.example.demo.entities.CustomInfo;
import com.example.demo.entities.ExpressNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpressNoticeDao extends JpaRepository<ExpressNotice,Integer> {
    @Query(value = "select * from 快件通知信息",nativeQuery = true)
    public List<ExpressNotice> find();
}
