package com.caiorosadev.manager.entities;

public abstract class Type {
    protected String description;

    public Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
