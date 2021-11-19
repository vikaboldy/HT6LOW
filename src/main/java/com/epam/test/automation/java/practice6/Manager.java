package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;


public class Manager extends Employee {
    private int quantity;
    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity=clientAmount;

    }

    public BigDecimal setBonus(BigDecimal bonus) {

        if(bonus==null||bonus.compareTo(BigDecimal.ZERO)<0){
           throw new IllegalArgumentException();
        }else if(quantity>150){
            super.bonus=bonus.add(BigDecimal.valueOf(1000));
        }else if (quantity>100){
            super.bonus=bonus.add(BigDecimal.valueOf(500));

        }else {
            super.bonus=bonus;
        }
        return super.bonus;
    }
}
