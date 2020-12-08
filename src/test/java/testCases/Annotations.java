package testCases;

import baseClass.browserSetup;
import objectRepository.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Annotations {

    WebDriver driver;
    loginPageOR lp;
    classesTabOR ct;
    libraryTabOR lt;
    File file;
    FileInputStream fis;
    Properties prop;


    @BeforeMethod
    public void homeURL() throws IOException, InterruptedException {
        file = new File(".\\config\\file.properties");
        fis = new FileInputStream(file);
        prop = new Properties();
        prop.load(fis);

        Thread.sleep(3000);
        browserSetup bs = new browserSetup();
        driver = bs.launchBrowser(prop.getProperty("browsername"), prop.getProperty("baseURL") );
        Thread.sleep(3000);


    }


    @Test
    public void loginPageTest() throws InterruptedException {
    lp = new loginPageOR(driver);

    lp.SetsigninBtn();
    lp.SetUsernameTxt(prop.getProperty("username"));
    lp.SetpasswordTxt(prop.getProperty("password"));
    lp.SetloginSigninBtn();
    lp.getTitle();

    ct = new classesTabOR(driver);

    ct.SetclassesTab();
    ct.SetclassCode(prop.getProperty("classCode"));
    ct.SetJoinclass();

    lt = new libraryTabOR(driver);

    lt.SetlibraryBtn();
    lt.SetcreateNewBtn();
    lt.SetquizBtn();
    lt.findIFrame(prop.getProperty("title"), prop.getProperty("enterDescription") );

    }

    @AfterMethod
    public void closeURL(){
    browserSetup bs = new browserSetup();
    bs.driver.close();
    }




}
