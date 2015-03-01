package com.springapp.mvc.web.controller;

import com.springapp.mvc.web.service.EmailService;
import com.springapp.mvc.web.service.EmployeeService;
import com.springapp.mvc.web.vo.Employee;
import com.springapp.mvc.web.vo.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmailService emailService;

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    private static final String pattern = "\\s+";

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public @ResponseBody
    List<Employee> findUserEmail(@RequestParam("sids") String sids){
        log.info("findUserEmail():: start");
        List<Employee> lists = null;
        String[] arr = sids.split(pattern);
        List<String> employeeSids = Arrays.asList(arr);
        if(arr != null && arr.length > 0){
            lists = employeeService.findEmployee(employeeSids);
        }
        log.info("findUserEmail():: end");
        return lists;
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public @ResponseBody
    Response sendEmail(@RequestBody List<Employee> employees){
        log.info("sendEmail():: start");
        boolean success = emailService.sendEmail(employees);

        Response res = new Response();
        if(success){
            res.setStatus("success");
        }else{
            res.setStatus("failure");
        }
        log.info("sendEmail():: start");
        return res;
    }
}