@fivedayforcast
Feature: As a User if i enter city name , should give 5 day weather forcast

  As a weather forcast Customer, if i enter the city  , i should get 5 days weather forecast

  Scenario Outline: generate 5 day weather forecast by entering valid city name

    Given launch weather application

    When i enter city name
      |city  |
      |<city> |

    Then i should get  5 day weather forecast

    Then i close the weather application

    Examples:

      |city  |
      |edinburgh |


