package com.naveen.assignment;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CodingAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingAssignmentApplication.class, args);
	}

	@Bean
	public Docket SwaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .paths(PathSelectors.ant("/*"))
				.apis(RequestHandlerSelectors.basePackage("com.naveen.assignment")).build().apiInfo(apiDetails());
	}

	@SuppressWarnings("unchecked")
	private ApiInfo apiDetails() {
		return new ApiInfo("Coding Assignment for Wipro", "Basic Data Manipulation using REST and MongoDB", "1.0",
				"Free to Use",
				new springfox.documentation.service.Contact("Naveen Das Sivadas", "", "naveen.das.sivadas@gmail.com"),
				"API License", "http://www.google.com", Collections.EMPTY_LIST);
	}
}
