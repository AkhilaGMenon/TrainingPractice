/**
 * Project Name  :test
 * 
 */
package com.ust.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @SpringBootApplication annotation is equivalent to  using @Configuration,@EnableAutoConfiguration,@ComponentScan
 * 
 *@author Akhila                       
 */
@SpringBootApplication
@EnableSwagger2
public class TestApplication {
	private static final Logger LOG = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		try {
			SpringApplication.run(TestApplication.class, args);
		} catch (Exception e) {
			LOG.error("Exception:", e);
		}
	}

		@Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.ust.practice.controller"))              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }
	}


