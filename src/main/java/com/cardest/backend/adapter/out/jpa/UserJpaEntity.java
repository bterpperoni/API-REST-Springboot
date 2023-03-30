package com.cardest.backend.adapter.out.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


import java.sql.Date;

@Entity
@Data
@Table(name = "USERS")
public class UserJpaEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USERNAME", unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "FAMILY_NAME", nullable = false, length = 50)
    private String familyName;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 255)
    private String password;

    @Column(name = "PHONE", unique = true, length = 15)
    private String phone;

    @Column(name = "ADDRESS", length = 255)
    private String address;

    @Column(name = "LOCALITY", length = 50)
    private String locality;

    @Column(name = "ZIP", length = 4)
    private String zip;

    @Column(name = "DRIVER_LICENSE_NUMBER", unique = true, length = 20)
    private String driverLicenseNumber;
}
