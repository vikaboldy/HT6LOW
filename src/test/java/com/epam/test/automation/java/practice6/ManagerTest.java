package com.epam.test.automation.java.practice6;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

public class ManagerTest {

    Employee managerBogdan = new Manager("Bogdan", new BigDecimal(300), 0);
    Employee managerIgor = new Manager("Igor", new BigDecimal(400), 100);
    Employee managerDmytro = new Manager("Dmytro", new BigDecimal(700), 151);
    Employee managerEvgenii = new Manager("Evgenii", new BigDecimal(500), 101);
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
        managerBogdan.setBonus(new BigDecimal(24));
        assertEquals(managerBogdan.toPay(), new BigDecimal(324));
    }

    @Test
    public void testSetBonusForIgor() {
        managerIgor.setBonus(new BigDecimal(36));
        assertEquals(managerIgor.toPay(), new BigDecimal(436));
    }

    @Test
    public void testSetBonusForDmytro() {
        managerDmytro.setBonus(new BigDecimal(30));
        assertEquals(managerDmytro.toPay(), new BigDecimal(1730));
    }

    @Test
    public void testSetBonusForEvgenii() {
        managerEvgenii.setBonus(new BigDecimal(25));
        assertEquals(managerEvgenii.toPay(), new BigDecimal(1025));
    }
}
