<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PostUserRegisterSuccessful</name>
   <tag></tag>
   <elementGuidId>7ad953a7-a214-4710-ad77-9e3ee9e850de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;email\&quot;: \&quot;${USERNAME}\&quot;,\n    \&quot;password\&quot;: \&quot;${PASSWORD}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>c751f155-cd17-44f4-b2e2-fd425de6f6c1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${LINK_API}/register/new</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.LINK_API</defaultValue>
      <description></description>
      <id>4b9d45c6-c9a8-4527-ac3e-e61de52363df</id>
      <masked>false</masked>
      <name>LINK_API</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.USERNAME</defaultValue>
      <description></description>
      <id>255b4465-3fd9-4b1d-9f29-e6449381c3bd</id>
      <masked>false</masked>
      <name>USERNAME</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.PASSWORD</defaultValue>
      <description></description>
      <id>2a2ec5a6-eadb-4cad-a251-1c23f7ff3c8c</id>
      <masked>false</masked>
      <name>PASSWORD</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
