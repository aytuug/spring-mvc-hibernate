package com.aakin.demo;

import model.Employee;
import model.EmployeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ControllerDemo {

    private ApplicationContext applicationContext;
    @RequestMapping("/home")
    public String view1(){
        return "home";
    }

    @RequestMapping("/register")
    public String view2(Model model){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = applicationContext.getBean("info", Employee.class);
        model.addAttribute("bean", employee);
        return "register";
    }

    @RequestMapping("/store")
    public String view3(@ModelAttribute("bean") Employee employee, Model model){
        applicationContext = new  ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao employeeDao = applicationContext.getBean("dao", EmployeeDao.class);
        employeeDao.saveData(employee);
        model.addAttribute("msg", "Veri kaydedildi");
        return "register";
    }

    @RequestMapping("/display")
    public String view4(Model model){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao employeeDao = applicationContext.getBean("dao", EmployeeDao.class   );
        List list = employeeDao.displayData();
        if (!list.isEmpty()){
            model.addAttribute("data", list);
        }else {
            model.addAttribute("msg", "Veri yok!!");
        }

        return "display";
    }


}
