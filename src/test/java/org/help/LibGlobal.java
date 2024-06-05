package org.help;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Select s;
	public static Robot r;
	public static Actions ac;
	public static JavascriptExecutor js;
	public static Alert a;

	public static void openchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
public static void openedge() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	

}
	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWin() {
		driver.manage().window().maximize();

	}

	public static void fill(WebElement fs, String input) {
		fs.sendKeys(input);

	}

	public static void click(WebElement cl) {
		cl.click();
	}

	public static void visiblebytext(WebElement ele, String input) {
		s = new Select(ele);
		s.selectByVisibleText(input);

	}
	public static void closeBrowser() {
		driver.close();
	
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Rajkumar\\Documents\\eclipse-workspace\\NewCucu\\target\\Screenshots\\"+name+".jpg");
		FileUtils.copyDirectory(src, des);
			
			
		};

	}


