package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class amazon {
    void d () throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cricket Bat");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);

        List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        System.out.println(list.size());
        Thread.sleep(2000);

        WebElement w = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[3]"));
        String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[6]")).getText();
        System.out.println(price);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        WebElement mrfelement = driver.findElement(By.xpath("//img[@data-image-index='41']"));
        j.executeScript("arguments[0].scrollIntoView(true);",mrfelement);
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        FileUtils.copyFile(source, new File("./MRF.png"));

        driver.close();

    }
    public static void main(String[] args) throws Exception {
        amazon am = new amazon();
        am.d();

    }
}