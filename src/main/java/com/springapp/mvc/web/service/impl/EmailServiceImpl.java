package com.springapp.mvc.web.service.impl;

import com.springapp.mvc.web.service.EmailService;
import com.springapp.mvc.web.vo.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bin on 3/1/2015.
 */
@Service
public class EmailServiceImpl implements EmailService {
    private static final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);
    @Override
    public boolean sendEmail(List<Employee> employees){
        return false;
    }
}
