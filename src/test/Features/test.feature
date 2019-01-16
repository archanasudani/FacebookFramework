Feature: Facebook Login
  As a user of Facebook

Background:
  Given  That the user is navigated to the Facebook login page

  Scenario1: positioning the cursor
    When  The login page is sucessfully opened
    Then  my cursor is sucessfully positioned in username

  Scenario2: Login with Invalid user name
    When  enter <user name> and <password>
    And   click the login button
    Then  it should throw <error>
    And   cursor is pointed to username
    And   username box is highlighted

    Examples:
      | username       | password          | error                                                       |
      |  Invalid user  |  Null             |  The username that you've entered is incorrect.             |
      |  Invalid user  | Invalid Password  |  The username that you've entered is incorrect.             |
      |  blank user    | valid Password    |  The username that you've entered doesn't match any account |


  Scenario3: Login with valid user name and InValid password
    When  enter <user name> and <password>
    And   click the login button
    Then  it should throw <error>
    And   cursor is pointed to password
    And   password box is highlighted

    Examples:
      | username       | password          | error                                             |
      |  valid user    | Invalid Password  |  The password that you've entered is incorrect.   |
      |  valid user    |  Null             |  The password that you've entered is incorrect.   |


 Scenario4: Successful Login with Valid Credentials
    When  enter <user name> and <password>
    And   click the login button
    Then  It should sucessfully navigate to FB main page


  Scenario5: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully
