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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.util.concurrent.TimeUnit as TimeUnit

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/Object_Salestrex/Login/txt_captcha'), GlobalVariable.captcha)

WebUI.click(findTestObject('Object Repository/Object_Salestrex/Login/button_login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Object_Salestrex/Login/button_humberger_Menu'), 30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Object_Salestrex/Login/button_humberger_Menu'))

WebUI.click(findTestObject('Object Repository/Page_InputCustomer/menuSalestrax'))

WebUI.click(findTestObject('Object Repository/Page_/a_Add Asset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Customer NameEmployee Name'), 'stc.CustomerName', 
    true)


WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearch'), 'bona')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

CustomKeywords.'salestrax.addAset.getDataTable'()

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_productCategory'), 'NDF Motorcycle', true)


WebUI.click(findTestObject('Object Repository/Page_/zipCode'))

//WebUI.switchToWindowIndex(1)
WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/UserControl/LookUpZipCodeMotor.aspx')


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_searchBy'), 'Kelurahan.ZipCode', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), '20229')

WebUI.click(findTestObject('Object Repository/Page_/btnSearchDataCostumer'))

CustomKeywords.'salestrax.addAset.getDataTableDataCustomer'()

//WebUI.click(findTestObject('Object Repository/Page_/imageKTP'))

//WebUI.uploadFile(findTestObject('Object Repository/Page_/imageKTP'), 'C:\\Users\\6000131\\Pictures\\ktp konsumen\\ktp 1- jpg.jpg')

//CustomKeywords.'com.katalon.WebUICustomKeyword.uploadFile'(findTestObject('Object Repository/Page_/imageKTP'), 'C:\\Users\\6000131\\Pictures\\ktp konsumen\\ktp 1- jpg.jpg')

//CustomKeywords.'salestrax.addAset.uploadFile'(findTestObject('Object Repository/Page_/imageKTP'), 'C:\\Users\\6000131\\Pictures\\ktp konsumen\\ktp 1- jpg.jpg')

WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/Default.aspx')

WebUI.setText(findTestObject('Object Repository/Page_/input_Mother Maiden Name_tbMMName'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_POTName'), 'Paket Motor Struktur Ringan', true)

WebUI.click(findTestObject('Object Repository/Page_/input_Supplier_csLookup'))

WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/UserControl/LookupSupplier.aspx?s5L06Oa9poQNl4DEyiMv6OXfujMATmBC')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Dealer IDDealer Name'), 'SupplierName', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), 'supplier individu')

WebUI.click(findTestObject('Object Repository/Page_/btnSearchDataSupplier'))

WebUI.click(findTestObject('Object Repository/Page_/input_SUPPLIER RATING_rbtSupplier'))

WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/Default.aspx')

WebUI.click(findTestObject('Object Repository/Page_/input_Reff. Customer_IBCS'))

WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/UserControl/LookupCustomer.aspx?vDlmsRl2qcU=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/customeType'), "and cu.CustomerType = 'P'", true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_/selectSerachBy_DataCustomer'), 1)

WebUI.setText(findTestObject('Object Repository/Page_/input_keySearchBy'),'test')

WebUI.click(findTestObject('Object Repository/Page_/btnSearchDataCostumer'))

CustomKeywords.'salestrax.addAset.getDataTableDataCustomer'()

WebUI.switchToWindowUrl('https://testcore.bfi.co.id/BFISalestraxGB/Default.aspx')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Branch'),
	'401', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_MEDANMedan-Percut Sei TuanMedan-Tanj_629b5a'),'0001', true)


WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtAssetName'), 'sedan')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtYear'), '2018')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtLicensePlate'), 'hosdia09')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNoSTNK'), '763171283827381728123')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'))

WebUI.clearText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtFunding'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtFunding'), '18000000')

WebUI.clearText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'), '170000000')

WebUI.clearText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtAngsuran'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtAngsuran'), '2000000')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtTenor'), '12')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02tbExpiredDat_0c4228'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '11', true)
