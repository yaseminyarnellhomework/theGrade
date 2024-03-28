

import com.pageobjects.HomePage
import com.pageobjects.NFLLeadersPage
import main.pageobjects.*
import org.junit.Test


/**
 * Created by zoonooz on 2017/11/17.
 * Test login process
 */
class TheScoreTests : AppiumSetup(){

    /**
     * User should be able to login
     *
     * Given: I am at login page
     *  Then I login with my name
     *  I should see success status
     */
    @Test
    fun execute_all_tests() {
        var driver = getAndroidDriver()
        val homePage = HomePage(driver!!)
        homePage.click_login_link()
        val favoritesPage = FavoritesPage(driver!!)
        favoritesPage.locate_favourates_views()
        val popularInYourAreaPage = PopularInYourAreaPage(driver!!)
        popularInYourAreaPage.click_continue_btn()
        val favoritesLastPage = FavoritesLastPage(driver!!)
        favoritesLastPage.click_done_btn()
        val theScoreMainPage = TheScoreMainPage(driver!!)
        theScoreMainPage.click_nfl_team_lbl()
        val nflTeampage= NFLTeamPage(driver!!)
        nflTeampage.click_leaders_tab()
        val nflLeadersPage = NFLLeadersPage(driver!!)
        nflLeadersPage.first_group_of_leaders_tests()
        /*val currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);*/
        getAndroidDriver().navigate().back()


        //assertTrue(mainPage.isLoginSuccess())
    }

}