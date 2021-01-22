package com.hcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//Docket is a bean to get instance of a @getter and @setter
	
	
	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2 ).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		// TODO Auto-generated method stub
		return or(regex("/.*"),regex("/.*"));
	}


	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("Task Operations")
				.description("Welcome to Kush Gandhi's Website for Task Operations")
				.version("1.0")
				.build();
		
				
	}


}
