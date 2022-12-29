package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ftest {
//    public static void main(String[] args) {
//       int a = 10;
//        int b=5;
//        int expected = 20;
//        int actual= a+b;
        //verification
 //       if (actual==expected) {
 //           System.out.println("step 1 pass");
//        }else{
//            System.out.println("step 1 fail");
 //       }
        //assertion
 //       Assert.assertEquals(expected,actual);
 //       System.out.println("step 2");
//    }
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("driver.chromedriver", "C:/Users/Dell-Stw/Downloads/chromedriver_win32/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("browser open success");
    }
    @After
    public void close(){
        driver.close();
        System.out.println("browser close success");
    }
    @Test
    public void test1 () {
       // setUp(); grace a after et before on a pas besoin d'appeler la méthode
        String expected = "Swag Labs";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        System.out.println("page title validation success");
        //close();
    }
    @Test
    public void test2 () {
        //setUp();
        String expected = "Swag Labs";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        System.out.println("page title validation success");
        //username
        WebElement usernameField=driver.findElement(By.id("user-name"));
        boolean userNameIsDisplayed=usernameField.isDisplayed();
        //Assert.assertEquals(true,userNameIsDisplayed); //la même méthode que celui en bas
        Assert.assertTrue(userNameIsDisplayed);
        System.out.println("username field is displayed");
        //password
        WebElement passwordField=driver.findElement(By.id("password"));
        boolean passwordIsDisplayed=usernameField.isDisplayed();
        Assert.assertTrue(passwordIsDisplayed);
        System.out.println("password field is displayed");
        //login button
        WebElement loginButton=driver.findElement(By.id("login-button"));
        boolean loginButtonISDisplayed= loginButton.isDisplayed();
        Assert.assertTrue(loginButtonISDisplayed);
        System.out.println("login button is displayed");

        //close();
    }

  //      int a = 10;
  //      int b = 5;

  //      int expected =15;
   //     int actual = a+b;
        //assertion
   //     Assert.assertEquals(expected,actual);


  //  @Test
 //   public static void test2(){
 //       int a = 25;
 //       int b = 25;

  //      int expected =50;
  //      int actual = a+b;
        //assertion
  //      Assert.assertEquals(expected,actual);
 //   }
}
