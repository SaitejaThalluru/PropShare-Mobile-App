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
// import com.detroitlabs.katalonmobileutil.touch.Scroll
// import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor

WebUI.callTestCase(findTestCase('Login Test case'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (3)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (5)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (6)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Apply_Reset Button TC objects/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Apply_Reset Button TC objects/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Apply_Reset Button TC objects/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Apply_Reset Button TC objects/android.widget.Button (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (3)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (4)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (5)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (6)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Apply_Reset Button TC objects/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Tax Center/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Tax Center/android.view.View (1)'), 0)

PAN_Number = Mobile.getText(findTestObject('Object Repository/Tax Center/PAN'), 0)

println(PAN_Number)

Income = Mobile.getText(findTestObject('Object Repository/Tax Center/Income'), 0)

println(Income)

TDS = Mobile.getText(findTestObject('Object Repository/Tax Center/TDS'), 0)

println(TDS)

Net_Distribution = Mobile.getText(findTestObject('Object Repository/Tax Center/Net Distribution'), 0)

assert Income - TDS == Net_Distribution

Mobile.tap(findTestObject('Object Repository/Logout Objects/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Logout Objects/android.widget.ImageView'), 0)

Mobile.closeApplication()

