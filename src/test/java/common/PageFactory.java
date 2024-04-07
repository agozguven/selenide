package common;

import org.apache.log4j.Logger;
import pages.ElementPage;


public class PageFactory {

    static final Logger logger = Logger.getLogger(PageFactory.class);
    public static ElementPage buildElementPage() {
        return new ElementPage("/");
    }


}