package com.margaridacleber.trackingMyMoney.model.transactionModel;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private UUID Id;
    private UUID User;
    private String Name;
    private String Category;
    private LocalDate Date;
    private Double Value;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getUser() {
        return User;
    }

    public void setUser(UUID user) {
        User = user;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }
}
