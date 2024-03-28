package com.pageobjects

import com.google.common.collect.ImmutableMap
import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class NFLLeadersPage(driver: WebDriver) : BasePage(driver) {
    private val js: JavascriptExecutor? = null
    private val scrollObject = HashMap<String, String>()

    //Verify the page is the leader page by its title.
    @AndroidFindBy(
        id = "com.fivemobile.thescore:id/titleTextView"
    )
    lateinit var page_title: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_category_name\" and @text=\"Passing Yards\"]")
    lateinit var category_name_passing_yards: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_go_to_full\"])[1]")
    lateinit var see_all_txt1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_leader\"])[1]")
    lateinit var big_leader_header1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/big_leader_team_logo\"])[1]")
    lateinit var big_leader_icon1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/big_leader_name\" and @text=\"T. Tagovailoa\"]")
    lateinit var big_leader_name1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/big_leader_stat\" and @text=\"4624\"]")
    lateinit var big_leader_stat1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\"])[1]")
    lateinit var second_leader_rank1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[1]")
    lateinit var second_leader_icon1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"J. Goff\"]")
    lateinit var second_leader_name1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"4575\"]")
    lateinit var second_leader_stat1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"3\"]")
    lateinit var third_leader_rank1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[2]")
    lateinit var third_leader_icon1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"D. Prescott\"]")
    lateinit var third_leader_name1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"4516\"]")
    lateinit var third_leader_stat1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"4\"]")
    lateinit var fourth_leader_rank1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[3]")
    lateinit var fourth_leader_icon1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"J. Allen\"]")
    lateinit var fourth_leader_name1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"4306\"]")
    lateinit var fourth_leader_stat1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"5\"]")
    lateinit var fifth_leader_rank1: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[4]")
    lateinit var fifth_leader_icon1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"B. Purdy\"]")
    lateinit var fifth_leader_name1: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"4280\"]")
    lateinit var fifth_leader_stat1: WebElement


    /*******************************TEAM 2=PASSING TOUCHDOWNS*******************************************************************/
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_category_name\" and @text=\"Passing Touchdowns\"]")
    lateinit var category_name_passing_touchdowns: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_go_to_full\"])[1]")
    lateinit var see_all_txt2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_leader\"])[1]")
    lateinit var big_leader_header2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/big_leader_team_logo\"])[1]")
    lateinit var big_leader_icon2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/big_leader_name\" and @text=\"D. Prescott\"]")
    lateinit var big_leader_name2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/big_leader_stat\" and @text=\"36\"]")
    lateinit var big_leader_stat2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"2\"]")
    lateinit var second_leader_rank2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[1]")
    lateinit var second_leader_icon2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"J. Love\"]")
    lateinit var second_leader_name2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"32\"]")
    lateinit var second_leader_stat2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"3\"]")
    lateinit var third_leader_rank2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[2]")
    lateinit var third_leader_icon2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"B. Purdy\"]")
    lateinit var third_leader_name2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"4\"]")
    lateinit var fourth_leader_rank2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[3]")
    lateinit var fourth_leader_icon2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"J. Goff\"]")
    lateinit var fourth_leader_name2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"30\"]")
    lateinit var fourth_leader_stat2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"5\"]")
    lateinit var fifth_leader_rank2: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[4]")
    lateinit var fifth_leader_icon2: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"29\"]")
    lateinit var fifth_leader_stat2: WebElement

    /*******************************TEAM 3=RECEIVING YARDS*******************************************************************/

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_category_name\" and @text=\"Receiving Yards\"]")
    lateinit var category_name_receiving_yards: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_go_to_full\"])[2]")
    lateinit var see_all_txt3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_leader\"])[2]")
    lateinit var big_leader_header3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/big_leader_team_logo\"])[2]")
    lateinit var big_leader_icon3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[5]")
    lateinit var second_leader_icon3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\"])[2]")
    lateinit var third_leader_rank3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[2]")
    lateinit var third_leader_icon3: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"4\"]")
    lateinit var fourth_leader_rank3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[3]")
    lateinit var fourth_leader_icon3: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\" and @text=\"5\"]")
    lateinit var fifth_leader_rank3: WebElement

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/small_leader_team_logo\"])[4]")
    lateinit var fifth_leader_icon3: WebElement

    /*******************************TEAM 9=SACKS*******************************************************************/
    @AndroidFindBy(xpath = "//*[contains(text(),\"SACKS\"]  and @resource-id='com.fivemobile.thescore:id/txt_category_name']")
    lateinit var category_name_sacks: WebElement

    @AndroidFindBy(xpath = "//*[contains(text(),\"See All\"]  and @resource-id='com.fivemobile.thescore:id/btn_go_to_full']")
    lateinit var see_all_txt7: WebElement

    @AndroidFindBy(xpath = "//*[contains(text(),\"LEADER\"]  and @resource-id='com.fivemobile.thescore:id/txt_leader']")
    lateinit var big_leader_header7: WebElement

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_rank\"])[8]")
    lateinit var small_leader_rank7: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"D. Hunter\"]")
    lateinit var small_leader_name7: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_stat\" and @text=\"16.5\"]")
    lateinit var small_leader_stat7: WebElement

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/small_leader_name\" and @text=\"D. Hunter\"]")
    lateinit var fifth_leader_stat7: WebElement

    /*******************************Locate lements on the test add***********************/
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Test Ad\"]")
    lateinit var test_add_title: WebElement

    fun first_group_of_leaders_tests() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.visibilityOf(page_title))
        wait.until(ExpectedConditions.visibilityOf(category_name_passing_yards))
        wait.until(ExpectedConditions.visibilityOf(see_all_txt1))
        wait.until(ExpectedConditions.visibilityOf(big_leader_header1))
        wait.until(ExpectedConditions.visibilityOf(big_leader_icon1))
        wait.until(ExpectedConditions.visibilityOf(big_leader_name1))
        wait.until(ExpectedConditions.visibilityOf(big_leader_stat1))
        wait.until(ExpectedConditions.visibilityOf(second_leader_rank1))
        wait.until(ExpectedConditions.visibilityOf(second_leader_icon1))
        wait.until(ExpectedConditions.visibilityOf(second_leader_name1))
        wait.until(ExpectedConditions.visibilityOf(second_leader_stat1))
        wait.until(ExpectedConditions.visibilityOf(third_leader_rank1))
        wait.until(ExpectedConditions.visibilityOf(third_leader_icon1))
        wait.until(ExpectedConditions.visibilityOf(third_leader_name1))
        wait.until(ExpectedConditions.visibilityOf(third_leader_stat1))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_rank1))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_icon1))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_name1))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_stat1))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_rank1))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_icon1))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_name1))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_stat1))
        /*******************************TEAM 2=PASSING TOUCHDOWNS***************/
        wait.until(ExpectedConditions.visibilityOf(category_name_passing_touchdowns))
        wait.until(ExpectedConditions.visibilityOf(see_all_txt2))
        wait.until(ExpectedConditions.visibilityOf(big_leader_header2))
        wait.until(ExpectedConditions.visibilityOf(big_leader_icon2))
        wait.until(ExpectedConditions.visibilityOf(big_leader_name2))
        wait.until(ExpectedConditions.visibilityOf(big_leader_stat2))


        /*****************************TEAM 3=RECEIVING YARDS************************/
        wait.until(ExpectedConditions.visibilityOf(see_all_txt3))
        wait.until(ExpectedConditions.visibilityOf(big_leader_header3))
        wait.until(ExpectedConditions.visibilityOf(big_leader_icon3))
        wait.until(ExpectedConditions.visibilityOf(second_leader_icon3))
        wait.until(ExpectedConditions.visibilityOf(third_leader_rank3))
        wait.until(ExpectedConditions.visibilityOf(third_leader_icon3))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_rank3))
        wait.until(ExpectedConditions.visibilityOf(fourth_leader_icon3))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_rank3))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_icon3))

        //Swipe all the way bottom to locate the last elements on the page.
        verticalScroll()
        //wait.until(ExpectedConditions.visibilityOf(see_all_txt7))
        //wait.until(ExpectedConditions.visibilityOf(big_leader_header7))
        wait.until(ExpectedConditions.visibilityOf(small_leader_rank7))
        wait.until(ExpectedConditions.visibilityOf(small_leader_name7))
        wait.until(ExpectedConditions.visibilityOf(small_leader_stat7))
        wait.until(ExpectedConditions.visibilityOf(fifth_leader_stat7))
        wait.until(ExpectedConditions.visibilityOf(test_add_title))
        //Clicking back button on test file
        }

    fun verticalScroll() {
        (driver as JavascriptExecutor).executeScript(
            "mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 800,
                "direction", "up",
                "percent", 0.95
            )
        )
    }
}


