import basicWeb.DropdownSelect;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Utility;

import java.util.concurrent.TimeUnit;

public class LogInToNopCommerce {
    private WebDriver driver;
   // private JavascriptExecutor js;
    private Utility utility;
    private DropdownSelect sel;

    @Before
    public void setUp(){
        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
     //   js = (JavascriptExecutor)driver;
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        utility = new Utility(driver);
        sel = new DropdownSelect(driver);
    }
    @Test
    public void userShouldNavigateLoginPageSuccessfully(){
        WebElement logIn = driver.findElement(By.linkText("Log in"));
        logIn.click();
      //  js.executeScript("window.scrollBy(0,-700)");

        //now we are comparing expected text which is already exist on website and we bring it through test case
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = welcomeText.getText();

        //this is the verification code in Junit which we have to use and now we have
        Assert.assertEquals(expectedText,actualText);
     if (expectedText.equals(actualText)){
         System.out.println("Test passed");
     }else {
         System.out.println("Test failed");
     }

    }
    @Test
    public void userShouldLoginSuccessfully(){
        // Two ways to click on elements
        //1. by creating web element and click method
//        WebElement logIn = driver.findElement(By.className("ico-login"));
//        logIn.click();
        //2. by making another class and creating object and calling through it
        utility.clickOnElements(By.className("ico-login"));

//        WebElement emailField = driver.findElement(By.id("Email"));
//        emailField.sendKeys("abc@gmail.com");
        utility.sendKeysToElements(By.id("Email"),"abc@gmail.com");

//        WebElement passwordField = driver.findElement(By.id("Password"));
//        passwordField.sendKeys("abc123");
        utility.sendKeysToElements(By.id("Password"),"abc123");

//        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
//        logInBtn.click();
        utility.clickOnElements(By.xpath("//input[@class='button-1 login-button']"));

        String expectedtext ="Welcome to our store";
        String actualtext = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText();

        Assert.assertEquals(actualtext,expectedtext);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
