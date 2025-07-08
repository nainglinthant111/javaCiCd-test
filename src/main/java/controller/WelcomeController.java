package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class WelcomeController {

    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @GetMapping("")
    public String showWelcomePage() {
        log.info("welcome page");
        return "index";
    }

    @RequestMapping("error")
    public String Error() {
        return "/error";
    }

}
