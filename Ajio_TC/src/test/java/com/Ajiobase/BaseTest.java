package com.Ajiobase;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	import org.testng.asserts.SoftAssert;


	public class BaseTest   {
		public WebDriver driver;

	    @BeforeClass
		@Parameters({ "browser", "pageUrl"})
		public void Setup(String browser, String pageUrl) {
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(pageUrl);
		}

		@AfterClass
		public void TearDown() {
			driver.close();
		}


	}


