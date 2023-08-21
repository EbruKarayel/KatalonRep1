import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlLoginPage)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/inp_Username'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/inp_Username'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/inp_Password'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/inp_Password'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/btn_Login'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/btn_Login'))

WebUI.verifyElementClickable(findTestObject('Page_OrangeHRM/btn_Login'))

'invalid senario 2: invalid username, valid password.'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/inp_Username'), GlobalVariable.username_invalid)

WebUI.setText(findTestObject('Page_OrangeHRM/inp_Password'), GlobalVariable.password_valid)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/btn_Login'))

//WebUI.closeBrowser()

