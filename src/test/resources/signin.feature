Feature: Registration
  @first
  Scenario: Submit with all valid fields
    Given I open URL as "http://www.d3dsecurity.co.uk"
    Given I click Contact Us button
    And I enter valid first name as "kishor"
    And I enter valid last name as "Last name 123"
    And I enter valid email id as " Test123@hotmail.com"
    And I enter valid phone number as "Phone number 123"
    And I enter subject as "Subject 123"
    And I enter message as "Please help me with this query"
    And I enter valid captcha code as " Test captcha code 123"
    When I click Send button
    Then I should see message "Your message has been successfully sent tp our team"

    @smoke @signin @regression
      Scenario: automation practice
      Given I open URL as "http://automatonpractice.com/index.php"
      When I click Contact Us button
      Given I select "Webmaster" from the subject heading drop down
      And I enter valid email id as "test@hotmail.com"
      And I enter order reference as "Order123"
      And I attach "Test123.pdf"file
      And I enter message as "Please help me with this query"
      When I click Send button
      Then I should see something


      @regression
      Scenario:automation practice
        Given I open URL as "http://automationpractice.com/index.php"
        When I click Sign In button
        When I select Already Registered button
        And I enter valid email id as "test@hotmail.com"
        And I enter password as "password123"
        When I click Sign In button
        Then I go to the homepage

