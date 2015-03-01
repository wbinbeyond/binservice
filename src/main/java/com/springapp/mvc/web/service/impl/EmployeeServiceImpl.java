package com.springapp.mvc.web.service.impl;

import com.springapp.mvc.web.service.EmployeeService;
import com.springapp.mvc.web.vo.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bin on 3/1/2015.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public List<Employee> findEmployee(List<String> sids){
        log.info("findEmployee():: start");
        log.info("list of sids: " + sids);
        List<Employee> lists = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setSid("v588434");
        e1.setFirstName("Bin");
        e1.setLastName("Wang");
        e1.setEmailAddress("wbin.beyond@gmail.com");

        Employee e2 = new Employee();
        e2.setSid("v423232");
        e2.setFirstName("Jimmy");
        e2.setLastName("Tom");
        e2.setEmailAddress("tom@gmail.com");
        e2.setDirectManager(e1);

        lists.add(e1);
        lists.add(e2);
        log.info("findEmployee():: end");
        return lists;
    }
}
