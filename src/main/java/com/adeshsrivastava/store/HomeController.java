package com.adeshsrivastava.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Lazy
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    public HomeController() {
        System.out.println("HomeController created");
    }

    @RequestMapping("/")
    public String index() {
        System.out.println("appName: " + appName);
        return "index.html";
    }
}
