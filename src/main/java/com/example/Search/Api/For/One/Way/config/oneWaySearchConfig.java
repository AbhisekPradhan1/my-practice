package com.example.Search.Api.For.One.Way.config;
import feign.Client;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class oneWaySearchConfig {

    @Bean
    public Client oneWaySearchClient() {
        CloseableHttpClient httpClient = HttpClients.custom()
                .setRedirectStrategy(new LaxRedirectStrategy()) // Enable redirects
                .build();
        return new ApacheHttpClient(httpClient);
    }
}