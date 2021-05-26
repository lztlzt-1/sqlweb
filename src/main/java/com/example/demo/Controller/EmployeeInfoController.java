package com.example.demo.Controller;

import com.example.demo.dao.EmployeeInfoDao;
import com.example.demo.entities.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeInfoController {
    @Autowired
    private EmployeeInfoDao employeeInfoDao;
    @GetMapping("employeeinfo")
    public String toPage(Model model){
        List<EmployeeInfo> employeeInfos=employeeInfoDao.find();
        for(int i=0;i<employeeInfos.size();i++){
            employeeInfos.get(i).id1= employeeInfos.get(i).员工编号;
            employeeInfos.get(i).id2= employeeInfos.get(i).驿站编号;
            employeeInfos.get(i).bel= employeeInfos.get(i).员工所属工种;
            employeeInfos.get(i).addr= employeeInfos.get(i).员工家庭地址;
            employeeInfos.get(i).tel= employeeInfos.get(i).员工电话;
            employeeInfos.get(i).page= employeeInfos.get(i).员工工资情况;
            employeeInfos.get(i).mar= employeeInfos.get(i).员工婚配情况;
            employeeInfos.get(i).name= employeeInfos.get(i).员工姓名;
            employeeInfos.get(i).tim= employeeInfos.get(i).员工出生年月;
            employeeInfos.get(i).tim2= employeeInfos.get(i).员工入职时间;
            employeeInfos.get(i).statu= employeeInfos.get(i).员工当前工作状态;

        }
        model.addAttribute("employee",employeeInfos);
        return "/emps/employeeinfo";
    }
}
