package com.caiorosadev.manager;

import com.caiorosadev.manager.entities.Expense;
import com.caiorosadev.manager.entities.ExpenseType;
import com.caiorosadev.manager.entities.PaymentMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {
    private final List<Expense> expenseList = new ArrayList<>();
    private final List<ExpenseType> expenseTypeList = new ArrayList<>();
    private final List<PaymentMethod> paymentMethodList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    void addPaymentMethod(String name) {
        PaymentMethod paymentMethod = new PaymentMethod(name);

        paymentMethodList.add(paymentMethod);
    }

    void addExpenseType(String name) {
        ExpenseType expenseType = new ExpenseType(name);

        expenseTypeList.add(expenseType);
    }

    void addExpense(Date date, double value, String description,ExpenseType expenseType, PaymentMethod paymentMethod) {
        Expense expense = new Expense(date, value, description, expenseType, paymentMethod);

        expenseList.add(expense);
    }

    void listExpenses() {
        for (Expense expense : expenseList) {
            System.out.println(expense.getDescription());
        }
    }
}
