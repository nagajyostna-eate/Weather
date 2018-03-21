$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Weatherforcast/Hourlyforcast.feature");
formatter.feature({
  "line": 2,
  "name": "As a User if i enter city name, and if i select Select day, get 3 hourly forecast.",
  "description": "\nAs a weather forcast Customer,if i enter city name, and if i select Select day, get 3 hourly forecast.",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hourlyforecast"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Select day, get 3 hourly forecast",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day,-get-3-hourly-forecast",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "launch weather application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "i enter city name",
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 11
    },
    {
      "cells": [
        "\u003ccity\u003e"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "i click on day",
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 15
    },
    {
      "cells": [
        "\u003cday\u003e"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "i should  get 3 hourly forecast",
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 19
    },
    {
      "cells": [
        "\u003cday\u003e"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "i close the weather application",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day,-get-3-hourly-forecast;",
  "rows": [
    {
      "cells": [
        "city",
        "day"
      ],
      "line": 27,
      "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day,-get-3-hourly-forecast;;1"
    },
    {
      "cells": [
        "edinburgh",
        "3"
      ],
      "line": 28,
      "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day,-get-3-hourly-forecast;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Select day, get 3 hourly forecast",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day,-get-3-hourly-forecast;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@hourlyforecast"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "launch weather application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "i enter city name",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 11
    },
    {
      "cells": [
        "edinburgh"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "i click on day",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 15
    },
    {
      "cells": [
        "3"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "i should  get 3 hourly forecast",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 19
    },
    {
      "cells": [
        "3"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "i close the weather application",
  "keyword": "Then "
});
formatter.match({
  "location": "WebApplicationStepDefinition.launchapplication()"
});
formatter.result({
  "duration": 8809351281,
  "error_message": "org.openqa.selenium.WebDriverException: Process unexpectedly closed with status 0\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027DESKTOP-5GACBMG\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:476)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:209)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:132)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:120)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:98)\r\n\tat TestAutomation.webApplication.webHelper.launchWebDriver(webHelper.java:13)\r\n\tat CucumberSteps.WebApplicationStepDefinition.launchapplication(WebApplicationStepDefinition.java:29)\r\n\tat ✽.Given launch weather application(Weatherforcast/Hourlyforcast.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.enterCity(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebApplicationStepDefinition.clickDay(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebApplicationStepDefinition.get3HourForCast(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebApplicationStepDefinition.closeWeatherApp()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Select day again, hide 3 hourly forecast",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day-again,-hide-3-hourly-forecast",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 32,
  "name": "launch weather application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "i enter city name",
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 35
    },
    {
      "cells": [
        "\u003ccity\u003e"
      ],
      "line": 36
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "i click on day",
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 39
    },
    {
      "cells": [
        "\u003cday\u003e"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "i click on day",
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 45
    },
    {
      "cells": [
        "\u003cday\u003e"
      ],
      "line": 46
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "should hide 3 hourly forecast",
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 49
    },
    {
      "cells": [
        "\u003cday\u003e"
      ],
      "line": 50
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "i close the weather application",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day-again,-hide-3-hourly-forecast;",
  "rows": [
    {
      "cells": [
        "city",
        "day"
      ],
      "line": 56,
      "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day-again,-hide-3-hourly-forecast;;1"
    },
    {
      "cells": [
        "edinburgh",
        "3"
      ],
      "line": 57,
      "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day-again,-hide-3-hourly-forecast;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 57,
  "name": "Select day again, hide 3 hourly forecast",
  "description": "",
  "id": "as-a-user-if-i-enter-city-name,-and-if-i-select-select-day,-get-3-hourly-forecast.;select-day-again,-hide-3-hourly-forecast;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@hourlyforecast"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "launch weather application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "i enter city name",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 35
    },
    {
      "cells": [
        "edinburgh"
      ],
      "line": 36
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "i click on day",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 39
    },
    {
      "cells": [
        "3"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "i click on day",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 45
    },
    {
      "cells": [
        "3"
      ],
      "line": 46
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "should hide 3 hourly forecast",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "day"
      ],
      "line": 49
    },
    {
      "cells": [
        "3"
      ],
      "line": 50
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "i close the weather application",
  "keyword": "Then "
});
formatter.match({
  "location": "WebApplicationStepDefinition.launchapplication()"
});
formatter.result({
  "duration": 14034292650,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.enterCity(DataTable)"
});
formatter.result({
  "duration": 1288704256,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.clickDay(DataTable)"
});
formatter.result({
  "duration": 479711692,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.clickDay(DataTable)"
});
formatter.result({
  "duration": 420619826,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.hideforcaste(DataTable)"
});
formatter.result({
  "duration": 20672685,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationStepDefinition.closeWeatherApp()"
});
formatter.result({
  "duration": 2139567179,
  "status": "passed"
});
});