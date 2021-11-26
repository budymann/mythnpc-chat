package com.example.budymann.mythnpcchat.configurations;

import com.example.budymann.mythnpcchat.domain.SecurityServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public FilterRegistrationBean<SecurityServletFilter> securityFilter(){
        FilterRegistrationBean<SecurityServletFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new SecurityServletFilter());

        return registrationBean;
    }
}
