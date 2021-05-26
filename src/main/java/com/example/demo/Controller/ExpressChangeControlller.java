package com.example.demo.Controller;

import com.example.demo.dao.CustomInfoDao;
import com.example.demo.dao.ExpressChangeDao;
import com.example.demo.entities.ExpressChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExpressChangeControlller {
    @Autowired
    private ExpressChangeDao expressChangeDao;
    @GetMapping("expresschange")
    public String toPage(Model model){
        List<ExpressChange> expressChanges=expressChangeDao.find();
        for(int i=0;i<expressChanges.size();i++){
            expressChanges.get(i).id= expressChanges.get(i).运单号;
            expressChanges.get(i).id2= expressChanges.get(i).快递员编号;
            expressChanges.get(i).id3= expressChanges.get(i).员工编号;
            expressChanges.get(i).tim= expressChanges.get(i).信息更变时间;
            expressChanges.get(i).bef= expressChanges.get(i).信息更变前所在驿站;
            expressChanges.get(i).aft= expressChanges.get(i).信息更变后流向驿站;
        }
        model.addAttribute("expressChanges",expressChanges);
        return "/emps/expresschange";
    }
}
