package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xc {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement elm = driver.findElement(By.xpath("//a[text()='Gmail']"));
        Actions act = new Actions(driver);
        act.moveByOffset(elm.getLocation().getX() + 1, elm.getLocation().getY() + 1);
        act.perform();


    }
}
