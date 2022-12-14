package com.perfectevoluton.solution;

import com.perfectevoluton.solution.middlewares.Passport;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/v1/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // Indicates which domains are allowed to access. The simple point can be*
                .allowedOrigins("http://localhost:3000", "https://my.community.perfect-evolution.com", "http://localhost:3001")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowCredentials(true) // indicates that identity credentials are attached
                // Once the allowCredentials(true) method is used, allowedOrigins("*") needs to specify a specific domain, not*
                .maxAge(86400);
    }

    @Override
    public void addInterceptors(@NotNull InterceptorRegistry registry) {
        registry.addInterceptor(new Passport()).addPathPatterns("/api/v1/**");
    }

}