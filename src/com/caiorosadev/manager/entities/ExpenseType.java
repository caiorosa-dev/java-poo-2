package com.caiorosadev.manager.entities;

public class ExpenseType extends Type {
    public ExpenseType(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Tipo de gasto " + description;
    }
}
