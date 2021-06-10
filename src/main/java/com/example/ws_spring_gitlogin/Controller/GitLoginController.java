package com.example.ws_spring_gitlogin.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@Slf4j
@RestController
public class GitLoginController {

    @GetMapping("/githubLogin")
    public String gitHubLogin(Principal principal){
        System.out.println("data---> "+ principal);
        return  principal.getName();
    }
}
