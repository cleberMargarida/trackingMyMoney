package com.margaridacleber.trackingMyMoney.controller.home;

import com.margaridacleber.trackingMyMoney.controller.CommonController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController extends CommonController {

    @GetMapping("/")
    @ResponseBody
    public String Index() {
        return "Hello World";
    }
}