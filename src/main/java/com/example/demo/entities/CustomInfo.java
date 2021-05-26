package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "客户信息单")
public class CustomInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 客户编号;
//    public String id;
    @Column
    public String 客户姓名;
//    public String name;
    @Column
    public String 客户电话;
//    public String tel;
    @Column
    public String 客户家庭住址;
//    public String add;
    @Column
    public String 客户身份证号;
//    public String ind;
    @Column
    public String 所接受的服务_寄收快递;
//    public String ser;
    public String id;
    public String name; public String ind;
    public String tel;
    public String addre;
//
    public String ser;



}
