package com.example.demo.Controller;

import com.example.demo.dao.StageDao;
import com.example.demo.entities.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

@Controller
public class StageController {
    @Autowired
    private StageDao stageDao;
    @GetMapping("/stage")

    public String toStage(Model model){
        Stage stage=new Stage();
        List<Stage> stages=stageDao.find();
        for(int i=0;i<stages.size();i++){
            stages.get(i).name= stages.get(i).负责人名字;
            stages.get(i).id= stages.get(i).驿站编号;
            stages.get(i).tel= stages.get(i).驿站联系电话;
            stages.get(i).size= stages.get(i).驿站大小;
            stages.get(i).addre= stages.get(i).驿站地址;

        }
        model.addAttribute("stages",stages);
//        model.addAttribute("ddd",10);
//        SessionFactory session;

        System.out.println(stages.get(0).负责人名字);
        return "/emps/stage";
    }
}
