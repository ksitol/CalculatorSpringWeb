package by.Katya.config;

import by.Katya.entity.Calculator;
import by.Katya.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("by.Katya")
@EnableWebMvc
public class Config {
    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public List<User> userList() {
        return new ArrayList<>();
    }

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
//        @Bean
//    public FreeMarkerViewResolver resolver() {
//            FreeMarkerViewResolver freeMarkerResourceViewResolver = new FreeMarkerViewResolver();
//        freeMarkerResourceViewResolver.setPrefix("/pages/");
//        freeMarkerResourceViewResolver.setSuffix(".ftl");
//        return freeMarkerResourceViewResolver;
//    }
//
//        @Bean
//    public FreeMarkerConfigurer freeMarkerConfigurer () {
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
//        freeMarkerConfigurer.setTemplateLoaderPath("");
//        return freeMarkerConfigurer;
//    }
}
