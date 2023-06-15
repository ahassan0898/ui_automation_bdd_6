Feature: Wiki search functionality


  Scenario : Validate Wiki search
    Given user navigates to "http://www.wikipedia.org/"
    When user searches for "Elon Musk" on Wikipedia
    Then user should see "Elon Musk" in the title
    And user should see "Elon Musk" in the url
    And user should see "Elon Musk" in the first heading