package ru.netology.unit;

import static org.junit.Assert.assertEquals;
import static ru.netology.unit.CashbackHackService.BOUNDARY;

import org.junit.Test;

/**
 * @version JUnit4
 */
public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test public void shouldReturn100() {
        assertEquals(100, service.calculateRemainder(BOUNDARY - 100));
    }

    @Test public void shouldReturnZero() {
        assertEquals(0, service.calculateRemainder(BOUNDARY));
    }

    @Test public void shouldReturn900() {
        assertEquals(900, service.calculateRemainder(BOUNDARY + 100));
    }
}