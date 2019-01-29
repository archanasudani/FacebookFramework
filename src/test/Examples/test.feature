Feature: Chrome Installed

  Scenario Outline: Open multi url
    Given  That the user is navigated to the ChromeBrowser
    When I access "<BankWebsite>"Website
    Then I can see "<BankName>"homepage

    Examples:
      | BankWebsite               | BankName |
      | https://www.hsbc.com/     | HSBC     |
      | https://www.barclays.com/ | Barclays |


  Examples1:
      |BankWebsite|BankName|
#  |https://www.lloydsbank.com/|Lloyds|
#   |https://www.Santander.com/|Santander|
#   |https://www.halifax.co.uk/|Halifax|
