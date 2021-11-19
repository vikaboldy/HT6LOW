package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;


public abstract class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent=percent;
    }


    public BigDecimal setBonus(BigDecimal bonus) {

        if(percent>100){
            this.bonus=bonus.multiply(BigDecimal.valueOf(2));
        } else if(percent>200){
            this.bonus=bonus.multiply(BigDecimal.valueOf(3));
        }
        return bonus;
    }
}
