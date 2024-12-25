package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewaySaerviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySaerviceApplication.class, args);
	}
	@Bean 
	DiscoveryClientRouteDefinitionLocator locator(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp) {
		return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
	}}
