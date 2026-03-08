package org.courtesilol.Brivox.controller.ui;

import org.courtesilol.Brivox.model.UserRegister;
import org.courtesilol.Brivox.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author javier
 */
@Controller
public class AuthController {
    private final AuthService auth;
    
    public AuthController(AuthService auth) {
        this.auth = auth;
    }
    
    @PostMapping("/auth/register")
    public String register(UserRegister user, Model model) {
        var response = auth.register(user);
        if (response.getStatusCode() == HttpStatus.ACCEPTED) {
            return "redirect:/auth?form=login";
        } else {
            model.addAttribute("form", "Register");
            model.addAttribute("failed", true);
            return "auth"; 
        }

    }
    
    @GetMapping("/auth")
    public String authUi(Model model, 
            @RequestParam(required = false) Boolean failed,
            @RequestParam(required = false) String form
    ) {
        if (form == null || form.equals("login"))
            model.addAttribute("form", "Login");
        else
            model.addAttribute("form", "Register");
        
        if (failed != null)
            model.addAttribute("failed", failed);
        else 
            model.addAttribute("failed", false);
        
        
        return "auth";
    }
    
}
