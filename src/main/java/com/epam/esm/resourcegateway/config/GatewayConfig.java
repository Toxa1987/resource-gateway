package com.epam.esm.resourcegateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator createRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("resource_service_route",
                        route -> route.path("/rs/**")
                                .filters((filter -> filter.stripPrefix(1)))
                                .uri("lb://resource-service"))
                .route("song_service_route",
                        route -> route.path("/ss/**")
                                .filters((filter -> filter.stripPrefix(1)))
                                .uri("lb://song-service"))
                .route("storage-service_route",
                        route -> route.path("/sts/**")
                                .filters((filter -> filter.stripPrefix(1)))
                                .uri("lb://storage-service"))
                .build();
    }
}
