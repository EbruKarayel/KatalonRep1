import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlLoginPage)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/inp_Username'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/inp_Username'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/inp_Password'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/inp_Password'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/inp_Username'), 5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/btn_Login'))

WebUI.verifyElementClickable(findTestObject('Page_OrangeHRM/btn_Login'))

'invalid senario 1: valid username, invalid password.'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/inp_Username'), GlobalVariable.username_valid)

WebUI.setText(findTestObject('Page_OrangeHRM/inp_Password'), GlobalVariable.password_invalid)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/btn_Login'))

try
{
	element = findTestObject('Object Repository/Page_OrangeHRM/p_Invalid credentials')
	if (WebUI.verifyElementNotPresent(element, 10, FailureHandling.STOP_ON_FAILURE)) {
	}
}
catch(STOP_ON_FAILURE)
{
	throw ("no error message")
}

'invalid senario 2: invalid username, valid password.'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/inp_Username'), GlobalVariable.username_invalid)

WebUI.setText(findTestObject('Page_OrangeHRM/inp_Password'), GlobalVariable.password_valid)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/btn_Login'))



'invalid senario 3: invalid username, invalid password.'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/inp_Username'), GlobalVariable.username_invalid)

WebUI.setText(findTestObject('Page_OrangeHRM/inp_Password'), GlobalVariable.password_invalid)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/btn_Login'))



'valid senario'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/inp_Username'), GlobalVariable.username_valid)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/inp_Password'), GlobalVariable.password_valid)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/btn_Login'))

WebUI.closeBrowser()

