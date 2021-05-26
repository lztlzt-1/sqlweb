package com.example.demo.Controller;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.entities.Employee;
import com.example.demo.te.User;
import com.example.demo.te.UserDao;
//import com.example.demo.te.UserService;
//import com.example.demo.te.UserServiceImpl;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.loader.custom.sql.SQLQueryParser;
import org.hibernate.query.NativeQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
//import org.junit.Test;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.springframework.boot.web.servlet.server.Session.*;

@Controller
public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/save")
//    @ResponseBody
//    public String saveUser() {
//        User user = new User();
//        user.setVALUE_1(212);
////        System.out.println(user);
//        userService.adduser(user);
//        return "success";
//    }

    @Autowired
    private UserDao userDao;

    @GetMapping("/user")
    public String getusers(Model model) {
        User user = new User();
        List<User> d = userDao.find();
        int dd = 0;
        dd=dd+1;
        model.addAttribute("lalala", d);
        return "user";
    }
//    @Autowired
//    private SessionFactory sessionFactory;
//    @GetMapping("/tet")
//    public String test(){
//        NativeQuery<User> d=sessionFactory.getCurrentSession().createSQLQuery("select * from test");
//        return "success";
//    }


}
