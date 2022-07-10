import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver", "/Users/kawaiiuwu/IdeaProjects/DemoAutomation/core/chromedriver_103");

        //WebDriver class , key = driver with value new ChromeDriver()
        //String os = System.getProperty("os.name").toLowerCase();
        WebDriver driver = new ChromeDriver();

        /*if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "/Users/kawaiiuwu/IdeaProjects/DemoAutomation/core/chromedriver_103");
        } else {
            System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
        }*/

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com");


        WebElement input = driver.findElement(By.xpath("//input[@aria-label=Search]"));
        input.click();

    }
}
