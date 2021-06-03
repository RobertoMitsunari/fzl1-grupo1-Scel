package com.fatec.cap09scelwebd;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class REQ04ExcluirLivroTSTests {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	
	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	  @Test
	  public void REQ04ExcluirLivroTSTests() {

		  ExcluirLivro pagExcluirLivro = new ExcluirLivro(driver);
		  
		  pagExcluirLivro.excluirLivro("jose", "123", 1110, "Autor1", "Titulo01");
	  }
}
