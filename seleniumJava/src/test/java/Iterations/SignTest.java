package Iterations;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignTest {


	private WebDriver driver;

	@Test
	public void testVehicle() throws Exception {
		//instancia do webdriver e abertura do chrome + maximizar janela
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leonardo Zotto\\eclipse-workspace\\seleniumJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();

		//preenchimento aba "ENTER VEHICLE DATA" 
		driver.findElement(By.id("make")).sendKeys("Audi"); 
		driver.findElement(By.id("model")).sendKeys("Three-Wheeler"); 
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("03/17/2021");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[6]/select[1]")).sendKeys("2");		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[8]/select[1]")).sendKeys("3");
		driver.findElement(By.id("fuel")).sendKeys("Petrol");
		driver.findElement(By.id("payload")).sendKeys("10");
		driver.findElement(By.id("totalweight")).sendKeys("100");
		driver.findElement(By.id("listprice")).sendKeys("5000");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//preenchimento aba "ENTER INSURANT DATA" 
		driver.findElement(By.id("firstname")).sendKeys("Leonardo");
		driver.findElement(By.id("lastname")).sendKeys("Maia"); 
		driver.findElement(By.id("birthdate")).sendKeys("09/28/1998");
		driver.findElement(By.id("streetaddress")).sendKeys("aaaaaaaaaaaaaaaaaaa");
		driver.findElement(By.id("country")).sendKeys("Andorra");
		driver.findElement(By.id("zipcode")).sendKeys("10000000");
		driver.findElement(By.id("city")).sendKeys("10110");
		driver.findElement(By.id("occupation")).sendKeys("Farmer");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[5]")).click();
		driver.findElement(By.id("nextenterproductdata")).click();

		//preenchimento aba "ENTER PRODUCT DATA" 
		driver.findElement(By.id("startdate")).sendKeys("08/27/2021");
		driver.findElement(By.id("insurancesum")).sendKeys("3000000");
		driver.findElement(By.id("meritrating")).sendKeys("Bonus 1");
		driver.findElement(By.id("damageinsurance")).sendKeys("No Coverage");
		driver.findElement(By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]")).click();
		driver.findElement(By.id("courtesycar")).sendKeys("No");
		driver.findElement(By.id("nextselectpriceoption")).click();

		//TEMPO PARA CARREGAR PAGE
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//preenchimento aba "SELECT PRICE OPTION" 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[1]/span[1]")).click();
		driver.findElement(By.id("nextsendquote")).click();

		//preenchimento aba "SEND QUOTE" 
		driver.findElement(By.id("email")).sendKeys("asdads@hotmail.com");
		driver.findElement(By.id("phone")).sendKeys("41999994444");
		driver.findElement(By.id("username")).sendKeys("xxXCXXXXx");
		driver.findElement(By.id("password")).sendKeys("1!Dteste");
		driver.findElement(By.id("confirmpassword")).sendKeys("1!Dteste");
		driver.findElement(By.id("Comments")).sendKeys("No");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[7]/button[2]")).click();

		//verificar mensagem "SENDCING EMAIL SUCCESS!" .
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String validarMensagem = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/h2[1]")).getText();
		assertEquals("Sending e-mail success!", validarMensagem);
		Thread.sleep(6000);

		//fechamento navegador 
		driver.quit();

	}
}


