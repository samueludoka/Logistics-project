package org.africa.semicolon.data.models;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Product {
    private String id;
    private String supplierId;
}
