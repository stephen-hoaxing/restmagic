package com.nidal.rest.restexample.resource;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest")
public class BaseController {

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "WELCOME";
    }

    @GetMapping(value = "/greet")
    public String greet() {
        return "GREET";
    }

    @GetMapping(value = "/comment/{comment}")
    public @ResponseBody
    Map<Integer, String> comment(@PathVariable(value = "comment") String comment) {
        Map<Integer, String> map = Maps.newHashMap();
        map.put(comment.hashCode(), comment);
        return map;
    }

}
