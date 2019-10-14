package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
    private WebDriver driver;

    public Utility(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnElements(By by) {
        driver.findElement(by).click();
    }
    public void sendKeysToElements(By by,String str){
        driver.findElement(by).sendKeys(str);
    }

}
