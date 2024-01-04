package selenium.practiceproject4phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws InterruptedException {
        // Set up the WebDriver for Chrome
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Amazon website
        driver.get("https://www.amazon.in/");

        // Step 1.4.1: Edit box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("samsung"); // Enter a value

        // Step 1.4.3: Button
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        searchButton.click(); // Click the button

        // Wait for 2 seconds (for demonstration purposes)
        Thread.sleep(2000);

        // Step 1.4.2: Link
        WebElement link = driver.findElement(By.linkText("Example Link"));
        link.click(); // Click the link
        System.out.println("Link Name: " + link.getText()); // Return the link name

        // Step 1.4.4: Image, image link, an image button
        WebElement image = driver.findElement(By.id("imageId"));
        image.click(); // Click the image

        // Step 1.4.5: Text area
        WebElement textArea = driver.findElement(By.id("textAreaId"));
        System.out.println("Text Area Content: " + textArea.getText()); // Capture text area content

        // Step 1.4.6: Checkbox
        WebElement checkBox = driver.findElement(By.id("checkBoxId"));
        checkBox.click(); // Select the checkbox
        System.out.println("Checkbox Selected: " + checkBox.isSelected()); // Check if the checkbox is selected

        // Step 1.4.7: Radio button
        WebElement radioButton = driver.findElement(By.id("radioButtonId"));
        radioButton.click(); // Select the radio button
        System.out.println("Radio Button Selected: " + radioButton.isSelected()); // Check if the radio button is selected

        // Step 1.4.8: Dropdown list
        Select dropdown = new Select(driver.findElement(By.id("dropdownId")));
        dropdown.selectByVisibleText("Option 1"); // Select an item from the dropdown

        // Step 1.4.9: Web table /HTML table
        WebElement table = driver.findElement(By.id("tableId"));
        System.out.println("Cell Value: " + table.findElement(By.xpath("//tr[2]/td[3]")).getText()); // Get cell value

        // Step 1.4.10: Frame
        driver.switchTo().frame("frameName"); // Switch to frame by name
        // Perform operations inside the frame
        driver.switchTo().defaultContent(); // Switch back to the top window

        // Step 1.4.11: Switching between tabs in the same browser window
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform(); // Open a new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Switch to the newly opened tab
        // Perform operations in the new tab
        driver.switchTo().window(tabs.get(0)); // Switch back to the original tab

        // Close the browser
        driver.quit();
    }
}
