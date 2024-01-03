Feature: Verify Shohoz icon work properly



  @Release
  Scenario: Verify that welcome page take run properly
    Given Check that welcome page take loads properly
    Then Check that shohoz button is appare
    And Check that Bus Button is appare
    And Check that Lunch Button is appare
    And Check that Train Button is appare
    And Check that Even Button is appare
    And Check that Language By default select English
    And Check that Contact Us Button is appare

@Release
  Scenario: verify that Bus page works properly
  Given Check that Bus Button is appare
    When Click that Bus Button
    Then Check that From input field is appare
    And Check that To input field is should be appare
    And Check that Date of Journey input filed is should be appare
    And Check that Date of Return input field is should be appare
   And Check that Search Buses Button should be appare

@Release
  Scenario: Searching a Bus
    Given Check that Bus Button is appare
    When Click that Bus Button
    Given Check that From input field should be appare
    When click the input field write a District  Name
    Then Check that To input field should be appare
    When Click the To input filed and write another District name
    Then Check that Date of journey calander should be appare
    When click the calander & Select a Date
    And click the calander & Selected a Date
    Then Check that the Search Buses Button is should be appare
    When Click the Search Buses

@Release
  Scenario: Result Finding Buses
    Given Check that Bus Button is appare
    When Click that Bus Button
    Given Check that From input field should be appare
    When click the input field write a District  Name
    Then Check that To input field should be appare
    When Click the To input filed and write another District name
    Then Check that Date of journey calander should be appare
    When click the calander & Select a Date
    And click the calander & Selected a Date
    Then Check that the Search Buses Button is should be appare
    When Click the Search Buses

    Given Check that Departure text should be appare
    Then Check that Return Text should be appare
    And Check that Prev. Day Button should be appare
    And Check that Next Day Button SHould Be appare
    And Check that Add Return Ticket Button shold be appare
    And Check that Modify Search Button Should be appare
    And Check that Operator (Bus Type) Text is appare

@Release
  Scenario: Selecting a sit
    Given Check that Bus Button is appare
    When Click that Bus Button
    Given Check that From input field should be appare
    When click the input field write a District  Name
    Then Check that To input field should be appare
    When Click the To input filed and write another District name
    Then Check that Date of journey calander should be appare
    When click the calander & Select a Date
    And click the calander & Selected a Date
    Then Check that the Search Buses Button is should be appare
    When Click the Search Buses


    Then Check that View Seats Button is appare
    When Click That View seats
    Then Check That Chooose your seat(s) text is appare
    And Check that Available Seats Text is appare
    And Check That Booked Seats is appare
    And Check That Selected Seats is appare
    And Check that  Hidden Sit Button is appare
    When Click  Sit
    Then Check that Total : should be increased
    And Check that Choose Boarding Point Text should be appare
    And Check that -- Boarding Points -- dropdrown menu should be appare Select an --Boarding Points --
    And Check that Continue Button should be appare and
    When click Continue Button

@Release
  Scenario: Passenger Details Pages working Properly
  Given Check that Passenger Details Text should be appare
    Then Check that Name input fields should be appare
    And Check that Name input field should be appare and
    When click that input field and write a name
    Then Check that Gender Radio Button should be appare
    And Check that Gender Radion Button Should be appare & by default it selected M
    And Check that Contact Information Text should be appare
    And Check that Mobile input filed should be appare
    And Check that Enter Mobile input field should be appare and
    When click the Mobile input Field write a mobile number
    Then Check that Email Text should be appare
    And Check that Enter Email input fields should be appare
    When Click the Enter Email and write a Email

@Release
  Scenario: Payment Details Checking Properly
    Given Check that Payment Details Text should be appare
    Then Check that Insure your travel by adding ৳ 10 per passenger  Radio button shoud appare
    And check by default yes option selected.
    And Check that Total Amount Payable : ৳" text should be apppare
    And Check that a blank selct box  Terms of Use, Privacy Policy and Cancellation Policy of Shohoz.com  should appare
    When click the box.
    Then Check that Mobile Banking Mobile Banking Text should appare
    And Check that the Card or Internet Banking Button should appare
    And Check that the Cash on Delivery Button should be appare
    And check that Please Select a Payment Method Text should appare
    And check that bKash button should be appare.
    And check that Nogod button should be appare
    And check that Rocket button should be appare.
    And check that Other MFS button should be appare.

@Release
  Scenario: Payment Selection system
    Given check that bKash button should be appare and Select the button
    Then check that Proceed to Pay Button shoud be appare
    And check that Proceed to Pay Button shoud be appare
    When click the button
    Then Check that new window bKash is appare
    And Check that Shohoz Tickets Text should be appare
    And Check that Your bKash Account number should be appare
    And check that a number input box is should be appare.


@Release
  Scenario: Lanuch Option working properly
    Given Check that shohoz button shoud be appare on the top
    Then Check that shohoz button shoud be appare on the top
    When click on it
    Then check that shohoz button should be appare.
    And check that Bus button should be appare.
    And check that Train button should be appare.
    And check that Event button should be appare.
    And check that shohoz button should be appare.
    And check that Language button should be appare.
    And check that Contact Us button should be appare.
    And check that Launch button should be appare.
    When click on Lanuch button

@Release
  Scenario: Lanuch window all functionality working checking
    Given check that shohoz button should be appare.
    Then check that Bus button should be appare.
    And check that Train button should be appare.
    And check that Event button should be appare.
    And check that shohoz button should be appare.
    And check that Language button should be appare.
    And check that Contact Us button should be appare.
    And check that 16374 button should be appare.
    And Check that Form text is appare
    And check that Enter City input field should be appare
    And Check that To Text is should be appare
    And check that Enter a City input box should be appare
    And Check that Date of Journey Text should be appare
    And Check that pick a date calender popup should be appare
    And check that a search Launches button should be appare

@Release
  Scenario: Train windows all functionality working checking deeply
    Given Check that shohoz button should be appare.
    When click on shohoz button.
    Then check that Bus button should be appare.
    And check that Train button should be appare
    When click on it.
    Then check that Event button should be appare
    When click on Event button
    Then check that Search for events near you text is shows
    And Check that Select Location input button should be appare.
    And check that From Date input field should be appare.
    And check that To Date input field is should be appare
    And Check that COMMING SOON text is should be appare.
    And check that Event Archive botton should be appare.

@Release
  Scenario: Home page more option check
    Given check that Shohoz button should be appare
    Then Go to & check that introducing you to the Shohoz way of life text should be appare.
    And check that A one-stop solution for your travel needs text should be appare
    And Check that Shohoz Bus button should be appare
    And Check that Shohoz Launch button should be appare
    And check that Shohoz Event button should be appare
    And check that Download Shohoz App text should be appare
    And check that Make convenience a part of your life text should be appare
    And check that Google Play button should be appare
    And check that  App Store button should be appare


@Release
  Scenario: Contact Us Windows working properly
    Given Go to Home page
    Then Check that Contact Us botton should be appare.
    When click on it
    Then check that Contact us page should be shown
    And Check that  "Thank you for reaching us! We are always happy to hear from you" text should be appare
    And check that Purpose Text should be shown.
    And Check that Purpose list sould be shown .
    And Check that Purpose list sould be shown
    When click on it. and select an item
    Then Check that your name text should be appare.
    And Check that name input field should be appare.
    And check that input name field should be appare
    When click on it and write a name
    Then Check that your City  text should be appare
    And Check that your City  button should be appare .
    And Check that your City  button should be appare
    When click on button and select a city.
    Then Check that Phon Number text should be appare .
    And Check that Phon Number input filed should be appare .
    And Check that Email text should be appare .
    And Check that Email input filed should be appare .
    And Check that Email input filed should be appare
    When click on input filed and write a Email
    Then Check that Message text should be appare
    And Check that Message input  box should be appare
    And Check that Message input  box should be appare
    When click on on message input box and write a message.
    Then Check that Send button is appare

@Release
  Scenario: Event more option check
    Given Goto Evant windows
    Then Check that Verify  Ticket button shoud be appare
    And Check tahat Contact Us button should be appare
    And Check that 16374 button shoud be appar
    And check that Scan QRCode  button shoud be appare
    When click on that

@Release
  Scenario: Event more option check part-II
    Then Check that START SCAN  button should be appare
    And Chek that Shohoz button should be appare.
    And Check that Bus button should be appare
    And Check that Launch button should be appare
    And Check that Train button should be appare
    And Check that Event button should be appare
    And Check that START SCAN  button should be appare
    When click on that.

@Release
  Scenario: Event More option check part-III
    Given Check that Request Camera Permissions button should be appare
    Then check that Scan an Image File link should be appare

@Release
  Scenario: Verify Ticket button check in details
    Given Check the Shohoz button is should be appare
    When click on it
    Then Check that Event buttun should be appare
    When click on it
    Then Check that Verify Ticket  button is should be appare
    And heck that verify Ticket button should be appare
    When Click on it
    Then Check that Verify Ticket Text should be appare
    And Check that Ticket No / Reservation Ref: Text should be appare
    And Check that Enter Ticket No / Reservation input box should be appare
    When Click that Enter Ticket No / Reservation input box should be appare & Enter a number
    Then Check that SEARCH button should be appare
    And Check that SEARCH button should be appare and click on SEARCH button.
    And Check that Sorry! we could not locate your ticket. Please enter correct ticket ID or Reservation Reference ID text should be appar.

@Release
  Scenario: Bus Ticket purchase going and comeing back
Given Check that Shohoz main page should be appare
Then Check that Bus button should be appare.
And Check that Launch button should be appare
And Check that Train button should be appare
And Check that Event button should be appare
And Check that English Language button should be appare
And Check that Bus button should be appare
When Click the button.

@Release
  Scenario: Bus Ticket purchase going and comeing back part-II
Given Check that Shohoz button should be appare.
Then Check that From text should be appare.
Then Check that Enter City input text from should be appare
When click that and write a Distict name .
Then Check that To text should be appare.
And Check that Enter City input text field should be appare.
When click that write a City name .
Then Check that Date of journey Text should be appare.
And Check that Pick a date input field  should be appare.
And Check that Pick a date input field  should be appare
When Click  that input filed and select a date.
Then Check that Date of Return  text should be appare.
And Check that Pick a date input calander should be appare.
And Check that Search Buese button should be appare.
And Check that Search Buese button should be appare
When click that