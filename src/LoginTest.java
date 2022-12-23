import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
{
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\btech\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLoginTest() throws InterruptedException
    {
        loginPage.validLogin();
    }

    @Test
    public void inValidLoginWithInvalidPasswordTest() throws InterruptedException
    {
        loginPage.invalidLoginWithInvalidPassword();
    }

    @Test
    public void inValidLoginWithInvalidEmailTest() throws InterruptedException
    {
        loginPage.inValidLoginWithInvalidEmail();
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

}