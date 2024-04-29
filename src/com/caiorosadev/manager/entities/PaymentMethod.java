package com.caiorosadev.manager.entities;

public class PaymentMethod extends Type {

    public PaymentMethod(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Método de Pagamento : " + description;
    }
}
