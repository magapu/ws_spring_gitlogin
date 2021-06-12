package com.example.ws_spring_gitlogin.Controller;


import com.example.ws_spring_gitlogin.DTO.UserDetailsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

@Slf4j
@RestController
public class GitLoginController {

    @GetMapping("/")
    @CrossOrigin
    public UserDetailsDTO gitHubLogin(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        log.info("user Login Data===> " + oAuth2AuthenticationToken.getPrincipal());
        userDetailsDTO.setEmail(oAuth2AuthenticationToken.getPrincipal().getAttribute("email"));
        userDetailsDTO.setUserName(oAuth2AuthenticationToken.getPrincipal().getAttribute("name"));
        return  userDetailsDTO;
    }
}
