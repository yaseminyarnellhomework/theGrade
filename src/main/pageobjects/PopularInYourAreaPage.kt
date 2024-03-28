package main.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class PopularInYourAreaPage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    lateinit var continue_btn: WebElement


    fun click_continue_btn() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.visibilityOf(continue_btn))
        continue_btn.click()
    }
    }
