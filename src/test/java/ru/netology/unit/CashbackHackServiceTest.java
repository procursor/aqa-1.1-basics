package ru.netology.unit;

import static org.testng.Assert.assertEquals;
import static ru.netology.unit.CashbackHackService.BOUNDARY;

import org.testng.annotations.Test;

/**
 * @version TestNG
 */
@Test
public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    public void shouldReturn100() {
        assertEquals(service.calculateRemainder(BOUNDARY - 100), 100);
    }

    public void shouldReturnZero() {
        assertEquals(service.calculateRemainder(BOUNDARY), 0);
    }

    public void shouldReturn900() {
        assertEquals(service.calculateRemainder(BOUNDARY + 100), 900);
    }
}