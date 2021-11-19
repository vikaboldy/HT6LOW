package com.epam.test.automation.java.practice6;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

public class SalesPersonTest {

    Employee salesPersonBogdan = new SalesPerson("Bogdan", new BigDecimal(300), 0);
    Employee salesPersonIgor = new SalesPerson("Igor", new BigDecimal(400), 100);
    Employee salesPersonDmytro = new SalesPerson("Dmytro", new BigDecimal(700), 200);
    Employee salesPersonEvgenii = new SalesPerson("Evgenii", new BigDecimal(500), 201);
    Employee checkFailedValue = new Manager("",new BigDecimal(0), 0);

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void checkNullPointerExceptionIfBonusSetLessThanZero() {
        checkFailedValue.setBonus(new BigDecimal(-1));
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void checkNullPointerExceptionIfUseNullInBonus() {
        checkFailedValue.setBonus(null);
    }

    @Test
    public void testSetBonusForBogdan() {
        salesPersonBogdan.setBonus(new BigDecimal(24));
        assertEquals(salesPersonBogdan.toPay(), new BigDecimal(324));
    }

    @Test
    public void testSetBonusForIgor() {
        salesPersonIgor.setBonus(new BigDecimal(36));
        assertEquals(salesPersonIgor.toPay(), new BigDecimal(436));
    }

    @Test
    public void testSetBonusForDmytro() {
        salesPersonDmytro.setBonus(new BigDecimal(30));
        assertEquals(salesPersonDmytro.toPay(), new BigDecimal(760));
    }

    @Test
    public void testSetBonusForEvgenii() {
        salesPersonEvgenii.setBonus(new BigDecimal(25));
        assertEquals(salesPersonEvgenii.toPay(), new BigDecimal(575));
    }
}
