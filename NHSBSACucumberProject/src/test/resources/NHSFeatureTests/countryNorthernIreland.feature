Feature: NHSBSA health treatment check for various combinations for country NorthernIreland

  Scenario: NHSBSA treatment help check country NorthernIreland
  
    Given User launches browser and enters urlnorthernireland
    When user clicks on StartNow buttonnorthernireland
    And user selects country NorthernIrelandnorthernireland
    And user clicks Next button
    Then user checks the treatment helpnorthernireland