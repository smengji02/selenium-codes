package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printtop10 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // driver.findElementByName("q").sendKeys("youtube");

        //driver.findElementByName("btnK").click();

        List<WebElement> allLinks = driver.findElementsByTagName("a");

        //Traversing through the list and printing its text along with link address
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }

        // to print all buttons from a page


        List<WebElement> allbtns = driver.findElementsByTagName("buttons");

        for (WebElement btn : allbtns) {
            System.out.println(allbtns);
        }
    }
}
