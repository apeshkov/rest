package org.sandbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Александр on 30.01.2016.
 */
@Configuration
@ComponentScan("org.sandbox")
public class ApplicationContext {

    @Bean
    public String environment() {
        return "TEST";
    }
}
