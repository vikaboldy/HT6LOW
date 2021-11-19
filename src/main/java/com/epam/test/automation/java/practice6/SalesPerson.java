package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;


public  class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent=percent;
    }


    public BigDecimal setBonus(BigDecimal bonus) {
        if(bonus==null||bonus.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException();
        }else if(percent>200){
            super.bonus=bonus.multiply(BigDecimal.valueOf(3));
        } else if(percent>100){
            super.bonus=bonus.multiply(BigDecimal.valueOf(2));
        }else {
            super.bonus=bonus;
        }
        return super.bonus;
    }
}
