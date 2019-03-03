package com.nidal.rest.restexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class BaseController {

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "WELCOME";
    }

}
