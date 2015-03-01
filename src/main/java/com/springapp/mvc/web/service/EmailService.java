package com.springapp.mvc.web.service;

import com.springapp.mvc.web.vo.Employee;

import java.util.List;

/**
 * Created by Bin on 3/1/2015.
 */
public interface EmailService {
    public boolean sendEmail(List<Employee> employees);
}
