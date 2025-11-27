package org.courtesilol.Brivox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javier
 */

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String getMain() {
        return "Hello world";
    }
}
