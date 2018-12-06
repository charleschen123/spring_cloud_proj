package com.dc.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
@RefreshScope
@SpringBootApplication
public class EurekaClientApplication 
{
	@RequestMapping("/")
	public String home() {
	    return "Hello World";
	}
	
	@Value("${neo.hello}")
    String hello;
    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }
	
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaClientApplication.class, args);
    }
}
