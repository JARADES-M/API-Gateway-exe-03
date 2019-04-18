package com.jarades.APIGateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

// Sem uso
@ConfigurationProperties
public class UriConfiguration {
    private static String[] http_uri = {null, null, null, null, null, null, null, null, null, null};

    public String getHttp_uri(int idx) {
        return http_uri[idx];
    }

    public boolean setHttp_uri(String http_uri) {
        for(int i = 0; i < this.http_uri.length; i++) {
            if (this.http_uri[i].isEmpty()) {
                this.http_uri[i] = http_uri;
                return true;
            }
        }
        return false;
    }
}
