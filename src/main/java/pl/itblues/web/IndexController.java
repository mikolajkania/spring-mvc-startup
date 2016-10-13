package pl.itblues.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mikolaj Kania on 09.10.2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "view/index.html";
    }

}
