# MTTPP_Projekt

- This is project for "Metode i tehnike testiranja programske podrške" course for students attending The Faculty of Electrical Engineering, Computer Science and Information Technology Osijek.
- In this project an Android application named **OrganizeMe** and developed as final paper was tested. The application's goal is to show Google's [Material Design guidelines](https://material.io/). The user has the ability to register and login into their account. Once registered, user can create boards in which they can create a number of tasks to work on and add friends and colleagues.The application's .apk file is attached. You can find more about the app [here](https://github.com/perooo1/OrganizeMe-App).

## Tools and methods used

- Android software development kit - [link](https://developer.android.com/studio)
- Java development kit - [link](https://www.guru99.com/install-java.html)
- TestNG test framework - [link](https://mvnrepository.com/artifact/org.testng/testng)
- IntelliJ Studio integrated development environment - [link](https://www.jetbrains.com/idea/download/#section=windows)
- Appium v1.18.3 - [link](https://github.com/appium/appium-desktop/releases/tag/v1.18.3)
- OrganizeMe application - attached
- Page Object Model design pattern 

## Tests

- Foreach activity new class is created and a separate class containing test cases.
- Properties used to recognize elements mostly were used *resource-id*  and *xpath*.
- In **appiumPaths.txt** text file you can find used properties obtained from Appium client.
- In **target/surefire-reports** you can find **index.html** file containing test results.
- A total of six test cases were run, three of which pass and three of which do not. The ones that do not pass is due to not being able to obtain correct property from appium.
- Test cases include getting description texts, registering user and logging user in.
