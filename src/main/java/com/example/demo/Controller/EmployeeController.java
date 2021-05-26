//package com.example.demo.Controller;
//
//import com.example.demo.dao.CustomInfoDao;
//import com.example.demo.dao.DepartmentDao;
//import com.example.demo.dao.EmployeeDao;
//import com.example.demo.entities.Department;
//import com.example.demo.entities.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//
//import java.util.Collection;
//import java.util.List;
//
//@Controller
//public class EmployeeController {
//    @Autowired
//    private EmployeeDao employeeDao;
//    @GetMapping("/employee")
//    public String  toPage(){
//        List<Employee> employees=employeeDao.find();
//        return "/emps/employee";
//    }
//}
////
////@Controller
////public class EmployeeController {
////    @Autowired
////    EmployeeDao employeeDao;
////    @Autowired
////    DepartmentDao departmentDao;
////
////    @GetMapping("/emps")
////    public String list(Model model){
////
////        Collection<Employee> employees=employeeDao.getAll();
////        model.addAttribute("emps",employees);
////        return "/emps/list";
////    }
////
////
////    @GetMapping("/emp")
////    public String toAddPage(Model model){
////        Collection<Department> departments = departmentDao.getDepartments();
////        model.addAttribute("depts",departments);
////        return "emps/add";
////    }
////    @PostMapping("/emp")
////    public String addEmp(Employee employee){
////        employeeDao.save(employee);
////        System.out.println(employee);
////        return "redirect:/emps";
////    }
////    @GetMapping("/emp/{id}")
////    public String toEdit(@PathVariable("id") Integer id,Model model){
////        Employee employee = employeeDao.get(id);
////
////        Collection<Department> departments = departmentDao.getDepartments();
////        model.addAttribute("depts",departments);
////        model.addAttribute("emp",employee);
////        return "emps/add";
////    }
////    @PutMapping("/emp")
////    public String updateData(Employee employee){
////        System.out.println(employee);
////        employeeDao.save(employee);
////        return "redirect:/emps";
////    }
////}
