package objectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class libraryTabOR {
   WebDriver driver;

    public libraryTabOR(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul/li[3]/a[contains(text(),'Library')]")
    private WebElement libraryBtn;

    public void SetlibraryBtn() throws InterruptedException {
        Thread.sleep(3000);
        libraryBtn.click();
    }

    @FindBy(xpath = "//a[@id='dropdown-create']")
    private WebElement createNewBtn;

    public void SetcreateNewBtn() throws InterruptedException {
        Thread.sleep(3000);
        createNewBtn.click();
    }

    @FindBy(xpath = "//ul/li[4]/a[@title='New Quiz']")
    private WebElement quizBtn;

    public void SetquizBtn() throws InterruptedException {
        Thread.sleep(3000);
        quizBtn.click();
    }



    public void findIFrame(String title, String enterDescription) throws InterruptedException {
        System.out.println("iframe...");
    List<WebElement> iFrameList = driver.findElements(By.tagName("iframe"));
    int count = iFrameList.size();
        System.out.println(count);

    for(int i=0; i<count; i++){
        driver.switchTo().frame(i);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='testTitle']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='testDescription']")).sendKeys(enterDescription);
        driver.findElement(By.xpath("//body/section[@id='testContent']/div[2]/div[1]/div[2]/ul[1]/form[1]/li[1]/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'3')]")).click();
        driver.findElement(By.xpath("//body/section[@id='testContent']/div[2]/div[1]/div[2]/ul[1]/form[1]/li[2]/div[2]/div[1]/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'min')]")).click();
        driver.findElement(By.xpath("//input[@id='languageSelector']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese-pt')]")).click();
        driver.switchTo().defaultContent();
    }


    }
}
