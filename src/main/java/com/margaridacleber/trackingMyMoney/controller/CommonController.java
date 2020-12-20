package com.margaridacleber.trackingMyMoney.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CommonController {

    protected String GetIndex() {
        return this.getClass().getSimpleName().replace("Controller","/index");
    }
}
