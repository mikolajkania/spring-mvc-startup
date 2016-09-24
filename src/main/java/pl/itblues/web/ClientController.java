package pl.itblues.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mikolaj Kania on 24.09.2016.
 */
@RestController
public class ClientController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "World!";
    }
}
