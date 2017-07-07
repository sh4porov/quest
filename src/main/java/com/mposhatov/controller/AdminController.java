package com.mposhatov.controller;

import com.mposhatov.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value="/admin", method = {RequestMethod.GET, RequestMethod.POST})
    public String profile() {
        return "admin";
    }

}
