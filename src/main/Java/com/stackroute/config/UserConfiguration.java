package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //Used to initialize & generate the bean inside IoC Container
@EnableWebMvc //Enable Spring MVC-specific annotations like @Controller
@ComponentScan(basePackages = "com.stackroute") //Scan starts from base package and registers all controllers, repositories, service, beans, etc.
public class UserConfiguration
{
    @Bean
    public ViewResolver viewResolver ()
    {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
