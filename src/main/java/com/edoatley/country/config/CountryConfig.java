package com.edoatley.country.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CountryConfig {
    public static final int TIMEOUT = 5000;
    private static String COUNTRY_URL = "https://restcountries.eu/rest/v2";

//    @Bean
//    public WebClient webClient() {
//        TcpClient tcpClient = TcpClient
//                .create()
//                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, TIMEOUT)
//                .doOnConnected(connection -> {
//                    connection.addHandlerLast(new ReadTimeoutHandler(TIMEOUT, TimeUnit.MILLISECONDS));
//                    connection.addHandlerLast(new WriteTimeoutHandler(TIMEOUT, TimeUnit.MILLISECONDS));
//                });
//
//        WebClient client = WebClient.builder()
//                .baseUrl(COUNTRY_URL)
//                .clientConnector(new ReactorClientHttpConnector(HttpClient.from(tcpClient)))
//                .build();
//        return client;
//    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder().rootUri(COUNTRY_URL).build();
    }
}
