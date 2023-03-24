package com.cardest.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String firstName;
    private String familyName;
    private Date birthDate;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String locality;
    private String zip;
    private String driverLicenseNumber;
}
