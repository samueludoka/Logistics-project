package org.africa.semicolon.data.models;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
}
