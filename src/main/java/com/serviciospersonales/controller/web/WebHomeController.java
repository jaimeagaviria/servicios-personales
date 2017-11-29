package com.serviciospersonales.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class WebHomeController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

}
