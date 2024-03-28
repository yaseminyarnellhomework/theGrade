package com.pageobjects

import io.appium.java_client.pagefactory.AndroidFindBy
import main.pagebjects.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class HomePage(driver: WebDriver) : BasePage(driver) {

    @AndroidFindBy(id = "com.fivemobile.thescore:id/txt_welcome")
    lateinit var title: WebElement

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    lateinit var getting_started_btn: WebElement


    fun click_login_link() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        //wait.until(ExpectedConditions.visibilityOf(title))
        wait.until(ExpectedConditions.visibilityOf(getting_started_btn))
        getting_started_btn.click()
    }
    }
