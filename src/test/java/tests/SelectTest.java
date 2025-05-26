package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);
            Thread.sleep(3000);
            WebElement selectElem = driver.findElement(By.id("selectInput"));
            Select select = new Select(selectElem);

            select.selectByVisibleText("Option 3");
            Thread.sleep(3000);

            System.out.println("Selected option: " + select.getFirstSelectedOption().getText());
        } finally {
            driver.quit();
        }
    }
}
