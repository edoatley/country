
package com.edoatley.country.service;

import com.edoatley.country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    @Autowired
    RestTemplate restTemplate;
//    @Autowired
//    WebClient client;
//
//    public List<Country> getAllCountries() {
//        WebClient.ResponseSpec responseSpec = client
//                .method(HttpMethod.GET)
//                .uri("/all").retrieve();
//        Flux<Country> countryFlux = responseSpec.bodyToFlux(Country.class);
//        return countryFlux.collectList().block();
//    }
    public Country[] getAllCountries() {
        return restTemplate.getForEntity("/all", Country[].class).getBody();
    }

}