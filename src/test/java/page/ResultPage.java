package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage extends BasePage{

    public ResultPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//p[.='₹ 8,484per adult']")
    WebElement resultDeparturePrice;

    @FindBy(xpath = "//p[.='₹ 6,687per adult']")
    WebElement resultReturnPrice;

    public String getTxtDeparturePrice(){
        return getText(resultDeparturePrice);
    }

    public String getTxtReturnPrice(){
        return getText(resultReturnPrice);
    }

}
