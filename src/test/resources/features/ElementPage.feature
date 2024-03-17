Feature: As a user check elements on Elements Page

  Background:
    Given Open demoqa site

  Scenario: Test ClickMeButton on Buttons Element
    When Click Buttons
    When Click ClickMeButton
    Then ClickMeButton is clicked successfully

  Scenario: Add and edit item on Webtable Element
      When Click Webtables
      When Enter inputs for new item and click submit button
      Then User added item on webtable successfully
      When click edit button and clear firstname and enter firstname and click submit button
      Then User editted firstname of added item on webtable successfully


