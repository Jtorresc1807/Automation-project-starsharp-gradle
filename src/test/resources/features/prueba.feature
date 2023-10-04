#Autor: Jaime Torres

@UserHistory
Feature: Verify the correct entry to the serenity.is page
  I as a user want to enter the page to verify that I have access

  Background:
    Given that Jaime enters the page serenity
    When Enter the credentials and enter the page

  @CaseLogin
  Scenario: Verify correct entry
    Given that Jaime enters the page serenity
    When Enter the credentials and enter the page
    Then Verify that you were able to enter correctly

    @CreateBusinessUnits
    Scenario: Create a new Business Units
      When enter the organization menu
      And enter the business unit menu
      And created the business unit
