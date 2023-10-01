package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class youtube {
    void b() throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//yt-formatted-string[@title='Music']")).click();
        String expTabTitle="Music";
        String tabTitle = driver.findElement(By.xpath("//yt-formatted-string[@title='Music']")).getText();
        System.out.println(tabTitle);
        Assert.assertEquals(tabTitle,expTabTitle);

        TakesScreenshot t = (TakesScreenshot) driver;
        File source = t.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        FileUtils.copyFile(source, new File("./music.png"));

        driver.close();

    }
    public static void main(String[] args) throws IOException {
       youtube yt =  new youtube();
       yt.b();


    }
}
