package pl.itblues;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Mikolaj Kania on 09.10.2016.
 */
@Configuration
@ComponentScan(value = "pl.itblues.*.config")
@PropertySource("classpath:app.properties")
public class AppConfig {

}
