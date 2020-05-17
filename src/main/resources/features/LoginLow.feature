Feature: As user I want to log in

Scenario: I should be able to open login page
  Given I have open main page
  When I click 'home' button
  When I provide proper credentials
  Then I should log in

Scenario Outline: I should not be log in when provide invalid credentials
  Given I have open main page
  When I click 'home' button
  When I provide invalid credentials <email> and <password>
  Then I should not be able to log in

  Examples:
    |   email                 |  password
    | "abc"                   |  "aaaa"
    | "asdb@abc.com"          |  null
    | "test_email@gmail.com"  |  "123456"
    | "invalid@email.com"     |  "ValidPassword"