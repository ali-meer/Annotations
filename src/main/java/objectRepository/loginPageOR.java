package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageOR {

    WebDriver driver;

    public loginPageOR(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul/li/a/span[contains(text(),'sign in')]")
    private WebElement SignInBtn;

    public void SetsigninBtn() throws InterruptedException {
        Thread.sleep(3000);
        SignInBtn.click();
    }

    @FindBy(name = "login")
    private WebElement usernameTxt;

    public void SetUsernameTxt(String username) throws InterruptedException {
        Thread.sleep(3000);
        usernameTxt.sendKeys(username);
    }

    @FindBy(name = "token")
    private WebElement passwordTxt;

    public void SetpasswordTxt(String password) throws InterruptedException {
        Thread.sleep(3000);
        passwordTxt.sendKeys(password);
    }

    @FindBy(xpath = "//input[@value='Sign In']")
    private WebElement loginSigninBtn;

    public void SetloginSigninBtn() throws InterruptedException {
        Thread.sleep(3000);
        loginSigninBtn.click();
    }

    public void getTitle() throws InterruptedException {
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("Title of the Web Page is: " + title);

        if(driver.getTitle().equalsIgnoreCase("Dashboard | CK-12 Foundation")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }



}
