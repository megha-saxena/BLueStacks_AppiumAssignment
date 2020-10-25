1.	All the App related properties are specified in the config.properties file, placed in the root folder.
2.	All the extent html reports and screenshots are in location: root folder>target> cucumber-reports.
3.	All the build configurations are set up in Pom.xml and project is compatible to be run using maven command(mvn test) .
4.	Log4j logs are placed in location: root folder > Log4j
5.	Tests are tagged in 2 types of tags:
a.	@test1, @test2, @test3 : If you want run to run every individual test.
b.	@full: If you want to run all the tests.
6.	Screenshots are attached in extent html reports and placed in Screenshots folder at location:
root folder>target> cucumber-reports>screenshots> only if the scenario fails.
7.	This project contains 3 feature files and total 3 tests scenarios.
