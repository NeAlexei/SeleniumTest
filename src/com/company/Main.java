package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://dev-platform.kino-mo.com/");

//        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");

        WebElement element=driver.findElement(By.xpath("//input[@id='input-login']"));
        element.sendKeys("a.nechitaylo@hypervsn.com");

        WebElement element=driver.findElement(By.xpath("//input[@id='input-password']"));
        element.sendKeys("4eb@z9w7");

        WebElement button=driver.findElement(By.xpath("//button[@id='loginButton']"));
        button.click();

    }
}
