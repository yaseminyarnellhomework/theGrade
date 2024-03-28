package main.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class FavoritesLastPage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    lateinit var done_btn: WebElement


    fun click_done_btn() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        //after clicking the nfl image below view shows up on top, check visibility
        wait.until(ExpectedConditions.visibilityOf(done_btn))
        done_btn.click()
    }
    }
