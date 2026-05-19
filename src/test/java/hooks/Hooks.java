package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {

        String browser =
                System.getProperty("browser", "chrome");

        DriverFactory.initDriver(browser);

        DriverFactory.getDriver()
                .manage()
                .window()
                .maximize();
    }

    @After
    public void teardown() {

        DriverFactory.quitDriver();
    }
}