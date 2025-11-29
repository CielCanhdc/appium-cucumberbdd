package com.qa.runners;

import com.qa.utils.GlobalParams;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;


@Suite
@SelectClasspathResource("/") // thư mục chứa feature files
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.qa.stepdef")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber/report.html, summary")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.qa.stepdef, com.qa.hooks")

// @ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@test") // nếu cần
public class MyRunnerTest {

//    @BeforeAll
//    public static void initialize() throws Exception {
//        System.out.println("Before tesst herehhhhhhhhhhhh");
//        GlobalParams params = new GlobalParams();
//        params.initializeGlobalParams();
//
//    }

//    @AfterAll
//    public static void quit() {
//        // Dọn tài nguyên cuối test nếu cần
//        // DriverManager driverManager = new DriverManager();
//        // if(driverManager.getDriver() != null){
//        //     driverManager.getDriver().quit();
//        // }
//        //
//        // ServerManager serverManager = new ServerManager();
//        // if(serverManager.getServer() != null){
//        //     serverManager.getServer().stop();
//        // }
//    }
}
