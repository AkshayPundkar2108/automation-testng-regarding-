package all_selenium_code;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class all_code {

	void invoke_browser(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	void first_radio_Button_click(WebDriver driver) {
		WebElement radiobutton = driver.findElement(By.xpath("//*[@value='radio1']"));
		radiobutton.click();
	}

	// Or

	void diffrent_click_on_the_radio_button(WebDriver driver) {
		List<WebElement> radioButton = driver.findElements(By.xpath("//*[@name='radioButton']"));
		for (int i = 3; i < radioButton.size(); i++) {
			radioButton.get(i).click();
		}
	}

	void static_dropdown(WebDriver driver) {
		WebElement dropdownList = driver.findElement(By.xpath("//*[@name='dropdown-class-example']"));
		dropdownList.click();
		// using select class we handled the dropdown
		Select dropdown = new Select(dropdownList);
		dropdown.selectByIndex(1);// 1st dropdown value is selecetd
		String dd1Text = dropdown.getFirstSelectedOption().getText();
		System.out.println(dd1Text);
		dropdown.selectByValue("option2");
		String dd1Text2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(dd1Text2);
	}

	void check_box(WebDriver driver) {
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		checkbox1.click();
	}

	void multiple_click_on_checkBox(WebDriver driver) {
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (int i = 0; i < checkbox.size(); i++) {
			checkbox.get(i).click();
		}
	}

	// or
	void perticlualr_checkbox(WebDriver driver) {
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (int i = 1; i <= 2; i++) {
			checkbox.get(i).click();
		}
	}

	void handle_alert(WebDriver driver) {
		WebElement textbox = driver.findElement(By.xpath("//*[@name='enter-name']"));
		textbox.sendKeys("akshay");
		WebElement alertbutton = driver.findElement(By.xpath("//*[@value='Alert']"));
		alertbutton.click();
		Alert alert = driver.switchTo().alert();
		String alertTextMessage = alert.getText();
		String alertTextMessage1 = "Hello akshay, share this practice page and share your knowledge";
		System.out.println(alertTextMessage);
		if (alertTextMessage.equals(alertTextMessage1))
			System.out.println("True");
		else {
			System.out.println("false");
		}
		alert.accept();
	}

	void handle_alert1_confirmation(WebDriver driver) throws InterruptedException {
		WebElement textbox = driver.findElement(By.xpath("//*[@name='enter-name']"));
		textbox.sendKeys("akshay");
		WebElement alertbutton = driver.findElement(By.xpath("//*[@value='Confirm']"));
		alertbutton.click();
		Alert alert = driver.switchTo().alert();
		String ConfirmationText = alert.getText();
		System.out.println(ConfirmationText);
		Thread.sleep(2000);
		alert.dismiss();
	}

	void Window_handle(WebDriver driver) {
		String mainwindow = driver.getWindowHandle();
		WebElement newWindowbutton = driver.findElement(By.xpath("//*[@id='openwindow']"));
		newWindowbutton.click();
		Set<String> newWindow = driver.getWindowHandles();
		Iterator it= newWindow.iterator();
		while (it.hasNext()) {
			String child = (String) it.next();
			if (!newWindow.equals(child)) {
				driver.switchTo().window(child);
				driver.manage().window().maximize();
			}
		}
		
			// or
		
//		Set<String> s= driver.getWindowHandles();
//		Iterator<String> it = s.iterator();
//		it.next();
//		String w2nd = it.next();
//		driver.switchTo().window(w2nd);
//		driver.manage().window().maximize();
	
	}

	void close_script(WebDriver driver) {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		all_code o = new all_code();
		o.invoke_browser(driver);
//		o.first_radio_Button_click(driver);
//		o.diffrent_click_on_the_radio_button(driver);
//		o.static_dropdown(driver);
//		o.check_box(driver);
//		o.multiple_click_on_checkBox(driver);
//		o.perticlualr_checkbox(driver);
//		o.handle_alert(driver);
//		o.handle_alert1_confirmation(driver);
		o.Window_handle(driver);
//		o.close_script(driver);
	}

}
