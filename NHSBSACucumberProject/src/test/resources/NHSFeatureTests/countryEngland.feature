Feature: NHSBSA health treatment check for various combinations for country England

  Scenario: NHSBSA treatment help check country England(Combination1)
  
    Given User launches browser and enters urlengland
    When user clicks on StartNow buttonengland
    And user selects country England clicks Next
    And user selects GPPractice yes clicks Next
    And user selects dental practice country England clicks Next
    And user enter Date of Birth clicks Next
    And user enters livein partner Yes and clicks Next
    And user selects benefits Yes and Clicks Next
    And user selects universal credit Yes and clicks Next
    And user selects response and clicks Next
    And user selects less than 935 pond and clicks Next
    Then user lands on NHSBSA help Page

