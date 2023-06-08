package com.demo.springshell.config;

import com.demo.springshell.exception.CustomExceptionResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    CustomExceptionResolver customExceptionResolver() {
        return new CustomExceptionResolver();
    }
}
