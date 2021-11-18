package com.sgic.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("deffec-tracker-api")
				.apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
	}

	private Predicate<String> postPaths() {
		return  regex("/semita/defect-tracker/api.*");
	}



	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Deffet Tracker")
				.description("Semita deffect tracker").version("1.0").build();
	}

}
