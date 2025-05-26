package Concept_6_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("🔍 Testing the 8 locators.");
            // Get the current directory and build the file URL for test_form.html
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/Locators_First_Page.html";
            driver.get(filePath);
            Thread.sleep(2000);

            

            // 1️⃣ By.id
            WebElement idField = driver.findElement(By.id("idField"));
            idField.sendKeys("testId");
            System.out.println("🔍 ID Locator tested successfully");
            Thread.sleep(500);

            // 2️⃣ By.name
            WebElement nameField = driver.findElement(By.name("nameField"));
            nameField.sendKeys("testName");
            System.out.println("🔍 Name Locator tested successfully");
            Thread.sleep(500);

            // 3️⃣ By.className
            WebElement classField = driver.findElement(By.className("classField"));
            classField.sendKeys("testClass");
            Thread.sleep(500);

            // 4️⃣ By.tagName
            WebElement textArea = driver.findElement(By.tagName("textarea"));
            textArea.sendKeys("This is a test comment.");
            System.out.println("🔍 tagName Locator tested successfully");
            Thread.sleep(500);

            // 5️⃣ By.cssSelector
            WebElement cssField = driver.findElement(By.cssSelector("#cssField"));
            cssField.sendKeys("testCss");
            System.out.println("🔍 cssSelector Locator tested successfully");
            Thread.sleep(500);

            // 6️⃣ By.xpath
            WebElement xpathField = driver.findElement(By.xpath("//input[@data-xpath='true']"));
            xpathField.sendKeys("testXpath");
            System.out.println("🔍 Xpath Locator tested successfully");
            Thread.sleep(500);


            // 7️⃣ By.partialLinkText — Click link to go to partial_page.html
            WebElement partialLink = driver.findElement(By.partialLinkText("Navigate to Second"));
            partialLink.click();
            System.out.println("🔍 partialLinkText Locator tested successfully");
            Thread.sleep(1500);

            System.out.println("🔍 Navigated to partial_page.html");

            // 8️⃣ By.linkText — Click link to go to third_page.html
            WebElement fullLink = driver.findElement(By.linkText("Navigate to Third Web Page"));
            fullLink.click();
            System.out.println("🔍 LinkText Locator tested successfully");
            Thread.sleep(500);

            System.out.println("✅ 8 locators tested successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
