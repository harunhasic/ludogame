package com.kodecta;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@org.springframework.context.annotation.Configuration
@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class Configuration {
}
