import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.VerifyMatchKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.Console
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.support.ui.Select

'Invoking the browser'
WebUI.openBrowser('')

'passing the url'
WebUI.navigateToUrl(GlobalVariable.baseUrl)

'Maximize the window'

WebUI.maximizeWindow()

'Click on the make appointment button'
WebUI.click(findTestObject('Object Repository/Object_CURA_healthcareService/link_makeAppointment'))

WebUI.setText(findTestObject('Object Repository/Object_CURA_healthcareService/field_username'), GlobalVariable.username)

'get attribute value of username text field'
def input_value = WebUI.getAttribute(findTestObject('Object Repository/Object_CURA_healthcareService/field_username'), 'value')

'verify the entered value of username text fiedl'
WebUI.verifyMatch(GlobalVariable.username, input_value, false)

WebUI.setText(findTestObject('Object Repository/Object_CURA_healthcareService/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Object_CURA_healthcareService/button_login'));


def text = WebUI.getText(findTestObject('Object Repository/Object_CURA_healthcareService/select_facility'))

println(text)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Object_CURA_healthcareService/select_facility'), 1)

WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Object_CURA_healthcareService/select_facility'), 1, 1)

'check hospytal readmission checkbox'

WebUI.check(findTestObject('Object Repository/Object_CURA_healthcareService/checkbox_applyHospital'))

'verify hospital readmission checkbox is checked'

WebUI.verifyElementChecked(findTestObject('Object Repository/Object_CURA_healthcareService/checkbox_applyHospital'), 10)

'check medicaid radio button'

WebUI.check(findTestObject('Object Repository/Object_CURA_healthcareService/radioButton_Medicaid'))

'verify the medicaid is checked'
WebUI.verifyElementChecked(findTestObject('Object Repository/Object_CURA_healthcareService/radioButton_Medicaid'), 10)


'set date picker'
WebUI.setText(findTestObject('Object Repository/Object_CURA_healthcareService/field_visitDate'), '05-09-2022')

'set text in comment'
WebUI.setText(findTestObject('Object Repository/Object_CURA_healthcareService/textarea_comment'), GlobalVariable.comment)

WebUI.click(findTestObject('Object Repository/Object_CURA_healthcareService/button_bookAppointment'))

'veryfy elemen in web page'




'Logout'
WebUI.click(findTestObject('Object Repository/Object_CURA_healthcareService/toggleButton'))

WebUI.click(findTestObject('Object Repository/Object_CURA_healthcareService/sideMenu_Logout'))
