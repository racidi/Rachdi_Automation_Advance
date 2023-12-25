package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{
    public MainPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait){
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),  this);
    }

    @FindBy(xpath = "//span[.='Departure']")
    WebElement dropDeparture;

    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[1]//div[5]/div[.='30']")
    WebElement chooseDateDeparture;

    @FindBy(xpath = "//span[.='Return']")
    WebElement dropReturn;

    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[2]//div[1]/div[.='1']")
    WebElement chooseReturnDate;

    @FindBy(xpath = "//a[.='Search']")
    WebElement btnsearch;

    public void search(){
        clickAndWait(dropDeparture);
        clickAndWait(chooseDateDeparture);
        clickAndWait(dropReturn);
        clickAndWait(chooseReturnDate);
        clickAndWait(btnsearch);
    }

}
