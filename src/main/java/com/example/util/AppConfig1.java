package com.example.util;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

public interface AppConfig1 {
    void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer);
}
