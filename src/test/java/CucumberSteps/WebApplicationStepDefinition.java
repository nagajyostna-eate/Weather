package CucumberSteps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.*;


public class WebApplicationStepDefinition extends WebApplicationObjectDeclaration {




    public WebApplicationStepDefinition()
    {

    }
    /*********************************** Given************************/
    @Given("launch weather application")
    public  void launchapplication()  {
           driver = TestAutomation.webApplication.webHelper.launchWebDriver();
    }


    /*********************************** When************************/
    @When("i enter city name")
    public void enterCity(DataTable cityDetail) throws Throwable {
        Thread.sleep(100);
        List<Map<String, String>> data = cityDetail.asMaps(String.class, String.class);
        String city = null;

        for (Map map : data) {
            for (Object key : map.keySet()) {

                switch (key.toString()) {
                    case "city":
                        city = map.get("city").toString();

                        driver.findElement(By.id(properties.getProperty("City"))).clear();

                        driver.findElement(By.id(properties.getProperty("City"))).sendKeys(city);
                        driver.findElement(By.id(properties.getProperty("City"))).click();
                        break;

                }
            }
        }


    }



    @When("i click on day")
    public void clickDay(DataTable daydetails) throws Throwable
    {
        List<Map<String, String>> data = daydetails.asMaps(String.class, String.class);
        String day = null;

        Thread.sleep(50);
        for (Map map : data) {
            for (Object key : map.keySet()) {

                day = map.get("day").toString();
                switch (day) {

                    case "1":
                        driver.findElement(By.xpath(properties.getProperty("Day1"))).click();
                        break;
                    case "2":
                        driver.findElement(By.xpath(properties.getProperty("Day2"))).click();
                        break;

                    case "3":
                        driver.findElement(By.xpath(properties.getProperty("Day3"))).click();
                        break;
                    case "4":
                        driver.findElement(By.xpath(properties.getProperty("Day4"))).click();
                        break;

                    case "5":
                        driver.findElement(By.xpath(properties.getProperty("Day5"))).click();
                        break;

                }
            }
        }
    }


    /*********************************** Then************************/

    @Then("i should get  5 day weather forecast")
    public void getForecast()
    {
        // fetch system day

        String systemday = null;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        // 3 letter name form of the day
        systemday = (new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));

        // get the days that are displaying

        // verify if the elements exists
        Assert.assertTrue(driver.findElements(By.xpath(properties.getProperty("Day1"))).size()>0 );
        Assert.assertTrue(driver.findElements(By.xpath(properties.getProperty("Day2"))).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath(properties.getProperty("Day3"))).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath(properties.getProperty("Day4"))).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath(properties.getProperty("Day5"))).size()>0);
        // get days that are getting displayed
        String firstDay = driver.findElement(By.xpath(properties.getProperty("Day1"))).getText();
        String secondDay =driver.findElement(By.xpath(properties.getProperty("Day1"))).getText();
        String ThirdDay = driver.findElement(By.xpath(properties.getProperty("Day1"))).getText();
        String fourthDay =  driver.findElement(By.xpath(properties.getProperty("Day1"))).getText();
        String fiftyday = driver.findElement(By.xpath(properties.getProperty("Day1"))).getText();


        // compare the days that are displaying with the system day

        switch (systemday)
        {
            case "Sun" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday  );
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Mon"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Tue"));
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Wed"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Thu"));
                break;

            case "Mon" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday);
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Tue"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Wed"));
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Thu"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Fri"));
                break;

            case "Tue" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday);
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Wed"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Thu"));
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Fri"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Sat"));
                break;

            case "Wed" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday );
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Thu"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Fri") );
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Sat"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Sun"));
                break;

            case "Thu" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday );
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Fri"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Sat"));
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Sun"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Mon") );
                break;

            case "Fri" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday );
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Sat"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Sun") );
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Mon"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Tue") );
                break;

            case "Sat" :

                Assert.assertFalse("forcast is not displaying as expected " , firstDay == systemday);
                Assert.assertFalse("forcast is not displaying as expected " , secondDay.equalsIgnoreCase("Sun"));
                Assert.assertFalse("forcast is not displaying as expected " , ThirdDay.equalsIgnoreCase("Mon") );
                Assert.assertFalse("forcast is not displaying as expected " , fourthDay.equalsIgnoreCase("Tue"));
                Assert.assertFalse("forcast is not displaying as expected " , fiftyday.equalsIgnoreCase("Wed"));
                break;



        }




    }


    @Then("i should  get 3 hourly forecast")
    public void get3HourForCast(DataTable daydetails) throws Throwable {
        // get systemtime
        Date date = new Date();
        Calendar rightNow = Calendar.getInstance();
        int inthour = rightNow.get(Calendar.HOUR_OF_DAY);
        inthour = (inthour)*100;
        int firsthr = 0;
        int hr = 0;
        // get application hours

        List<Map<String, String>> data = daydetails.asMaps(String.class, String.class);
        String day = null;
        for (Map map : data) {
            for (Object key : map.keySet()) {

                day = map.get("day").toString();
                switch (day) {

                    case "1":

                        List<WebElement> Day1_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day1_hourlyForecaste")));
                        for (int i = 0; i < Day1_hourlyForecaste.size(); i++) {
                            String Day1_hourlyforecast = (Day1_hourlyForecaste.get(i).getText());
                            String[] hours = Day1_hourlyforecast.split("\\r?\\n");
                            String firsthour = hours[0];
                            firsthr = Integer.parseInt(firsthour);
                            Assert.assertTrue("3 hourly forcast is displaying incorrectly", firsthr == (inthour + (i * 3 * 100)));

                        }
                        break;

                    case "2":

                        List<WebElement> Day2_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day2_hourlyForecaste")));
                        for (int i = 0; i < Day2_hourlyForecaste.size(); i++) {
                            String Day2_hourlyforecast = (Day2_hourlyForecaste.get(i).getText());
                            String[] hours = Day2_hourlyforecast.split("\\r?\\n");
                                String firsthour = hours[0];
                                firsthr = Integer.parseInt(firsthour);
                                Assert.assertTrue("3 hourly forcast is displaying incorrectly", firsthr == (inthour + (i * 3 * 100)));

                        }
                        break;

                    case "3":

                        List<WebElement> Day3_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day3_hourlyForecaste")));
                        for (int i = 0; i < Day3_hourlyForecaste.size(); i++) {
                            String Day3_hourlyforecast = (Day3_hourlyForecaste.get(i).getText());
                            String[] hours = Day3_hourlyforecast.split("\\r?\\n");
                            String firsthour = hours[0];
                            firsthr = Integer.parseInt(firsthour);
                            Assert.assertTrue("3 hourly forcast is displaying incorrectly", firsthr == (inthour + (i * 3 * 100)));

                        }
                        break;


                    case "4":

                        List<WebElement> Day4_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day4_hourlyForecaste")));
                        for (int i = 0; i < Day4_hourlyForecaste.size(); i++) {
                            String Day3_hourlyforecast = (Day4_hourlyForecaste.get(i).getText());
                            String[] hours = Day3_hourlyforecast.split("\\r?\\n");
                            String firsthour = hours[0];
                            firsthr = Integer.parseInt(firsthour);
                            Assert.assertTrue("3 hourly forcast is displaying incorrectly", firsthr == (inthour + (i * 3 * 100)));

                        }
                        break;

                    case "5":

                        List<WebElement> Day5_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day5_hourlyForecaste")));
                        for (int i = 0; i < Day5_hourlyForecaste.size(); i++) {
                            String Day3_hourlyforecast = (Day5_hourlyForecaste.get(i).getText());
                            String[] hours = Day3_hourlyforecast.split("\\r?\\n");
                            String firsthour = hours[0];
                            firsthr = Integer.parseInt(firsthour);
                            Assert.assertTrue("3 hourly forcast is displaying incorrectly", firsthr == (inthour + (i * 3 * 100)));

                        }
                        break;

                }
            }
        }
    }

    @Then("should hide 3 hourly forecast")
        public void hideforcaste(DataTable daydetails) throws Throwable {
        String day = null;
        List<Map<String, String>> data = daydetails.asMaps(String.class, String.class);

        for (Map map : data) {
            for (Object key : map.keySet()) {

                day = map.get("day").toString();
                switch (day) {

                    case "1":

                        List<WebElement> Day1_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day1_hourlyForecaste")));
                        Assert.assertFalse("Should hid 3 hourly forecast", Day1_hourlyForecaste.size() < 0);
                        break;

                    case "2":

                        List<WebElement> Day2_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day2_hourlyForecaste")));
                        Assert.assertFalse("Should hid 3 hourly forecast", Day2_hourlyForecaste.size() < 0);
                        break;

                    case "3":

                        List<WebElement> Day3_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day3_hourlyForecaste")));

                        break;


                    case "4":

                        List<WebElement> Day4_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day4_hourlyForecaste")));
                        Assert.assertFalse("Should hid 3 hourly forecast", Day4_hourlyForecaste.size() < 0);
                        break;

                    case "5":

                        List<WebElement> Day5_hourlyForecaste = driver.findElements(By.xpath(properties.getProperty("Day5_hourlyForecaste")));
                        Assert.assertFalse("Should hid 3 hourly forecast", Day5_hourlyForecaste.size() < 0);
                        break;

                }
            }
        }
    }




    /*********************************** And************************/

    @And("i close the weather application")
    public void closeWeatherApp()
    {
        driver.close();
    }




}
