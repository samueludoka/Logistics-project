package org.africa.semicolon.services;

public interface CustomerService {
    String customerDetailsResponse();

    String customerDetails();
    void orderRequest();
    void orderConfirmation();
    int payment();

}
