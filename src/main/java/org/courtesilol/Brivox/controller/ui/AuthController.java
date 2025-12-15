package org.courtesilol.Brivox.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author javier
 */
@Controller
public class AuthController {
    
    @GetMapping("/auth/login")
    public String loginUi(Model model, @RequestParam(required = false) Boolean failed) {
        if (failed != null && failed) {
            model.addAttribute("failed", true);
            return "login";
        } 
        
        model.addAttribute("failed", false);
        return "login";
    }
    
    @GetMapping("/auth/register")
    public String registerUi(Model model) {
        return "register";
    }
    
}
