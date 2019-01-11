package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Webdrivers\\MicrosoftWebDriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("http://dev-platform.kino-mo.com/");

        WebElement elementlog = driver.findElement(By.xpath("//input[@id='input-login']"));
        elementlog.sendKeys("a.nechitaylo@hypervsn.com");

        WebElement elementpas = driver.findElement(By.xpath("//input[@id='input-password']"));
        elementpas.sendKeys("4eb@z9w7");

        WebElement button = driver.findElement(By.xpath("//button[@id='loginButton']"));
        button.click();

    }
}
