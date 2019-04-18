package com.jarades.APIGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class RotasLivraria {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {

        String uri_0 = "http://localhost:5001"; // uriConfiguration.getHttp_uri(0);

        return builder.routes()
                .route(p -> p
                        .path("api/Book")
                        //	.filters(f -> f.addRequestHeader("Authorization", "bearer token"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Book")
                        .filters(f -> f.rewritePath("/Book/(?<id>.*)", "/Book/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Car")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Car")
                        .filters(f -> f.rewritePath("/Car/(?<id>.*)", "/Car/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Order")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Order")
                        .filters(f -> f.rewritePath("/Order/(?<id>.*)", "/Order/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Request")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Request")
                        .filters(f -> f.rewritePath("/Request/(?<id>.*)", "/Request/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Review")
                        .filters(f -> f.rewritePath("/Review/(?<id>.*)", "/Review/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Review")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/User")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/User")
                        .filters(f -> f.rewritePath("/User/(?<id>.*)", "/User/${id}"))
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Search")
                        .uri(uri_0))
                .route(p -> p
                        .path("api/Search")
                        .filters(f -> f.rewritePath("/Search/(?<srch>.*)", "/Search/${srch}"))
                        .uri(uri_0))
                .build();
    }
}
