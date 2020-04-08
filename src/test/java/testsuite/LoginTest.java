package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;
import uk.co.braclays.pages.HomesPage;
import uk.co.braclays.pages.LoginPage;

//login test class extends with test base class
public class LoginTest extends TestBase {


        //object created
        HomesPage homePage = new HomesPage();
        LoginPage loginPage = new LoginPage();


        @Test
        public void verifyUserShouldNavigateToLoginFeature() {
            //below methods calling from pages package
            homePage.clickOnLoginButton();

            //compare expected with actual result
            String expectedResult = "How would you like to log in?";
            String actualResult = loginPage.getLoginText();
            Assert.assertEquals(expectedResult, actualResult);
        }
    }

