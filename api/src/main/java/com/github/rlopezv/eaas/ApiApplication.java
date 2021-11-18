package com.github.rlopezv.eaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	// @Bean
	// @Profile("!prod")
	// public GroupedOpenApi actuatorApi(OpenApiCustomiser
	// actuatorOpenApiCustomiser,
	// OperationCustomizer actuatorCustomizer) {
	// return GroupedOpenApi.builder().group("Actuator").pathsToMatch("/**")
	// .addOpenApiCustomiser(actuatorOpenApiCustomiser)
	// .addOperationCustomizer(actuatorCustomizer)
	// .pathsToExclude("/health/*").build();
	// }

	@Bean
	public OpenAPI eeasOpenAPI() {
		return new OpenAPI()
				// .components(new Components().addSecuritySchemes("basicScheme",
				// new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
				.info(new Info().title("SpringShop API").description("Spring shop sample application").version("v0.0.1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation().description("SpringShop Wiki Documentation")
						.url("https://springshop.wiki.github.org/docs"));
	}

	// @Bean
	// public GroupedOpenApi groupOpenApi() {
	// 	String paths[] = { "/api/**" };
	// 	String packagesToscan[] = { "com.github.rlopezv.eeas.api" };
	// 	return GroupedOpenApi.builder().group("groups").pathsToMatch(paths).packagesToScan(packagesToscan).build();
	// }

}
