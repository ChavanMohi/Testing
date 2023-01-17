package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {

public static void main(String[] args) throws InterruptedException {

	 System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Mohini\\Desktop\\chromedriver_win32\\chromedriver.exe");

  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();

  // Open Grocery website
  driver.get("file:///C:/Users/Mohini/Desktop/Project/index.html#products");
  System.out.println(driver.getTitle());
 
 
  driver.findElement(By.id("search-btn")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/form[1]/input")).sendKeys("Fresh orange");
  Thread.sleep(1000);
  driver.findElement(By.id("cart-btn")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/form[2]/input[1]")).sendKeys("er.mohinichavan@gmail.com");
  driver.findElement(By.xpath("/html/body/header/form[2]/input[2]")).sendKeys("Edubridge@#1234");
  driver.findElement(By.xpath("/html/body/header/form[2]/input[3]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();//Home
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();//for features
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[3]")).click(); // for products
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[4]")).click(); // for Categories
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[5]")).click();//for Review
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/header/nav/a[6]")).click();//for Blogs
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/section[7]/div[1]/div[4]/input[1]")).sendKeys("mohinichavan223@gmail.com");
  Thread.sleep(2000);
  //driver.findElement(By.xpath("/html/body/section[7]/div[1]/div[4]/input[2]")).click();
  driver.quit();
 }
}
