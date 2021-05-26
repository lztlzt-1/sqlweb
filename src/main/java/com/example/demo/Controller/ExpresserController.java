package com.example.demo.Controller;

import com.example.demo.dao.ExpresserDao;
import com.example.demo.entities.Expresser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExpresserController {
    @Autowired
    private ExpresserDao expresserDao;
    @GetMapping("expresser")
    public String toPage(Model model){
        List<Expresser>expressers=expresserDao.find();
        for(int i=0;i<expressers.size();i++){
            expressers.get(i).id= expressers.get(i).快递员编号;
            expressers.get(i).id2= expressers.get(i).驿站编号;
            expressers.get(i).id3= expressers.get(i).快递员姓名;
            expressers.get(i).tel= expressers.get(i).快递员电话;
            expressers.get(i).addr= expressers.get(i).快递员家庭地址;
            expressers.get(i).id4= expressers.get(i).快递员身份证号;
            expressers.get(i).tim= expressers.get(i).快递员入职时间;
            expressers.get(i).statu= expressers.get(i).当前工作状态2;

        }
        model.addAttribute("expressers",expressers);
        return "/emps/expresser";
    }
}
