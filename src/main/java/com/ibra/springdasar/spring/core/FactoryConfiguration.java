package com.ibra.springdasar.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.ibra.springdasar.spring.core.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
