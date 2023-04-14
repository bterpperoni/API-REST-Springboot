package com.cardest.backend.domain.model.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private UUID id;
    private String username;
    private String firstName;
    private String familyName;
    private String email;
    private Date birthDate;
    private String address;
    private String locality;
    private String zip;
    private Boolean isNew;
}
