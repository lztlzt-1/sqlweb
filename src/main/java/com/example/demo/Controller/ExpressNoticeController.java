package com.example.demo.Controller;

import com.example.demo.dao.ExpressNoticeDao;
import com.example.demo.entities.ExpressNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExpressNoticeController {
    @Autowired
    private ExpressNoticeDao expressNoticeDao;
    @GetMapping("expressnotice")
    public String toPage(Model model){
        List<ExpressNotice> expressNotices=expressNoticeDao.find();
        for(int i=0;i<expressNotices.size();i++){
            expressNotices.get(i).id= expressNotices.get(i).运单号;
            expressNotices.get(i).typ= expressNotices.get(i).快件通知类型;
            expressNotices.get(i).meth= expressNotices.get(i).快件通知方式;
            expressNotices.get(i).tim= expressNotices.get(i).快件通知时间;
            expressNotices.get(i).statu= expressNotices.get(i).快件通知状态;
            expressNotices.get(i).statu2= expressNotices.get(i).快件状态;
            expressNotices.get(i).bef= expressNotices.get(i).信息更变前所在驿站;
            expressNotices.get(i).aft= expressNotices.get(i).信息更变后流向驿站;
            expressNotices.get(i).tim2= expressNotices.get(i).信息更变时间;
            expressNotices.get(i).id2= expressNotices.get(i).员工编号;
            expressNotices.get(i).id3= expressNotices.get(i).快递员编号;

        }
        model.addAttribute("expressNotices",expressNotices);
        return "/emps/expressnotice";
    }
}
