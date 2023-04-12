package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = {"src/test/java/features/"},
		dryRun = !true,
		glue = {"Steps","hooks"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"pretty",
				"html:reports",
				"json:reports/result.json",
				"junit:reports/result.xml"},
		tags = {}
			)
public class Runner extends AbstractTestNGCucumberTests{

	

}
