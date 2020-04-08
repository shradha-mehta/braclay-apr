package uk.co.braclays.pages;


import org.openqa.selenium.By;
import uk.co.braclays.utility.Utility;

//login page class extends utility class to use utilities property
    public class LoginPage extends Utility {
        //below locators for element
        By loginText = By.id("label-mainheading");

        //below return type method to compare expected and actual result
        public String getLoginText() {
            return getTextFromElement(loginText);
        }
    }


