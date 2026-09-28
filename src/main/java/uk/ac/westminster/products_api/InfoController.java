package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "Become familiar with this API and understand Spring Boot!";
    }
}
