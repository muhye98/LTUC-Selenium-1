import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyClass {

    WebDriver driver = new ChromeDriver();
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void myBeforeTest() {
        driver.get("https://www.almosafer.com/en?ncr=1");
    }


    @Test()
    public void myTest() {

        String currency = driver.findElement(By.className("sc-dRFtgE")).getText();
        softAssert.assertEquals(currency, "SAR");

    }
    @Test()
    public void myTest1() {

        String Language = driver.findElement(By.className("sc-gkFcWv")).getText();
        softAssert.assertEquals(Language, "العربية");

    }

    @Test()
    public void myTest2() {
        boolean contains = driver.findElement(By.id("uncontrolled-tab-example-tab-flights")).getAttribute("class").contains("active");
        softAssert.assertEquals(contains, true);

    }


    @AfterTest
    public void myAfterTest() {
    }

}
