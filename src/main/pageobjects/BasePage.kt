package main.pagebjects

import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

open class BasePage(val driver: WebDriver) {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }
}