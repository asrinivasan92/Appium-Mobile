import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CareerInsight extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.get("https://careerinsight-stage.burning-glass.com/client/selector");
		Thread.sleep(3000);
		
		//Login
	    WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/org-selector/div/div/div/div/div[1]/select"));
	    Select click = new Select(element);
	    click.selectByVisibleText("CSU");
	    driver.findElement(By.xpath("//*[@id=\"btn-get_started\"]")).click();
	    Thread.sleep(10000);
	    
	    //E1 and E2 page 
	    driver.switchTo().frame("ciiframe");
	    driver.findElement(By.xpath("//*[@id=\"path-selector\"]/div/div/ol/li[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"buttonNext\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"educationQuestion\"]/div/div/div/ol/li[3]")).click();
	    driver.findElement(By.xpath("//*[@id=\"buttonNext\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"combobox-input\"]")).sendKeys("Data Analyst (General)");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"combobox-input-listbox\"]/div[1]/ul/li")).click();
	    driver.findElement(By.xpath("//*[@id=\"buttonNext\"]")).click();
	    Thread.sleep(10000);	
	    driver.findElement(By.xpath("//*[@id=\"card-button-0\"]")).click();
	    driver.close();
	    Thread.sleep(30000);
	    
	    //E4 page
	    driver.switchTo().window("CDwindow-1");
	    driver.switchTo().frame("ciiframe");
	    driver.findElement(By.xpath("//*[@id=\"career-insight-container\"]/program-container/div/div[2]/div[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"careerPanel\"]/data-container/career-selector/div[1]/list-selector[1]/div[1]/div/div")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/perfect-scrollbar/div/div[1]/ul/li[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"careerPanel\"]/data-container/career-selector/div[1]/list-selector[2]/div[1]/div/div")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/perfect-scrollbar/div/div[1]/ul/li[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"learn-more-button\"]")).click();
	    driver.close();

	}

}
