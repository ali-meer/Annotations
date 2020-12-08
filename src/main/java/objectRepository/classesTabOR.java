package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class classesTabOR {
    WebDriver driver;

    public classesTabOR(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//header/header/nav/section/ul/li[2]/a[@title='Classes']")
    private WebElement getClassesTab;

    public void SetclassesTab() throws InterruptedException {
        Thread.sleep(3000);
        getClassesTab.click();
    }

    @FindBy(xpath = "//body/div[@id='content-container']/div[@id='content-area']/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")
    private WebElement getClassCode;

    public void SetclassCode(String classCode) throws InterruptedException {
        Thread.sleep(3000);
        getClassCode.sendKeys(classCode);
    }

    @FindBy(xpath = "//body/div[@id='content-container']/div[@id='content-area']/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
    private WebElement getJoinClass;

    public void SetJoinclass() throws InterruptedException {
        Thread.sleep(3000);
        getJoinClass.click();
    }

}
