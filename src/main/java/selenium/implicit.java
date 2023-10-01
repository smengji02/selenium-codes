package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("userName")).sendKeys("srinivas");
        driver.findElement(By.id("userEmail")).sendKeys("smengji@gmail.com");
        driver.close();




    }
}
