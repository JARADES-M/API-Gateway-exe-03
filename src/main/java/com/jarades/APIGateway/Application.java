package com.jarades.APIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties(UriConfiguration.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {

		String http_uri = uriConfiguration.getHttp_uri();

		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f.addRequestHeader("Hello", "World"))
						.uri(http_uri))
                .route(p -> p
				.host("*.hystrix.com")
				.filters(f -> f.hystrix(config -> config.setName("mycmd")
				.setFallbackUri("forward:/fallback")))
				.uri(http_uri))
				.build();
	}

}
