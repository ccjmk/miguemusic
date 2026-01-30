package com.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Artist {
    final String firstName;
    final String lastName;
    final String stageName;
    final Date birthDate;
}
