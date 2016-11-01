package pl.itblues.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mikolaj Kania on 01.11.2016.
 */
@RestController
public class AsyncController {

    @GetMapping(value = "/sync")
    public String sync() throws InterruptedException {
        sleep();
        return "ok";
    }

    @GetMapping(value = "/async")
    public Callable<String> async() throws InterruptedException {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                sleep();
                return "ok";
            }
        };
    }

    private void sleep() throws InterruptedException {
        int random = ThreadLocalRandom.current().nextInt(1, 11);
        if (random % 5 == 0) {
            Thread.sleep(4_000);
        } else {
            Thread.sleep(1_000);
        }
    }

    @GetMapping(value = "/warm")
    public String warm() throws InterruptedException {
        sleep();
        return "ok";
    }
}
