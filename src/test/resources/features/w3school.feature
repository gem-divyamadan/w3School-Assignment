Feature: single testcase feature

  Scenario: Open w3school
    Given Open w3school
    Then Verify that website is opened by taking the web logo or end of page text match

  Scenario: Click on loginButton
    Given Open w3school
    Then click on loginButton
    Then verify login page is open

    Scenario:Click on search result option
      Given Open w3school
      Then Input Java in search & click on search result
      Then click on Java Tutorial page

    Scenario: Click on Home Button
      Given Open w3school
      Then Input Java in search & click on search result
      Then click on Java Tutorial page
      Then click on Home Button
      Then verify back on landing page

    Scenario: Click on Enter key
      Given Open w3school
      Then Enter string Exercise & click on enter
      Then verify exercise page is opened


     Scenario: Scroll down and click on HTML Tutorial
       Given Open w3school
       Then Enter string Exercise & click on enter
       Then click on HTML Tutorial
       Then verify page Html Tutorial is open

     Scenario: Click on next button
       Given Open w3school
       Then Enter string Python Tutorial & click on enter
       Then click on next button
       Then Verify next topic is opened


    Scenario:Click on try it yourself
      Given Open w3school
      Then Enter string Python Tutorial & click on enter
      Then Click on try it yourself
      Then verify new tab is open



