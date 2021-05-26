package com.example.demo.Controller;

import com.example.demo.dao.ExpressDao;
import com.example.demo.entities.Express;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExpressController {
    @Autowired
    private ExpressDao expressDao;
    @GetMapping("express")
    public String toPage(Model model){
        List<Express> expresses=expressDao.find();
        for(int i=0;i<expresses.size();i++){
            expresses.get(i).id= expresses.get(i).运单号;
            expresses.get(i).id2= expresses.get(i).客户编号;
            expresses.get(i).id3= expresses.get(i).快递员编号;
            expresses.get(i).id4= expresses.get(i).员工编号;
            expresses.get(i).name= expresses.get(i).快递公司名称;
            expresses.get(i).siz= expresses.get(i).快件大小类型;
            expresses.get(i).typ= expresses.get(i).快件到付类型;
            expresses.get(i).status= expresses.get(i).快递状态码;
            expresses.get(i).pos= expresses.get(i).快件存放位置;
            expresses.get(i).weight= expresses.get(i).快件重量;
            expresses.get(i).notice= expresses.get(i).短信通知结果;
        }
        model.addAttribute("expresses",expresses);
        return "/emps/express";
    }
}
