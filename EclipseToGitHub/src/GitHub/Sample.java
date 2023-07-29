package GitHub;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String [] args) throws AWTException, IOException {
		
		
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://practicetestautomation.com/practice-test-login/");
	 Robot robot = new Robot();
	 Dimension screenshot = Toolkit.getDefaultToolkit().getScreenSize();
	 Rectangle rect = new Rectangle(screenshot);
	 BufferedImage src = robot.createScreenCapture(rect);
	 File dest = new File("E:\\Software Testing(ScreenShot)\\Testing.png");
	 ImageIO.write(src, "png", dest);
	 
}
}
