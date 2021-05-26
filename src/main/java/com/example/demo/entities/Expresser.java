package com.example.demo.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="快递员信息单")
public class Expresser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 快递员编号;
    public String id;
    @Column
    public String 驿站编号;
    public String id2;
    @Column
    public String 快递员姓名;
    public String id3;
    @Column
    public String 快递员电话;
    public String tel;
    @Column
    public String 快递员家庭地址;
    public String addr;
    @Column
    public String 快递员身份证号;
    public String id4;
    @Column
    public Date 快递员入职时间;
    public Date tim;
    @Column
    public String 当前工作状态2;
    public String statu;
}
