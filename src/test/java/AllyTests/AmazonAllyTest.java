package AllyTests;

import com.deque.axe.AXE;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class AmazonAllyTest {
    WebDriver driver;
    private static final URL scriptURL = AmazonAllyTest.class.getResource("/axe.min.js");

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--window-size=1920x1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sendbox");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        String websiteUrl= "https://www.amazon.in/";
        driver.get(websiteUrl);
    }
    @Test
    public void amazonAllyTest(){

        JSONObject responseJson = new AXE.Builder(driver,scriptURL).analyze();
        JSONArray violations = responseJson.getJSONArray("violations");

        if(violations.length()==0){
            System.out.println("No Errors");
        }
        else{
            AXE.writeResults("amazonAllyTest",responseJson);
            Assert.assertTrue(false, AXE.report(violations));
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
