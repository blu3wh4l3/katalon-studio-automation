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

WebUI.setText(findTestObject('Object Repository/Page_Black and Veatch/input_Work Email_userEmail'), 'structural@bv.com')

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/img_Engineering Execution_searchRefAfter'))

WebUI.setText(findTestObject('Object Repository/Page_Black and Veatch/input_Engineering Execution_search'), '79610')

WebUI.sendKeys(findTestObject('Object Repository/Page_Black and Veatch/input_Engineering Execution_search'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/p_79610'))

WebUI.click(findTestObject('Object Repository/Page_Black and Veatch/div_Change Management'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Black and Veatch/div_Engineering Execution'), 'Engineering Execution')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Black and Veatch/div_MC Impact'), 'MC Impact')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Black and Veatch/div_Implementation Error The backup process_c01e0a'), 
    'Implementation Error: The backup process has failed to complete for Change Instance MC12, contact technical support. This message was triggered on 01-23-2023.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Black and Veatch/div_Change Management'), 0)

