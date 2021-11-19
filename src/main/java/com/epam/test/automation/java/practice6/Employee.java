package com.epam.test.automation.java.practice6;
import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private BigDecimal salary;
   protected BigDecimal bonus;

    public String name() {
        return name;
    }


    public BigDecimal salary(BigDecimal salary) {
        this.salary = salary;
        return salary;
    }

    public Employee(String name, BigDecimal salary){
        this.name=name;
        this.salary=salary;
    }

    public abstract BigDecimal setBonus(BigDecimal bonus);

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal toPay(){
        return salary.add(bonus);
    }
}
