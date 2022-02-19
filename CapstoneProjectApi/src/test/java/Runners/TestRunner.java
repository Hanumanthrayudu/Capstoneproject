package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features/"},
        glue = {"Steps"},
      //  tags = {"@APISuite"},
        tags = {"@Get"}
      //  tags = {"@Post"},
//tags = {"@Put"}
//tags = {"@Delete"}
       )
public class  TestRunner{
}
