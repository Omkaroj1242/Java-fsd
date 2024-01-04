package selenium.practiceproject11phase5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
    private WebDriver driver;
    SoftAssert soft = new SoftAssert();

    @BeforeTest
    public void beforeTest() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testEasy() {
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        soft.assertEquals(title, "Facebook – log in or sign up");
        soft.assertAll();  // This is necessary to ensure all soft assertions are checked
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
