package com.example.demo.entities;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="快件通知信息")
public class ExpressNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 运单号;
    public String id;
    @Column
    public String 快件通知类型;
    public String typ;
    @Column
    public String 快件通知方式;
    public String meth;
    @Column
    public Date 快件通知时间;
    public Date tim;
    @Column
    public String 快件通知状态;
    public String statu;
    @Column
    public String 快件状态;
    public String statu2;
    @Column
    public String 信息更变前所在驿站;
    public String bef;
    @Column
    public String 信息更变后流向驿站;
    public String aft;
    @Column
    public Date 信息更变时间;
    public Date tim2;
    @Column
    public String 员工编号;
    public String id2;
    @Column
    public String 快递员编号;
    public String id3;



}
