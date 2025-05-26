package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class $13_FileUploadTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Load the HTML page
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);
            Thread.sleep(2000);
            // Prepare a dummy file to upload
            File uploadFile = new File(userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/dummyfile.txt");

            // Locate the file input and send the file path
            WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
            fileInput.sendKeys(uploadFile.getAbsolutePath());

            // Click the upload button (simulate file upload)
            driver.findElement(By.id("file-submit")).click();

            System.out.println("File uploaded successfully.");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
