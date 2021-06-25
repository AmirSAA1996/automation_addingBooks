import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://localhost:8080/")
WebUI.delay(1)
selenium.click("xpath=//label[3]/input")
WebUI.delay(1)
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Modify Book'])[1]/following::button[1]")
selenium.click("name=isbn")
WebUI.delay(1)
selenium.type("name=isbn", "HGKLKRS65T")
WebUI.delay(1)
selenium.click("name=title")
selenium.click("name=title")
selenium.type("name=title", "LE SIXIEME SOMMEIL")
WebUI.delay(1)
selenium.click("name=cover")
selenium.click("name=cover")
WebUI.delay(1)
selenium.type("name=cover", "REMI PEPIN")
WebUI.delay(1)
selenium.click("name=publisher")
selenium.click("name=publisher")
selenium.type("name=publisher", "Albin MICHEL")
WebUI.delay(1)
selenium.click("name=pages")
selenium.click("name=pages")
selenium.type("name=pages", "399")
WebUI.delay(1)
selenium.click("name=available")
selenium.type("name=available", "50")
WebUI.delay(1)
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Pick Books to delete'])[1]/preceding::button[1]")
WebUI.delay(2)
selenium.click("name=003")
WebUI.delay(1)
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Modify Book'])[1]/following::button[1]")

