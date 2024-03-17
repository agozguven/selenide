package common;

import driver.DriverFactory;
import pages.ElementPage;

public class PageManager {

    public ElementPage elementPage;

    public PageManager() {

        DriverFactory.initDriver();


        elementPage = PageFactory.buildElementPage();

    }
}