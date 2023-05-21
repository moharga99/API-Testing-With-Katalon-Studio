import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ReqresAPISteps {
	@Given("A list of users are available")
	def logInfoGetListUsers() {
		println "A list of users are available"
	}

	@When("User send request get list users")
	def sendRequestGetListUsers() {
		WS.sendRequest(findTestObject('GetListUsers'))
	}

	@Then("System will display response status code (.*) and page (.*) and total pages (.*)")
	def verifyRequestGetListUsers(String statusCode, String page, String totalPages) {
		def response = WS.sendRequest(findTestObject('GetListUsers'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementPropertyValue(response, 'page', '1')
		WS.verifyElementPropertyValue(response, 'total_pages', '2')
	}

	@When("User send request get specific user")
	def sendRequestGetSingleUser() {
		WS.sendRequest(findTestObject('GetSingleUser'))
	}

	@Then("System will display response status code (.*) and id (.*) and email (.*)")
	def verifyRequestGetSingleUser(String statusCode, String id, String email) {
		def response = WS.sendRequest(findTestObject('GetSingleUser'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementPropertyValue(response, 'data.id', '2')
		WS.verifyElementPropertyValue(response, 'data.email', 'janet.weaver@reqres.in')
	}

	@Given("User has fill all data correctly")
	def logInfoPostRegister() {
		println "User has fill all data correctly"
	}

	@When("User submit form registration")
	def sendRequestPostRegister() {
		WS.sendRequest(findTestObject('PostUserRegisterSuccessful'))
	}

	@Then("System will display response status code (.*) and email (.*) and password (.*)")
	def verifyRequestPostRegister(String statusCode, String email, String password) {
		def response = WS.sendRequest(findTestObject('PostUserRegisterSuccessful'))
		WS.verifyResponseStatusCode(response, 201)
		WS.verifyElementPropertyValue(response, 'email', GlobalVariable.USERNAME)
		WS.verifyElementPropertyValue(response, 'password', GlobalVariable.PASSWORD)
	}

	@Given("User has been registered")
	def logInfoPutUpdateUser() {
		println "User has been registered"
	}

	@When("User update data")
	def sendRequestPutUpdateUser() {
		WS.sendRequest(findTestObject('PutUpdateUser'))
	}

	@Then("System will display response status code (.*) and name (.*) and jobs (.*)")
	def verifyRequestPutUpdateUser(String statusCode, String name, String jobs) {
		def response = WS.sendRequest(findTestObject('PutUpdateUser'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementPropertyValue(response, 'name', 'Mohamad Arga')
		WS.verifyElementPropertyValue(response, 'job', 'SDET')
	}
}