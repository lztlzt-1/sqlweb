package com.example.demo.entities;

import javax.persistence.*;
import javax.servlet.http.PushBuilder;

@Entity
@Table(name="驿站信息单")
public class Stage {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String 驿站编号;public String id;
    @Column
    public String 负责人名字;
    public String name;
    @Column
    public String 驿站联系电话;
    public String tel;
    @Column
    public String 驿站地址;
    public String addre;
    @Column
    public int 驿站大小;
    public int size;

    public void change(){
        name=负责人名字;
    }

}
