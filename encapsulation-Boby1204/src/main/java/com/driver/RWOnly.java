package com.driver;

public class RWOnly {
    private String name;
    public String getName() {
        return name;
    }

    // Method 2 - Setter
    public void setName(String N)
    {
        // This keyword refers to current instance itself
        this.name = N;
    }
}
