import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

def TestCase_Folder_Name = 'Salestrax'

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_captcha'), GlobalVariable.captcha)

WebUI.takeScreenshot(((GlobalVariable.ProjectFolder + TestCase_Folder_Name)+'Login_salestrax') + GlobalVariable.PNG_Format, FailureHandling.STOP_ON_FAILURE)

//WebUI.takeScreenshot('C:\\Users\\6000131\\Katalon Studio\\Test Project Katalon\\Image\\login.png')

WebUI.click(findTestObject('Object Repository/Object_Salestrex/Login/button_login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Object_Salestrex/Login/button_humberger_Menu'), 30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Object_Salestrex/Login/button_humberger_Menu'))

WebUI.click(findTestObject('Object Repository/Page_InputCustomer/menuSalestrax'))

WebUI.click(findTestObject('Object Repository/Page_InputCustomer/subMenu_InputCustomer'))

CustomKeywords.'salestrax.inputCustomer.customer_type'('NEW')
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_customerType'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_CustomerProfile'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_customerLevel'), 0)

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_customerName'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/textarea_Address'), 'jl jl ')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_mobilePhone'), '08298918912121')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_residenceArea'), '4512')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_residencePhone'), '0828928392')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_companyArea'), '4512')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_companyPhone'), '0898329392')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_Email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_IDNumber(KTP)'), '1324314134412313')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_Gender'), 2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_InputCustomer/input_birthDate'), 10)

WebUI.delay(5)

//manipulation 
WebUI.executeJavaScript('document.getElementById("MainContent_FormFrame").contentWindow.document.getElementById("txtDate").removeAttribute("readonly")', 
    null)

WebUI.setText(findTestObject('Object Repository/Page_InputCustomer/input_birthDate'), '05/07/1996')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_maritalStatus'), 3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_customerProfession'), 1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_indusryGroup'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_InputCustomer/select_guarantorType'), 1)

WebUI.click(findTestObject('Object Repository/Page_InputCustomer/btnNext'))



