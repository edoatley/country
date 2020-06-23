package com.edoatley.country.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Country {
    String name;
    String[] topLevelDomain;
    String alpha2Code;
    String alpha3Code;
    String[] callingCodes;
    String capital;
    String[] altSpellings;
    String region;
    String subregion;
}
