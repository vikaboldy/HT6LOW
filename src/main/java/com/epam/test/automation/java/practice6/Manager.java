package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;


public abstract class Manager extends Employee {
    private int quantity;
    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity=clientAmount;

    }

    public BigDecimal setBonus(BigDecimal bonus) {
        if(quantity>100){
            this.bonus=bonus.add(BigDecimal.valueOf(500));
        }else if (quantity>150){
            this.bonus=bonus.add(BigDecimal.valueOf(1000));

        }
        return bonus;
    }
}
