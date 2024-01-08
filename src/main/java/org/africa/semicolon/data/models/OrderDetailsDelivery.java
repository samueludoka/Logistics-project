package org.africa.semicolon.data.models;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class OrderDetailsDelivery {

    private String id;
    private String deliveryId;
    private String orderId;
}
