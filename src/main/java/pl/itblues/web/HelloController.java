package pl.itblues.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.itblues.services.PropertyService;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mikolaj Kania on 24.09.2016.
 */
@RestController
public class HelloController {

    private final PropertyService propertyService;

    @Autowired
    public HelloController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping(value = "/hello")
    public String hello(HttpEntity<byte[]> requestEntity) {
        return "Hello " + propertyService.receiver + "! You browse web with "
                + requestEntity.getHeaders().get("user-agent");
    }

    @GetMapping(value = "/hello/{world}")
    public String helloWorld(@PathVariable String world) {
        return "Hello " + world  + "!";
    }
}
