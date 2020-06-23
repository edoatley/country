package com.edoatley.country.rest;

import com.edoatley.country.model.Country;
import com.edoatley.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("countries")
public class CountryController {

    @Autowired
    CountryService countryService;


    @GetMapping(produces = "application/json")
    public Flux<Country> countries() {
        Flux<Country> allCountries = countryService.getAllCountries();
        return allCountries;
    }
}
