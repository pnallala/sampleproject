package flights.sel; 
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FlightsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void flights() {
    driver.get("https://demo.guru99.com/test/newtours/");
    driver.findElement(By.linkText("Flights")).click();
    driver.findElement(By.name("passCount")).click();
    {
      WebElement dropdown = driver.findElement(By.name("passCount"));
      dropdown.findElement(By.xpath("//option[. = '2']")).click();
    }
    driver.findElement(By.name("fromPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fromPort"));
      dropdown.findElement(By.xpath("//option[. = 'Seattle']")).click();
    }
    driver.findElement(By.name("fromMonth")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fromMonth"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.name("fromDay")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fromDay"));
      dropdown.findElement(By.xpath("//option[. = '19']")).click();
    }
    driver.findElement(By.name("toPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("toPort"));
      dropdown.findElement(By.xpath("//option[. = 'New York']")).click();
    }
    driver.findElement(By.name("toMonth")).click();
    {
      WebElement dropdown = driver.findElement(By.name("toMonth"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.name("toDay")).click();
    {
      WebElement dropdown = driver.findElement(By.name("toDay"));
      dropdown.findElement(By.xpath("//option[. = '30']")).click();
    }
    driver.findElement(By.name("servClass")).click();
    driver.findElement(By.name("airline")).click();
    driver.findElement(By.name("findFlights")).click();
  }
}
