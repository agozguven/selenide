package common;

import pages.ElementPage;


public class PageFactory {


    public static ElementPage buildElementPage() {
        return new ElementPage("/");
    }

}