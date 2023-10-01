package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class word {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElementByXPath("//a[@data-testid='open-registration-form-button']").click();
        //driver.findElementByXPath(""//*[text()='Create new account']"").click();
        // sopln use for finding location and print the location of create new account
        //System.out.println(driver.findElementByXPath("//a[@data-testid='open-registration-form-button']").getLocation());
       /* Set<String> s=driver.getWindowHandles();
        System.out.println(s);
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            driver.switchTo().window(itr.next());
            System.out.println(driver.getTitle());
        }*/
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement fname=driver.findElementByXPath("//input[@name='firstname']");
        fname.sendKeys("Manoj");                            //uses for enter first name
        WebElement surname=driver.findElement(By.ByName.name("lastname"));
        surname.sendKeys("Diwakar");                        //use for enter last name
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("mdiwakar786@gmail.com");                //use for enter emailid

        WebElement newPassword=driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("mdiwakar");                       //use for enter the new password

        Select sdate=new Select(driver.findElement(By.xpath("//select[@id='day']")));

        Select smonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select syear=new Select(driver.findElement(By.xpath("//select[@id='year']")));


        sdate.selectByValue("1");
        smonth.selectByIndex(3);
        syear.selectByVisibleText("1990");
       /* driver.findElementByXPath("//label[text()='Female']").click();
        driver.findElementByXPath("//button[text()='Sign Up' and @name='websubmit']").click();
*/


    }
}




