  @hourlyforecast
  Feature: As a User if i enter city name, and if i select Select day, get 3 hourly forecast.

  As a weather forcast Customer,if i enter city name, and if i select Select day, get 3 hourly forecast.

  Scenario Outline: Select day, get 3 hourly forecast

    Given launch weather application

    When i enter city name
      |city  |
      |<city> |

    When i click on day
      |day|
      |<day>|

    Then i should  get 3 hourly forecast
      |day|
      |<day>|

    Then i close the weather application


    Examples:

      |city      |day|
      |edinburgh |3   |

    Scenario Outline: Select day again, hide 3 hourly forecast

      Given launch weather application

      When i enter city name
        |city  |
        |<city> |

      When i click on day
        |day|
        |<day>|



      When i click on day
        |day|
        |<day>|

      Then should hide 3 hourly forecast
        |day|
        |<day>|

      Then i close the weather application

      Examples:

        |city      |day|
        |edinburgh |3   |


