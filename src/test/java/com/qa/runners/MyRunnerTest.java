package com.qa.runners;

import com.qa.utils.GlobalParams;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;


@Suite
@IncludeEngines("cucumber")

//@SelectClasspathResource(".") // thư mục chứa feature files
//@SelectClasspathResource("test-parallel") // thư mục chứa feature files
@SelectClasspathResource("setting-finger") // thư mục chứa feature files
@SelectClasspathResource("setting-network") // thư mục chứa feature files
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.qa.stepdef")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber/report.html, summary")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase")
// @ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@test") // nếu cần
public class MyRunnerTest {
}
