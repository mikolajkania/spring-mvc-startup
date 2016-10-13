package pl.itblues.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.itblues.services.PropertyService;

/**
 * Created by Mikolaj Kania on 24.09.2016.
 */
@RestController
public class DataController {

    private PropertyService propertyService;

    @Autowired
    public DataController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello " + propertyService.receiver + "!";
    }
}
