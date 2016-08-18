package selenium.party;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by jwiczkowski on 17.08.16.
 */
public class facebook
{

    public static void main(String[] args)
    {

       WebDriver disco = new FirefoxDriver();
        disco.get("https://www.facebook.com");
        disco.manage().window().maximize();

        disco.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Selenium");
        disco.findElement(By.xpath("//*[@id=\"u_0_3\"]")).sendKeys("Testus");
        disco.findElement(By.xpath("//*[@id=\"u_0_5\"]")).sendKeys("dgprgw@gmail.com");
        disco.findElement(By.xpath("//*[@id=\"u_0_8\"]")).sendKeys("dgprgw@gmail.com");
        disco.findElement(By.xpath("//*[@id=\"u_0_a\"]")).sendKeys("partyboy");

        Select sel1= new Select(disco.findElement(By.xpath("//*[@id=\"day\"]")));
        sel1.selectByIndex(4);

        Select sel2= new Select(disco.findElement(By.xpath("//*[@id=\"month\"]")));
        sel1.selectByValue("5");

        Select sel3= new Select(disco.findElement(By.xpath("//*[@id=\"year\"]")));
        sel3.selectByVisibleText("1996");

        disco.findElement(By.xpath("//*[@id=\"u_0_e\"]")).click();
        disco.findElement(By.xpath("//*[@id=\"u_0_i\"]")).click();





    }




}
