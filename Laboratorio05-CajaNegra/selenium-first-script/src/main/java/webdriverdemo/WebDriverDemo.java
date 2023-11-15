package webdriverdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
    
	private WebDriver driver;
	
    @Before
    public void setUp() {
        // Configurar el sistema para utilizar ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Documents\\chrome-win64\\chrome-win64\\chrome.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void testPercentageCalculator() {
    	driver.manage().window().maximize();
    	
        // Abrir la página web de la calculadora
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement number20 = driver.findElement(By.id("cpar1"));
        number20.clear();
        number20.sendKeys("20");
        
        WebElement number50 = driver.findElement(By.id("cpar2"));
        number50.clear();
        number50.sendKeys("50");                       

    }
    
    @Test
    public void testPercentageCalculatorCommonPhrases() {
    	driver.manage().window().maximize();
    	// Abrir la página web de la calculadora
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement formulario = driver.findElement(By.name("calc"));
        
        WebElement number10 = formulario.findElement(By.name("c21par1"));
        number10.clear();
        number10.sendKeys("10");
        
        WebElement number50 = formulario.findElement(By.name("c21par2"));
        number50.clear();
        number50.sendKeys("50");
        
        /*
        WebElement number20 = formulario.findElement(By.name("c22par1"));
        number20.clear();
        number20.sendKeys("20");
        
        WebElement number40 = formulario.findElement(By.name("c22par2"));
        number40.clear();
        number40.sendKeys("40");
         */
    }
    
    @Test
    public void testPercentageDifferenceCalculator() {
    	driver.manage().window().maximize();
    	// Abrir la página web de la calculadora
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement formulario = driver.findElement(By.name("calform3"));
        
        WebElement number10 = formulario.findElement(By.name("c3par1"));
        number10.clear();
        number10.sendKeys("10");
        
        WebElement number50 = formulario.findElement(By.name("c3par2"));
        number50.clear();
        number50.sendKeys("80");
        
    }
    
    @Test
    public void testPercentageChangeCalculator() {
    	driver.manage().window().maximize();
    	// Abrir la página web de la calculadora
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement formulario = driver.findElement(By.name("calform2"));
        
        WebElement number10 = formulario.findElement(By.name("c2par1"));
        number10.clear();
        number10.sendKeys("10");
        
        WebElement number50 = formulario.findElement(By.name("c2par2"));
        number50.clear();
        number50.sendKeys("50");
        
    }
    
    @After
    public void tearDown() {
        // Cerrar el navegador al finalizar cada prueba
        if (driver != null) {
            driver.quit();
        }
    }
}
