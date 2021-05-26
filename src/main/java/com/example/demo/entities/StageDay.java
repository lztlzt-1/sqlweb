package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="驿站日志单")
public class StageDay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 驿站编号;
    public String id;
    @Column
    public String 剩余快递总量;
    public String rests;
    @Column
    public String 今日入库快递量;
    public String todin;
    @Column
    public String 今日取件量;
    public String toout;
    @Column
    public String 总寄件量;
    public String al;
    @Column
    public String 今日寄件量;
    public String tosen;

}
