package com.codesquad.codereviewers.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisteredUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public boolean isRegistered() {
        return true;
    }
}
