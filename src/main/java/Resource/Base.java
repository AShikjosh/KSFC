package Resource;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	static ExtentReports extent;

	public static WebDriver getDriver() throws IOException {
		// Path for properties file
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Automation\\KSFC(m)\\KSFC(m)\\src\\main\\java\\Resource\\data.properties");

		// Path for Drivers file
		prop.load(file);
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.getProperty("webdriver.chrome.driver", "C:\\Automation\\KSFC(m)\\KSFC(m)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			
		}

		else if (browsername.equals("firefox")) {
			System.getProperty("webdriver.gecko.driver",
					"E:\\KSFC Automation\\KSFC\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}

		else if (browsername.equals("IE")) {
			System.getProperty("webdriver.ie.driver",
					"D://Kavya Office//Kavya//Automation//Projects//NGSK//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}

		else if (browsername != null) {
			System.out.println(browsername);
		}

		else
			throw new RuntimeException("Browser name is not specified in the data.properties file.");

		return driver;
	}

	// Path for Url file
	public static void getUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			driver.get(url);
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	// Method for wait
	public static void getImplicitlyWait() {
		String implicitlyWait = prop.getProperty("implicitlyWait");
		int time;
		if (implicitlyWait != null) {
			time = Integer.parseInt(implicitlyWait);
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	// Method for screenshots
	public static void screenshot(String methodName, WebDriver driver) throws IOException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		File dest = new File("C:\\Automation\\KSFC(m)\\KSFC(m)\\Screenshot", methodName + "_" + timestamp + ".png");
		FileUtils.copyFile(scr, dest);
	}

	// Method for Extent report
	public static ExtentReports config() {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		String path = System.getProperty("user.dir") + "\\Reports\\Extent Reprot" + "_" + timestamp + ".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("KSFC test result");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ashik");
		return extent;
	}

}