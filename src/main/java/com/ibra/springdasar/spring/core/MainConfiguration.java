package com.ibra.springdasar.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.ibra.springdasar.spring.core.configuration.BarConfiguration;
import com.ibra.springdasar.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
