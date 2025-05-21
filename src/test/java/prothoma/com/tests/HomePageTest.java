package prothoma.com.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import prothoma.com.basedriver.PageDriver;
import prothoma.com.pages.HomePage;
import prothoma.com.utilities.CommonMethods;
import prothoma.com.utilities.ExtentFactory;

import java.io.IOException;

public class HomePageTest extends HomePage {
    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @BeforeClass
    public void openURL() throws InterruptedException {
        PageDriver.getCurrentDriver().get(url);
        Thread.sleep(7000);
        report= ExtentFactory.getInstance();
        parentTest=report.createTest("<p style=\"color:green; font-size:14px\"><b>Prothoma</b></P>").assignAuthor("Tester koli").assignDevice("windows");
    }
    @Test
    public void orangeHRM_login() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:green; font-size:14px\"><b>Click Author</b></P>");
        HomePageTest hpobj=new HomePageTest();
        hpobj.clickAuthorMenu();

    }
    @AfterClass
    public void report(){
        report.flush();
    }
}
