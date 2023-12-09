# qaf-blank-project-maven

This is automation project skeleton to start with using MAVEN. Please refer to [documentation](https://qmetry.github.io/qaf/) for more help.


### Intro

This is sample project with Maven directory structure:

* The `config` directory contains `testng.xml` file, and is a placeholder for configuration files.

* The `resources` directory contains all required resources including properties files and data files, and is a placeholder for other resources.

* The `src` directory contains all java files and is a placeholder for other java files.

* The `test-results` directory contains result files.

* The `scenarios` directory is the default placeholder for all the scenario files.

To change dependencies check `pom.xml`.


### Run

To run the project, from command prompt go to project home and run:

    mvn clean test 

Open `dashboard.htm` to view results.

Note: This sample project uses chrome driver, and it requires chrome driver binary. You need to download it and set `webdriver.chrome.driver` property in `application.properties` file with driver binary path.


### More

For more details, see https://qmetry.github.io/qaf/.



Thanks,

QAS Team