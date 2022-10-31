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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testcore.bfi.co.id/BFISalestraxGB/Login.aspx?AspxAutoDetectCookieSupport=1')

WebUI.setText(findTestObject('Page_Login Salestrax/input_Username_username'), 'abdi401')

WebUI.setEncryptedText(findTestObject('Page_Login Salestrax/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setText(findTestObject('Page_Login Salestrax/input_Reload Captcha_txbCaptcha'), '11111')

WebUI.click(findTestObject('Page_Login Salestrax/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_/a_Log Out_hamburger-one'))

WebUI.click(findTestObject('Object Repository/Page_/a_Menu_mm-next'))

WebUI.click(findTestObject('Object Repository/Page_/a_Add Asset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Customer NameEmployee Name'), 'stc.CustomerName', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearch'), 'bona')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_/input_Abdi Narendra Turnip_GRAddAssetctl03b_cb8e95'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_productCategory'), 'NDF Motorcycle', true)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_/input_Zipcode_ZipCode'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_searchBy'), 'Kelurahan.ZipCode', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), '20229')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_/input_KOTA MEDAN_rbtGridSelect'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Page_/input_Mother Maiden Name_tbMMName'), 'test')

WebUI.switchToWindowTitle('')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_POTName'), 'Paket Motor Struktur Ringan', true)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_/input_Supplier_csLookup'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Dealer IDDealer Name'), 'SupplierName', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), 'supplier individu')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_/input_SUPPLIER RATING_rbtSupplier'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_/input_Reff. Customer_IBCS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Customer IDCustomer NameMother NameKTP'), 'and Ltrim(Rtrim(cu.Name)) ', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), 'test')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_/input_KOTA MEDAN_rbtGridSelect'))

WebUI.switchToWindowTitle('')

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_/input_Zipcode_ZipCode'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_searchBy'), 'Kelurahan.ZipCode', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Search By_txtSearchBy'), '20229')

WebUI.click(findTestObject('Object Repository/Page_/btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_/input_KOTA MEDAN_rbtGridSelect'))

WebUI.switchToWindowTitle('')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Branch'), 
    '401', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_MEDANMedan-Percut Sei TuanMedan-Tanj_629b5a'), 
    '0001', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_MEDANMedan-Percut Sei TuanMedan-Tanj_629b5a'), 
    '0000', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtAssetName'), 'sedan')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtFunding'), '17000000')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtYear'), '2018')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtLicensePlate'), 'hosdia09')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNoSTNK'), '763171283827381728123')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtFunding'), '18000000')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtNTF'), '170000000')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtAngsuran'), '2000000')

WebUI.setText(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02txtTenor'), '12')

WebUI.click(findTestObject('Object Repository/Page_/input_Delete_GRAssetDetailctl02tbExpiredDat_0c4228'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '11', true)

WebUI.click(findTestObject('Object Repository/Page_/a_25'))

WebUI.click(findTestObject('Object Repository/Page_/input_Add_btnSave'))

WebUI.click(findTestObject('Object Repository/Page_/input_Add_btnSave'))

WebUI.closeBrowser()

