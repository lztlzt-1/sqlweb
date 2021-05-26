package com.example.demo.te;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao extends JpaRepository<User,Integer>{
    @Query(value = "select * from te",nativeQuery = true)
    public List<User> find();
}
//@Repository
//public interface UserDao extends JpaRepository<User,Integer> {
////    @Query(value ="select * from hh where dd=11",nativeQuery = true )
////    List<Usr> fin/xdNativeQueryTrue(@Param("dd") String dd);

//
//
//}
