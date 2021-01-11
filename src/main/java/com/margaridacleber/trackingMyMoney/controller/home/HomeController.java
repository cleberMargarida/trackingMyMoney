package com.margaridacleber.trackingMyMoney.controller.home;

import com.margaridacleber.trackingMyMoney.controller.CommonController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends CommonController {

    @GetMapping("/Home")
    public String Index() {
        return this.GetIndex();
    }
}