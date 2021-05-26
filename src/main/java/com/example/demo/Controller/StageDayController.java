package com.example.demo.Controller;

import com.example.demo.dao.StageDayDao;
import com.example.demo.entities.StageDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StageDayController {
    @Autowired
    private StageDayDao stageDayDao;
    @GetMapping("stageday")
    public String toPage(Model model){
        List<StageDay> stageDays=stageDayDao.find();
        for(int i=0;i<stageDays.size();i++){
            stageDays.get(i).id= stageDays.get(i).驿站编号;
            stageDays.get(i).rests= stageDays.get(i).剩余快递总量;
            stageDays.get(i).todin= stageDays.get(i).今日入库快递量;
            stageDays.get(i).toout= stageDays.get(i).今日取件量;
            stageDays.get(i).al= stageDays.get(i).总寄件量;
            stageDays.get(i).tosen= stageDays.get(i).今日寄件量;

        }
        model.addAttribute("stageDays",stageDays);
        return "emps/stageday";
    }
}
