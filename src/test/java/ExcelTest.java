import Utilities.CreateWB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelTest {
    WebDriver driver;
    @Test(dataProvider = "testdata")
    public void demoCLass(String username, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.jkyog.org/");
        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wppb-submit")).click();
    }
    @AfterMethod
    void quitbrowser() {
        driver.quit();
    }

   @DataProvider(name="testdata")
    public Object[] [] testDataExample() throws IOException {

       CreateWB config = null;
       try {
           config = new CreateWB("C:\\Users\\HP\\IdeaProjects\\MyJavaProject\\src\\test\\java\\resources\\Book1.xlsx");
       }
       catch (IOException e) {
           throw new RuntimeException(e);
       }
       int rows = config.getRowCount(0);
       Object[][] signin = new Object[rows][2];

       for (int i=0;i<rows;i++)
       {
           signin[i][0] = config.getData(0,i,0);
           signin[i][0] = config.getData(0,i,1);
       }
    return signin;
    }
}
