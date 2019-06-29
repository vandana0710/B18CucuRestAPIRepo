package com.basic.GetRequestSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/basic/GetRequestFF/"},
		glue= {"com/basic/GetRequestSD/"}
)

public class RummyFirstFeatureTest {

}
