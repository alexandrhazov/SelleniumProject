package helpDesk;

import core.BaseSeleniumPage;
import core.BaseSeleniumTest;
import org.junit.jupiter.api.Test;

public class HelpDestTest extends BaseSeleniumTest {

    @Test
    public void checkTicket() {
        String title = "Alex Khazov";
        String body = "Message to getBlend tech support";
        String email = "Test@mail.ru";
        MainPage mainPage = new MainPage();
        mainPage.createTicket(title, body, email);
    }
}
