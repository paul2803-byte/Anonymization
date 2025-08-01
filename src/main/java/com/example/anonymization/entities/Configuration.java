package com.example.anonymization.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class Configuration {

    String attribute;
    String dataType;
    String anonymization;
}
