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

WebUI.navigateToUrl('https://sit-engig.bv.com/id/D1Hdz0nE4P')

WebUI.setText(findTestObject('Object Repository/Page_Black and Veatch/input_Work Email_userEmail'), 'equipment@bv.com')

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/img_Setup in Progress_searchRefAfter'))

WebUI.setText(findTestObject('Object Repository/Page_Black and Veatch/input_Setup in Progress_search'), '123098')

WebUI.sendKeys(findTestObject('Object Repository/Page_Black and Veatch/input_Setup in Progress_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/p_123098'))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/div_Project Activities'))

for (def index : (0..5)) {
    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/span_Add Row'))

    WebUI.setText(findTestObject('Object Repository/Page_Black and Veatch/input_test-test_form-control genetateActivi_387156'), 
        'Testing multiple activities')

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/svg_Name Here_css-19bqh2r'))

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/div_61.011-Design Studies'))

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/svg_Name Here_css-19bqh2r_1'))

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/div_Compressor'))

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/svg_Name Here_css-19bqh2r_1_2'))

    WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/div_test-test'))
}

