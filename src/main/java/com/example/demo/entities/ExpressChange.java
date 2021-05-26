package com.example.demo.entities;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="快递转运单")
public class ExpressChange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 运单号;
    public String id;
    @Column
    public String 快递员编号;
    public String id2;
    @Column
    public String 员工编号;
    public String id3;
    @Column
    public Date 信息更变时间;
    public Date tim;
    @Column
    public String 信息更变前所在驿站;
    public String bef;
    @Column
    public String 信息更变后流向驿站;
    public String aft;

}
