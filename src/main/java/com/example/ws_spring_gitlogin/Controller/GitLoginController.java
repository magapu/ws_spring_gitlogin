package com.example.ws_spring_gitlogin.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@Slf4j
@RestController
public class GitLoginController {

    @GetMapping("/")
    @CrossOrigin
    public UserDetailsDTO getData(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        log.info("User Info===> " + oAuth2AuthenticationToken.getPrincipal());
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        userDetailsDTO.setEmail(oAuth2AuthenticationToken.getPrincipal().getAttribute("email"));
        userDetailsDTO.setUserName(oAuth2AuthenticationToken.getPrincipal().getAttribute("name"));
        userDetailsDTO.setProfilePicture(oAuth2AuthenticationToken.getPrincipal().getAttribute("picture"));
        return userDetailsDTO;
    }
}
