package org.africa.semicolon.data.repositories;

import org.africa.semicolon.data.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ServiceRepository extends MongoRepository<Customer, String> {

}
