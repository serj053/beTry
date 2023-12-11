package org.betry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/get-user")
    public List<User> getTestUser() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(it -> userList.add(it));
            return userList;
        //return List.of(new User(2, "+7-777-77-77", " Tom"));
    }
}
