package TestAutomation;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;



public class TestHelper {

    private final static Logger LOG = Logger.getLogger(TestHelper.class.getName());

    public static void LogTest(String test) {
        LOG.log(INFO, "Test : " + test);
        System.out.println("Running Test : " + test);
    }

    public static void LogEvent(String event) {
        LOG.log(INFO, "Event : " + event);
        System.out.println("Event : " + event);
    }

    public static void debugEvent(String event) {
        LOG.log(INFO, "Debug : " + event);
        System.out.println("Debug : " + event);
    }
}


