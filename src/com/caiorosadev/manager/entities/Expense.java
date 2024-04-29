package com.caiorosadev.manager.entities;

import java.util.Date;

public class Expense {
    private final Date date;
    private final double value;

    private final String description;

    private final ExpenseType type;
    private final PaymentMethod paymentMethod;

    public Expense(Date date, double value, String description, ExpenseType type, PaymentMethod paymentMethod) {
        this.date = date;
        this.value = value;
        this.description = description;
        this.type = type;
        this.paymentMethod = paymentMethod;
    }

    public String getDescription() {
        return description;
    }
}
