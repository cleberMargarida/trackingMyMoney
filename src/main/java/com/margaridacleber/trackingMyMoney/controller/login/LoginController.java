package com.margaridacleber.trackingMyMoney.controller.login;

import com.margaridacleber.trackingMyMoney.controller.CommonController;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController extends CommonController{

    @GetMapping("/")
    public String Index() {
        return this.GetIndex();
    }

    @PostMapping("Login/sign-in")
    @ResponseBody
    public String NewLogin(UserDto dto) {

        return "success";
    }
}