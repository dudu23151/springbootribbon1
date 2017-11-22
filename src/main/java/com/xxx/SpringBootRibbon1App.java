package com.xxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootRibbon1App 
{
    public static void main( String[] args )
    {
        System.out.println(" SpringBootRibbonApp Hello World!" );
        SpringApplication.run(SpringBootRibbon1App.class, args);
    }
}
