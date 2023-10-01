package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class find {
    public void a(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/");

     //   @FindBy(how = How.ID,using = "email");
      //  @FindBy(how = How.ID,using = "pass");


    }
    public static void main(String[] args){
        find f= new find();
        f.a();

    }
}
