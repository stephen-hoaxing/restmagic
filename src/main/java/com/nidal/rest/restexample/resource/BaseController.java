package com.nidal.rest.restexample.resource;

import com.nidal.rest.restexample.model.User;
import org.springframework.web.bind.annotation.*;

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
    User comment(@PathVariable(value = "comment") String comment) {
        if (!comment.contains(" ")) {
            return null;
        }
        String firstName = comment.split(" ")[0];
        String lastName = comment.split(" ")[1];
        String email = new StringBuilder()
                .append(firstName)
                .append(".")
                .append(lastName)
                .append("@gmail.com")
                .toString();
        User user = new User();
        user.setId(1L);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        return user;
    }

}
