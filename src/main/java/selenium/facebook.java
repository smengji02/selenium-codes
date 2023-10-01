package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    void fb() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElementById("email").sendKeys("bantimengji@gmail.com");
        driver.findElementById("pass").sendKeys("tumhiho");
        // driver.findElementByXPath("//input[@id='pass']").sendKeys("12345678");
        // driver.findElementByXPath("//button[@id='u_0_5_XC']").click();
        //thread.sleep(5000);
        driver.findElementByName("login").click();
        Thread.sleep(5000);

        String exp_data = "(20+) Facebook";

        Thread.sleep(5000);
        String act_data = driver.getTitle();

        if (exp_data.equals(act_data)) {

            System.out.println("LOgged in Succcesfully");

        } else {

            System.out.println("Login Failed");
        }
        driver.close();
    }



    public static void main(String[] args) throws InterruptedException {
        facebook f =new facebook();
        f.fb();

    }



}
