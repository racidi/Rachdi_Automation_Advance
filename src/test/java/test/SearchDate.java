package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.ResultPage;

public class SearchDate extends BaseWebTest{

    @Test
    public void searchTopValue(){
        MainPage mainPage = new MainPage(driver, explicitWait);
        ResultPage resultPage = new ResultPage(driver, explicitWait);

        mainPage.search();

        String expectDeparturePrice = resultPage.getTxtDeparturePrice();
        String expectReturnPrice = resultPage.getTxtReturnPrice();

        Assert.assertTrue(expectDeparturePrice.contains("₹ 8,484"));
        Assert.assertTrue(expectReturnPrice.contains("₹ 6,687"));
    }
}
