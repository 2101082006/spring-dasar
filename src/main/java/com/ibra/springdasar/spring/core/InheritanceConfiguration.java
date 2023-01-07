package com.ibra.springdasar.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.ibra.springdasar.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
