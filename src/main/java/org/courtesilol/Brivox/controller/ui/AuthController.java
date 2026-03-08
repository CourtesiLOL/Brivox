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
    
    @GetMapping("/auth")
    public String authUi(Model model, 
            @RequestParam(required = false) Boolean failed,
            @RequestParam(required = false) String form
    ) {
        
        if (form == null || form.equals("login"))
            model.addAttribute("form", "login");
        else
            model.addAttribute("form", "register");
        
        if (failed != null && failed) 
            model.addAttribute("failed", true);
        
        return "auth";
    }
    
}
