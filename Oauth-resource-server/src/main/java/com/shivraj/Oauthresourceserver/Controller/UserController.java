package com.shivraj.Oauthresourceserver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public String[] getUser(){
        return new String[]{
                "Shivraj","Ganesh","Manisha"
        };
    }

}
