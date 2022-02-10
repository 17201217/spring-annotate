package com.learning.pjm.config;

import com.learning.pjm.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean(value = "person")
    public Person person01() {
        return new Person("panjinming",20);
    }
}
