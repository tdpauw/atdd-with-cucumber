Feature: HelloWorld

  Scenario: greeting
    Given a user Bob
    When Bob logs in
    Then a greeting is displayed saying "Hello Bob!"

