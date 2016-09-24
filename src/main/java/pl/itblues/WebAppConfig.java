package pl.itblues;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Mikolaj Kania on 24.09.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("pl.itblues")
public class WebAppConfig extends WebMvcConfigurerAdapter {
}
