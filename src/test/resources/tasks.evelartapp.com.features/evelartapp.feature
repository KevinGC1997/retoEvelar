Feature: checking the website evelartapp.com test to login

  @login
  Scenario Outline: Brandon wants to test the website
    Given That Brandon access successfully to the <website>
    When Brandon logins on the site
      | email   | password   |
      | <email> | <password> |
    Then validate title <validate>
    Examples:
      | website                                      | email  | password                                         | validate                 |
      | https://tasks.evalartapp.com/automatization/ | 673662 | 10df2f32286b7120Mi00LTI2NjM3Ng==30e0c83e6c29f1c3 | Prueba de automatización |


  @responderP
  Scenario Outline: Brandon wants to test the website
    Given That Brandon access successfully to the <website>
    When Brandon logins on the site and response question
      | email   | password   |
      | <email> | <password> |
    Examples:
      | website                                      | email  | password                                         |
      | https://tasks.evalartapp.com/automatization/ | 676922 | 10df2f32286b7120MS00LTIyOTY3Ng==30e0c83e6c29f1c3 |
