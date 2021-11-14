package ru.netology.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.unit.CashbackHackService.BOUNDARY;

import org.junit.jupiter.api.Test;

/**
 * @version JUnit Jupiter
 */
public class JUnit5_CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100() {
        assertEquals(100, service.calculateRemainder(BOUNDARY - 100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, service.calculateRemainder(BOUNDARY));
    }

    @Test
    public void shouldReturn900() {
        assertEquals(900, service.calculateRemainder(BOUNDARY + 100));
    }
}

