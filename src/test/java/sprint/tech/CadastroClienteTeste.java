package sprint.tech;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.Spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroClienteTeste {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driverss/chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://www.google.com.br");	
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("e2e treinamentos");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).submit();
		
		fail("Not yet implemented");
	}

	public void validarBarraRolagem(By elementos, String textoEsperado) {

		WebElement element = driver.findElement(elementos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(elementos);

		String texto = driver.findElement(elementos).getText();
		assertEquals(textoEsperado, texto);

	}
}
