
package com.edoatley.country.service;

import com.edoatley.country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class CountryService {

    @Autowired
    WebClient client;

    public Flux<Country> getAllCountries() {
        WebClient.ResponseSpec responseSpec = client
                .method(HttpMethod.GET)
                .uri("/all").retrieve();
        return responseSpec.bodyToFlux(Country.class);
    }
}