package com.margaridacleber.trackingMyMoney.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("home")
    String Home() {
        return "Home/home";
    }
}