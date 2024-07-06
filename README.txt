Hi this is an Android Appium Kotlin automation I created just my profile, the projects, which I worked on my professional life is alot complex than this one.



Appium setup

Download idk from oracle.
Set environment variable

Create .zshrc file on Mac
nano ~/.zshrc

Set environment variable on Mac:
echo export "JAVA_HOME=\$(/usr/libexec/java_home)" >> ~/.zshrc
To open vim .zshrc


Brew install node
Install appium and appium doctor

Download Carthage


Download android studio
download appium inspector and save below configuration for appium inspector:
{
  "platformName": "android",
  "appium:platformVersion": "14",
  "appium:deviceName": "Api34",
  "appium:automationName": "uiautomator2",
  "appium:noReset": "true",
  "appium:activityName": "MainActivity"
}

Create emulator with api 34 and name it "Api34"
the apk file is located inside the project apps folder.
download Apk to the emulator fixing below dir with yours
Install apk on emulator. Adb install <path to .apk file:
adb install "your path to apk file check my path below"
/Users/yaseminyarnell/intellijProjects/AppiumMavenKotlinTest/apps/Thescore.apk



export JAVA_HOME=$(/usr/libexec/java_home)
export ANDROID_HOME=$HOME/Library/Android/idk
export PATH=$PATH:$ANDROID_HOME/platform-tools
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/emulator

source ~/.zshrc
echo $ANDROID_HOME


Go to .appium dir and install android driver using the below command inside the below dir
 appium driver install uiautomator2
/Users/yaseminyarnell/Library/Android/sdk/platform-tools

/opt/homebrew/Cellar/maven/3.9.6/libexec  //maven environment variable

Download Appium java-client 8.5.1 jar and put the jar in java-client 8.3.0 folder change folder name to 8.5.0 from 8.3.0
/Users/yaseminyarnell/.m2/repository/io/appium/java-client

Set Appium-java-client 8.6.0 compatible dependencies https://mvnrepository.com/artifact/io.appium/java-client/8.6.0

install maven and junit in intellj.
before running the the project, start the emulator from Android studio.
edit run configuration with choosing jdk and junit to run TheScoreTests file.

Do a maven clean / maven test/ maven clean install

You will find a video of my screen showing after executing the tests and they are passing. The screen
recording file is in video folder in the project.



