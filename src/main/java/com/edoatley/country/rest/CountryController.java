package com.edoatley.country.rest;

import com.edoatley.country.model.Country;
import com.edoatley.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping(produces = "application/json")
    public List<Country> countries() {
        List<Country> allCountries = asList(countryService.getAllCountries());
        return allCountries;
    }
}
