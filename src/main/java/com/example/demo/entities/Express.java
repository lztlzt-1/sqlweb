package com.example.demo.entities;

import javax.persistence.*;
import javax.servlet.http.PushBuilder;

@Entity
@Table(name="快递单")
public class Express {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 运单号;
    public String id;
    @Column
    public String 客户编号;
    public String id2;
    @Column
    public String 快递员编号;
    public String id3;
    @Column
    public String 员工编号;
    public String id4;
    @Column
    public int 快递公司名称;
    public int name;
    @Column
    public int 快件大小类型;
    public int siz;
    @Column
    public String 快件到付类型;
    public String typ;
    @Column
    public int 快递状态码;
    public int status;
    @Column
    public String 快件存放位置;
    public String pos;
    @Column
    public float 快件重量;
    public float weight;
    @Column
    public String 短信通知结果;
    public String notice;


}
