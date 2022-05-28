Feature: Searching item on Gumtree

  Scenario Outline: Search for item On Gumtree

    Given I'm in Gumtree homepage
    When I search for "<item>"
    And In "<Category>" from Categories
    And In "<Region>"
    And within "<Range>"
    And Click on search
    And Choose random result
    Then Verify the ad details page opens
    And Verify a numeric ad id is displayed in the breadcrumbs
    And Verify at least one similar ad is displayed in the page



    Examples:

    |item                 |Category              |Region            |Range|
    |Sennheiser Headphones|Electronics & Computer|Sydney Region, NSW|20km |

