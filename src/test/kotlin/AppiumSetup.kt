/*
 * Copyright (C) 2021 Baracoda Daily Healthtech
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.appium.java_client.service.local.AppiumDriverLocalService
import io.appium.java_client.service.local.AppiumServiceBuilder
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import java.util.concurrent.TimeUnit


open class AppiumSetup {


    //private val activityName = "MainActivity"
    private val appPackage = "com.fivemobile.thescore"
    private val automationName = "UiAutomator2"
    private val platformName = "Android"
    private val deviceName = "emulator-5554"
    private val app = "apps/Thescore.apk"
    public val APP_ID = "io.appium.android.apis";
    private var androidDriver: AndroidDriver? = null
    private val options = UiAutomator2Options()
    var builder = AppiumServiceBuilder()


    fun getAppiumService(): AppiumDriverLocalService {

        var service =
            AppiumDriverLocalService.buildService(AppiumServiceBuilder().withIPAddress("127.0.0.1").usingAnyFreePort())

        service.start()   // bind remote or create local server

        if (!service!!.isRunning) {
            service!!.start()
        }
        return service
    }

    fun getAndroidDriver(): AndroidDriver {
        if (androidDriver == null) {
            //options.setAppActivity(activityName)
            options.setAppPackage(appPackage)
            options.setAutomationName(automationName)
            options.setDeviceName(deviceName)
            options.setPlatformName((platformName))
            options.setApp(app)

            options.setAutoGrantPermissions(true)


            androidDriver = AndroidDriver(getAppiumService().url, options)
                .apply {
                    manage().timeouts().implicitlyWait(2500, TimeUnit.MILLISECONDS)
                }
        }
        return androidDriver!!
    }


    @AfterMethod
    fun endSession() = try {
        getAndroidDriver().quit()
    } catch (ign: Exception) {
    }

    @AfterClass
    fun stopAppiumServer() {
        /*var service =
            AppiumDriverLocalService.buildService(AppiumServiceBuilder().withIPAddress("127.0.0.1").usingAnyFreePort())*/
        getAppiumService().stop()
    }


}







