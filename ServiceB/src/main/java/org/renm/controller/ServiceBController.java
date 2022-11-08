package org.renm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serviceB")
public class ServiceBController {

    @RequestMapping("/home")
    public String serviceB() {
        return "serviceB";
    }
}
