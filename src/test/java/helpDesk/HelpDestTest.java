package helpDesk;

import Helpers.StringModifier;
import Helpers.TestValues;
import com.example.seleniumtest.ConfigProvider;
import core.BaseSeleniumPage;
import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static Helpers.StringModifier.getUniqueString;

public class HelpDestTest extends BaseSeleniumTest {

    @Test
    public void checkTicket() {
        String title = getUniqueString(TestValues.TEST_TITLE);
        String body = TestValues.TEST_BODY;
        String email = TestValues.TEST_EMAIL;

        TicketPage ticketPage = new MainPage().createTicket(title, body, email)
                .openLoginPage()
                .auth(ConfigProvider.DEMO_LOGIN, ConfigProvider.DEMO_PASSWORD)
                .findTicket(title);

        Assertions.assertTrue(ticketPage.getTitle().contains(title));
        Assertions.assertEquals(ticketPage.getBody(), TestValues.TEST_BODY);
        Assertions.assertEquals(ticketPage.getEmail(), TestValues.TEST_EMAIL);

    }
}
