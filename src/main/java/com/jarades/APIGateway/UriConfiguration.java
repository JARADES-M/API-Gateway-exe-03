package com.jarades.APIGateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class UriConfiguration {
    private String http_uri = "http://httpbin.org:80";

    public String getHttp_uri() {
        return http_uri;
    }

    public void setHttp_uri(String http_uri) {
        this.http_uri = http_uri;
    }
}
