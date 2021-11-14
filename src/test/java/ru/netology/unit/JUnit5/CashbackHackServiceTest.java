package ru.netology.unit.JUnit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.unit.CashbackHackService.BOUNDARY;

import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import ru.netology.unit.CashbackHackService;

/**
 * @version JUnit5
 */
public class CashbackHackServiceTest {

    private static final String engine = "JUnit5";
    final CashbackHackService service = new CashbackHackService();

    private static final Logger LOGGER = Logger.getLogger(CashbackHackService.class.getName());

    @BeforeAll
    public static void init() {
        LOGGER.info(engine + " platform tests are running:");
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        LOGGER.info("About to execute " + engine + ": " + testInfo.getDisplayName());
    }

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

