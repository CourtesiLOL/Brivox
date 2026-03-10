package org.courtesilol.Brivox.controller.ui;

import java.util.logging.Logger;
import org.courtesilol.Brivox.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ruizn
 */

@Controller
@RequestMapping("/")
public class HomeController {
    private final Logger log = Logger.getLogger(HomeController.class.getName());
    private final UserService userService;
    
    public HomeController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public String homeUi(Model model) {
        var us = userService.getUserFromSesion();
        model.addAttribute("user",us);
        log.info("User name: "+us.getName());
        return "home";
    }
    
}
