# AppiumAmazonProject

Framework Architecture
----------------------------------

1)Base</br>- All initialisation related to driver, utilities,property,waits has been done here
2)Listener</br> -Custom and extent listener has been implemented for reporting, screenshot on failure
3)Screens</br>- we have followed page object design model and separated our business scenarios from test cases
4)TestCases</br>- all tests has been implemented
5)Utility</br>all type of resubale methods like excel reading, handling of property files etc
6)Logs</br>- description for methods has been implemnted with logs
7)apks</br>- amazon app is present
8)properties</br> all constant keys like url,package name has been defined
9)testdata</br> excel for parameterisation of test
10)runner</br> -testng.xml to trigger our tests
11)extent report -  test-output/Extent.html </br>



Project has been build in</br>
macOS catalina 1.15.2 </br>
appium version 1.17 </br>


### Preconfiguration-
1)email and password to be changed in the below file </br>
testData-/src/test/resources/testdata </br>

### Running:
project can be run from runner-testng.xml</br>
or from maven root path using mvn clean test command

### Report:
<img width="1679" alt="Report" src="https://user-images.githubusercontent.com/24494133/81373530-90a2ff80-911a-11ea-9433-6f578be5a445.png">

