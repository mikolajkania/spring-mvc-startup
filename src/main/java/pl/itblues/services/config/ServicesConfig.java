package pl.itblues.services.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Mikolaj Kania on 09.10.2016.
 */
@Configuration
@ComponentScan("pl.itblues.services")
@PropertySource("classpath:services.properties")
public class ServicesConfig {
}
