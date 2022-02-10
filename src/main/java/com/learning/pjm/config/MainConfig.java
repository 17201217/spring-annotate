package com.learning.pjm.config;

import com.learning.pjm.entity.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration

@ComponentScans(value = {
        @ComponentScan(value = "com.learning.pjm",includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
public class MainConfig {

    @Bean(value = "person")
    public Person person01() {
        return new Person("panjinming",20);
    }
}
