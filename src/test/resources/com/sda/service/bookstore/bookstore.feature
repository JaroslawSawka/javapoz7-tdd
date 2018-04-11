Feature:
  Scenario: I can add book to bookstore
    Given I instantiate bookstore
    And I create a book
    When I add book to bookstore
    Then Book is present in bookstore

  Scenario: I can edit books title
    Given I instantiate bookstore
    And I create a book
    When I add book to bookstore
    And I edit title of book
    Then Book's title has changed
