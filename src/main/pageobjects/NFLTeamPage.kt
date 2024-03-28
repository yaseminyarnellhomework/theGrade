package main.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class NFLTeamPage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Leaders']")
        lateinit var leaders_tab: WebElement

    fun click_leaders_tab() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.visibilityOf(leaders_tab))
        leaders_tab.click()
    }
}
