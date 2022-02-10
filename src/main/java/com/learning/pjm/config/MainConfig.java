package com.learning.pjm.config;

import com.learning.pjm.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.learning.pjm",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
},useDefaultFilters = false)
public class MainConfig {

    @Bean(value = "person")
    public Person person01() {
        return new Person("panjinming",20);
    }
}
