package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="员工信息单")
public class EmployeeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 员工编号;
    public String id1;
    @Column
    public String 驿站编号;
    public String id2;
    @Column
    public String 员工所属工种;
    public String bel;
    @Column
    public String 员工家庭地址;
    public String addr;
    @Column
    public String 员工电话;
    public String tel;
    @Column
    public float 员工工资情况;
    public float page;
    @Column
    public int 员工婚配情况;
    public int mar;
    @Column
    public String 员工姓名;
    public String name;
    @Column
    public Date 员工出生年月;
    public Date tim;
    @Column
    public Date 员工入职时间;
    public Date tim2;
    @Column
    public String 员工当前工作状态;
    public String statu;




}
