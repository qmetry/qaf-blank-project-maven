package com.qmetry.qaf.example.test;

import static com.qmetry.automation.step.CommonStep.get;
import static com.qmetry.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;
import org.testng.annotations.Test;

import com.qmetry.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {

	@Test
	public void testGoogleSearch() {
		get("/");
		searchFor("qaf github infostretch");
		verifyLinkWithPartialTextPresent("qaf");
	}
}
