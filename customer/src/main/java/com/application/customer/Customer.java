package com.application.customer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    // Getters and Setters

}
