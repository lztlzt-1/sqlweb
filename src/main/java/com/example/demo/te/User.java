package com.example.demo.te;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "te")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    public void setId(int id) {
//        this.id = id;
//    }
//    public int getId() {
//        return id;
//    }
//
//    public int getVALUE_1() {
//        return VALUE_1;
//    }
//
//    public void setVALUE_1(int VALUE_1) {
//        this.VALUE_1 = VALUE_1;
//    }

    @Column
    private int VALUE_1;
    @Column
    private int d1;

}
