package ru.netology.unit.JUnit4;

import static org.junit.Assert.assertEquals;
import static ru.netology.unit.CashbackHackService.BOUNDARY;

import java.util.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import ru.netology.unit.CashbackHackService;

/**
 * @version JUnit4
 */
public class CashbackHackServiceTest {
    private static final String engine = "JUnit4";
    private static final Logger LOGGER = Logger.getLogger(CashbackHackService.class.getName());

    private final CashbackHackService service = new CashbackHackService();

    @Rule public TestName name = new TestName();

    @BeforeClass
    public static void init() {
        LOGGER.info(engine + "platform tests are running:");
    }

    @Before
    public void setup() {
        LOGGER.info("About to execute " + engine + ": " + name.getMethodName());
    }

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
