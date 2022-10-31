package salestrax
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class addAset {

	@Keyword
	def getDataTable() {


		String expectedValue='10394475'

		WebDriver driver = DriverFactory.getWebDriver()

		//WebElement tables = driver.findElement(By.xpath("//table[@id='GRAddAsset']/tbody"))

		driver.switchTo().frame("MainContent_FormFrame");

		WebElement tables = driver.findElement(By.xpath("//table[@id='GRAddAsset']/tbody"));

		List<WebElement> Rows = tables.findElements(By.tagName('tr'))

		println('No. of rows: ' + Rows.size())

		table: for (int i = 0; i < Rows.size(); i++) {

			'To locate columns(cells) of that specific row'

			List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

			for (int j = 0; j < Cols.size(); j++) {

				'Verifying the expected text in the each cell'

				if (Cols.get(j).getText().equalsIgnoreCase(expectedValue)) {

					'To locate anchor in the expected value matched row to perform action'

					Cols.get(4).findElement(By.tagName('input')).click()
					WebUI.delay(5)
					break table;



				}

			}

		}

	}

	@Keyword
	def getDataTableDataCustomer() {
		String expectedValue=''

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement tables = driver.findElement(By.xpath("//table[@id='GRCustomer']/tbody"));

		List<WebElement> Rows = tables.findElements(By.tagName('tr'))

		println('No. of rows: ' + Rows.size())

		table: for (int i = 0; i < Rows.size(); i++) {

			'To locate columns(cells) of that specific row'

			List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

			for (int j = 0; j < Cols.size(); j++) {

				'Verifying the expected text in the each cell'

				if (Cols.get(j).getText().equalsIgnoreCase(expectedValue)) {

					'To locate anchor in the expected value matched row to perform action'

					Cols.get(4).findElement(By.xpath('//*[@id="GRCustomer"]/tbody/tr[2]/td[1]/input')).click()

					break table;



				}

			}

		}
	}

	@Keyword
	def uploadFile(TestObject to, String filePath) {
		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
