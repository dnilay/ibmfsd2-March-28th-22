package com.example.mongodbdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    @JsonProperty
    private String name;
    @JsonProperty
    private String customerId;
    @JsonProperty
    private String address;
}
