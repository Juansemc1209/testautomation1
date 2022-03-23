package com.advantange;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Advantage {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='menuUser']")).click();
        Thread.sleep(3000);
        System.out.println("Pruebas");

        /*
        driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys("ttianmc1209");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).sendKeys("Juan12");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).sendKeys("juan@gmail.com");
        driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys("Juan12");
        driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).sendKeys("Ceballos");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys("JuanCeb");
        driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).sendKeys("1235896561");
        driver.findElement(By.xpath("//select[@name='countryListboxRegisterPage']")).sendKeys("Ceballos");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='countryListboxRegisterPage']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Bolivia')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).sendKeys("Cali");
        driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).sendKeys("Juanse2002_12");
        driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).sendKeys("Cali");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).sendKeys("7600001");
        driver.findElement(By.xpath("//input[@name='i_agree']")).click();
        driver.findElement(By.xpath("//button[@id='register_btnundefined']")).click();
        Thread.sleep(10000);
        */
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ttianmc1209");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Juan12");
        driver.findElement(By.xpath("//button[@id='sign_in_btnundefined']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@id='see_offer_btn']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='shoppingCartLink']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='checkOutPopUp']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='next_btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='pay_now_btn_SAFEPAY']")).click();
        Thread.sleep(5000);
        String mensaje = driver.findElement(By.xpath("//span[@class='roboto-regular ng-scope']")).getText();
        Assert.assertEquals("Thank you for buying with Advantage", mensaje);
        System.out.println(mensaje);
    }

    @After
    public void close() {
        driver.close();
    }
}
