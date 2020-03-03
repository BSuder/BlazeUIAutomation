
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    WebDriver driver;

//    @BeforeClass
    void setupBrowserBeforeEachTest() {

        String baseUrl = "http://blazedemo.com/index.php";

        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
    }

    @Test
    void doSampleTest() {
        setupBrowserBeforeEachTest();//        driver.get();
        new Helper().readMainPageURL();
    }


}
