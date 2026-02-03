package com.domain;

import lombok.Data;

@Data
public class Artist {
    Long id;
    final String firstName;
    final String lastName;
    final String nationality;
    final String birthDate;
}
