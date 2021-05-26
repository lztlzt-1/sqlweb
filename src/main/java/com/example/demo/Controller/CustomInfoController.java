package com.example.demo.Controller;

import com.example.demo.dao.CustomInfoDao;
import com.example.demo.entities.CustomInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomInfoController {
    @Autowired
    private CustomInfoDao customInfoDao;
    @GetMapping("custom-info")
    public String toPage(Model model){
        CustomInfo customInfo=new CustomInfo();
        List<CustomInfo> customInfos= customInfoDao.find();
        for(int i=0;i<customInfos.size();i++){
            customInfos.get(i).name= customInfos.get(i).客户姓名;
            customInfos.get(i).id= customInfos.get(i).客户编号;
            customInfos.get(i).ind= customInfos.get(i).客户身份证号;
            customInfos.get(i).tel= customInfos.get(i).客户电话;
            customInfos.get(i).ser= customInfos.get(i).所接受的服务_寄收快递;
            customInfos.get(i).addre= customInfos.get(i).客户家庭住址;
        }
        model.addAttribute("custominfos",customInfos);


        return "/emps/custom";
    }
}
