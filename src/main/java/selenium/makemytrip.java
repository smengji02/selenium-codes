package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class makemytrip {
    void a() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
        driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
        driver.switchTo().defaultContent();

        //driver.findElement(By.xpath("//div[@class='imageSlideContainer']")).click();

        Actions actions = new Actions(driver);
        Action action = actions.moveByOffset(1138, 387).click().build();
        action.perform();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement we = driver.findElement(By.xpath("//h3[@data-test='appDownloadWrapper_heading']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",we);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='topbarInputBox footerInput']")).sendKeys("9988664433");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        FileUtils.copyFile(source, new File("./mobile number.png"));
        driver.close();

    }
    public static void main(String[] agrs) throws InterruptedException, IOException {
        makemytrip mt = new makemytrip();
        mt.a();

    }
}
