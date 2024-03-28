package main.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class FavoritesPage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(id = "com.fivemobile.thescore:id/icon")
    lateinit var favoritesPageIcon: WebElement

    @AndroidFindBy(id = "com.fivemobile.thescore:id/img_logo")
    lateinit var nfl_football_img: WebElement

    @AndroidFindBy(id = "com.fivemobile.thescore:id/label")
    lateinit var nfl_football_selected_icon_lbl: WebElement

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    lateinit var continue_btn: WebElement


    fun locate_favourates_views() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.visibilityOf(favoritesPageIcon))
        wait.until(ExpectedConditions.visibilityOf(nfl_football_img))
        nfl_football_img.click()
        wait.until(ExpectedConditions.visibilityOf(nfl_football_selected_icon_lbl))
        continue_btn.click()
    }
    }
