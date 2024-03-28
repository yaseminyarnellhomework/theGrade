package main.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class TheScoreMainPage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/label\" and @text=\"NFL\"]")
    lateinit var nfl_lbl: WebElement


    fun click_nfl_team_lbl() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.visibilityOf(nfl_lbl))
        nfl_lbl.click()
    }
    }
