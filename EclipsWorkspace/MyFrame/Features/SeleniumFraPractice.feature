Feature: Selenium-Framework-Practice
Background: launch browser
Given I lauch auotmation demo website for practice selenium

#Scenario: Verify user is able to send key
#When I send value in the first name value field
#When I send value in the last name value field
#Then I verify that Full Name title
#
#Scenario: Get text
#When I click on the AB testing
#Then I get text paragraph
#
#@DeleteElement
#Scenario: Verify user able to add and delete element
#When I click on add and remove element
#When I click on add element button
#Then I verify delete button displayed
#When I click on delete button
#When I click on add element "10" times
#Then I count number of delete elements present on the web page
#Then I get text of all delete elements
#
#@CheckBox
#Scenario: Verify checkbox functionality
#When I click on checkboxes link
#When I click on the checkbox1
#Then I verify checkbox is selected
#
#@Alert
#Scenario: Alert handle
#When I click on "JavaScript Alerts" elements on the home page
#When I click on "Click for JS Alert" alert option
#Then I verify alert text
#Then I click on ok button on alert
#When I click on "Click for JS Confirm" alert option
#Then I dismiss alert
#When I click on "Click for JS Prompt" alert option
#Then I sendkey "Atlanta classes" to alert
#Then I click on ok button on alert
#
#@Alert2
#Scenario: Handle alert
#When I click on  Switch to element
#When I select dropdown value
#
#@iFrame
#Scenario: Handle iframe and nestewd frame
#When I click on "Frames" elements on the home page
#When I click on "iFrame" elements on the Frames page
#When I switch to frame
#Then I send text to the frame body
#
#@NestedFrames
#Scenario: Handle nested frames
#When I click on "Frames" elements on the home page
#When I click on "Nested Frames" elements on the Frames page
#When I get text of middle frame
#
#@SelectDropdown
#Scenario: Handle dropdown
#When I click on "Dropdown" elements on the home page
#When I select dropdown value "1" using select class by "AttributrValue"
#
#@DragAndDrop
#Scenario: Handle drag and drop
#When I click on "Drag and Drop" elements on the home page
#Then I drag and drop elements
#
#@WindowsHandle
#Scenario: Handle windows
#When I click on "Multiple Windows" elements on the home page
#When I click on new window click here
#Then I get title of new window
#
#@basicAuthentication
#Scenario: Handle basic authentications using selenium
#When Open bssic authentication site to provide pass and username
#Then I get massage

@FileUpload
Scenario: Upload file
When I click on "File Upload" elements on the home page
When I will upload file

@Excel
Scenario: Fetch excel data
When I fetch data from the excel file

#@KeyboardFunctions
#Scenario: Perform key board function
#When I click on "Key Presses" elements on the home page
#When I perform and verify keyboard function
#
#@DynamicLoading
#Scenario: Dynamic wait validation
#When I click on "Dynamic Loading" elements on the home page
#When I verify different dynamic waits						
