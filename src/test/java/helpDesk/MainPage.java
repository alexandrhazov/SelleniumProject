package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement queueList;

    @FindBy(xpath = "//select[@id='id_queue']//option[@value='1']")
    private WebElement queueValue;

    @FindBy(id = "id_title")
    private WebElement title;

    @FindBy(id = "id_body")
    private WebElement body;

    @FindBy(id = "id_due_date")
    private WebElement dateField;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[text()='23']")
    private WebElement calendarField;




}
