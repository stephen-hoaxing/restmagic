package com.nidal.rest.restexample.resource;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.nidal.rest.restexample.Utils.Utils;
import com.nidal.rest.restexample.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
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
        Map<Long, User> userMap = Maps.newHashMap();
        userMap.put(user.getId(), user);
        User u = Utils.nullSafePutValueFromMap(userMap, user.getId(), null);
        return u;
    }

    @GetMapping("/users")
    public @ResponseBody
    Collection<User> getUsers() {
        Collection<User> users = Lists.newArrayList();

        User u1 = new User();
        u1.setId(2L);
        u1.setFirstName("Otis");
        u1.setLastName("Jackson Jr.");
        u1.setEmail("madlib@gmail.com");

        User u2 = new User();
        u2.setId(3L);
        u2.setFirstName("Norman");
        u2.setLastName("Osbourne");
        u2.setEmail("normnan.osbourne@gmail.com");

        User u3 = new User();
        u3.setId(4L);
        u3.setFirstName("Bruce");
        u3.setLastName("Wayne");
        u3.setEmail("wayne@gmail.com");

        ((ArrayList<User>) users).add(u1);
        ((ArrayList<User>) users).add(u2);
        ((ArrayList<User>) users).add(u3);

        return users;
    }

}
