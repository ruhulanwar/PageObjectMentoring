import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    //Constructor
    LoginPage(WebDriver rafiq)
    {
        driver = rafiq;
        PageFactory.initElements(driver,this);
    }

    //=========== Page Object start ================//
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;

    //=========== End of Page Object ================//

    public void validLogin()
    {
        email.sendKeys("abc@gmail.com");
        password.sendKeys("moga123");
        loginButton.click();
    }

    public void invalidLoginWithInvalidPassword()
    {
        email.sendKeys("abc@gmail.com");
        password.sendKeys("moga123");
        loginButton.click();
    }

    public void inValidLoginWithInvalidEmail()
    {
        email.sendKeys("abc@gmail.com");
        password.sendKeys("mogasdkjana123");
        loginButton.click();
    }

}
