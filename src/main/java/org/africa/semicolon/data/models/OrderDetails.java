package org.africa.semicolon.data.models;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class OrderDetails {
    private String id;
    private String productId;
    private String orderId;
}
