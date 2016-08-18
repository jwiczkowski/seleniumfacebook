package selenium.Facebooklogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

/**
 * Created by jwiczkowski on 17.08.16.
 */
public class Facebooklogin
{


    public static void main(String[] args) throws InterruptedException {


        System.out.println("Du bist dabei dich bei Facebook zu Registrieren");
        System.out.println("Fülle die Antworten den Anforderungen entsprechend aus, trage dabei natürlich nicht deine echten Daten ein ;)");

        Thread.currentThread().sleep(3000);

        Scanner vorname = new Scanner(System.in);
        System.out.println("Vorname:");
        String vornahme = vorname.next();


        Scanner nachname = new Scanner(System.in);
        System.out.println("Nachname:");
        String nachnahme = nachname.next();

        Scanner email = new Scanner(System.in);
        System.out.println("Email:");
        String emaihl = email.next();

        Scanner passwort = new Scanner(System.in);
        System.out.println("Passwort, mit mindestends 6 Zeichen:");
        String passwortht = passwort.next();

        Scanner Geburtstag = new Scanner(System.in);
        System.out.println("Dein Geburtsdatum.");
        Thread.currentThread().sleep(1000);
        System.out.println("Tag : ");
        String tag = Geburtstag.next();
        System.out.println("Monat, als Zahl:");
        String monat = Geburtstag.next();
        System.out.println("Jahr : ");
        String jahr = Geburtstag.next();


       WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(vornahme);
        driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).sendKeys(emaihl);
        driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).sendKeys(emaihl);
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).sendKeys(passwortht);

        Select sel1= new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        sel1.selectByVisibleText(tag);

        Select sel2= new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        sel2.selectByVisibleText(monat);

        Select sel3= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        sel3.selectByVisibleText(jahr);

        driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_i\"]")).click();

    }
}
