package com.margaridacleber.trackingMyMoney.controller.login;

import com.margaridacleber.trackingMyMoney.controller.CommonController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController extends CommonController{

    @GetMapping("Login")
    public String Index() {
        return this.GetIndex();
    }
}