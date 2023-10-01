package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class utube {
    void music() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElementByXPath("//input[@name='search_query'][1]").sendKeys("Heeriye");
        Thread.sleep(3000);
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@id='video-title' and contains(@title,'Heeriye (Official Video)')])[1]")).click();
        TakesScreenshot st = (TakesScreenshot) driver;
        File source = st.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        FileUtils.copyFile(source, new File("./heeriye.png"));
       // driver.close();

    }

    public static void main(String[] args) throws Exception {
        utube ot = new utube();
        ot.music();

    }
}
