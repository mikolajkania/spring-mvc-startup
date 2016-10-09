package pl.itblues.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Mikolaj Kania on 09.10.2016.
 */
@Service
public class PropertyService {

    @Value(value = "${pl.itblues.greetingreceiver}")
    public String receiver;

}
