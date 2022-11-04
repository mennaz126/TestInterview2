import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static java.lang.System.out;


public class Test {
    WebDriver driver = new ChromeDriver();



    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opd.portal.stage.discoveryeducationme.com/login/");
        driver.manage().window().maximize();
        WebElement Learner = driver.findElement(By.xpath("//button[contains(text(),'Learner')]"));

        WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement Login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        username.sendKeys("Learner");
        Password.sendKeys("123456");
        Login.click();
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/img[1]"));
        WebElement Logout = driver.findElement(By.xpath("//span[contains(text(),'logout')]"));
        dropdown.click();
        Thread.sleep(1000);
        Logout.click();
        Thread.sleep(3000);
        WebElement Mentor = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[1]/button[2]"));
        Mentor.click();
        WebElement username2 = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement Password2 = driver.findElement(By.xpath("//input[@id='password']"));
        username2.sendKeys("Mentor");
        Password2.sendKeys("123456");
        WebElement Login2=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        Login2.click();
        Thread.sleep(3000);
        WebElement logoutmentor = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/section[2]/div[2]/div/div[1]/button/img"));
        logoutmentor.click();
        WebElement logoutbtn = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/section[2]/div[2]/div/div[2]/div/div/div"));
        logoutbtn.click();
        Thread.sleep(3000);
        WebElement Editor = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[1]/button[3]"));
        Editor.click();
        WebElement username3 = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement Password3 = driver.findElement(By.xpath("//input[@id='password']"));
        username3.sendKeys("Editor");
        Password3.sendKeys("123456");
        WebElement Login3=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        Login3.click();
        Thread.sleep(3000);
        driver.quit();
        }

    }

















