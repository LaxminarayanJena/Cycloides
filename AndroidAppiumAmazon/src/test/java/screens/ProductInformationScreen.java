package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductInformationScreen extends ScreenBase {

	@AndroidFindBy(xpath = "//*[@text='Already a customer? Sign in']")
	public WebElement SignIn;

	public ProductInformationScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void getproductinformation() throws InterruptedException {
	
		Thread.sleep(3000);
		scroll("See All Buying Options");
		 driver.findElement(By.xpath("//*[@text='See All Buying Options']")).click();
		 driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
		 Thread.sleep(3000);
		 
	}

}
