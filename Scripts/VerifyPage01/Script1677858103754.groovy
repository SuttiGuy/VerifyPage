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

WebUI.navigateToUrl('https://www.cloudnative-skill.com/register')

WebUI.verifyTextPresent('Register', false)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Modern Software Development Toolchains', false)

WebUI.setText(findTestObject('Register_Page/birthday_input'), '02/05/2546')

WebUI.sendKeys(findTestObject('Register_Page/birthday_input'), Keys.chord(Keys.ENTER))

auto_Age = WebUI.getText(findTestObject('Register_Page/auto_Age'))

auto_Age = WebUI.getAttribute(findTestObject('Register_Page/auto_Age'), 'value')

WebUI.verifyMatch(auto_Age, '20', false)

WebUI.click(findTestObject('Register_Page/click_learn'))

WebUI.setText(findTestObject('Register_Page/text_Off'), 'สำนักงานใหญ่')

WebUI.sendKeys(findTestObject('Register_Page/text_Off'), Keys.chord(Keys.ENTER))

text_Off = WebUI.getAttribute(findTestObject('Register_Page/text_Off'), 'value')

WebUI.verifyMatch(text_Off, 'สำนักงานใหญ่', false)

WebUI.verifyElementNotChecked(findTestObject('Register_Page/checkbox'), 0)

WebUI.click(findTestObject('Register_Page/click_aDdress-1'))

WebUI.verifyElementNotChecked(findTestObject('Register_Page/not_Clickable'), 0)

WebUI.click(findTestObject('Register_Page/click_aDdress -2'))

WebUI.verifyElementClickable(findTestObject('Register_Page/clickable'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

