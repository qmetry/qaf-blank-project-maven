package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import com.qmetry.qaf.automation.step.QAFTestStep;

import com.qmetry.qaf.automation.ui.webdriver.*;


public class StepsLibrary {

	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	@QAFTestStep(description = "search for {0}")
	public static void searchFor(String searchTerm) {
		sendKeys(searchTerm, "input.search");
		submit("input.search");
	}

	/**
	 * In Europe, a cookies popup appears in google before search is available.
	 * It has Reject All button. Once it's clicked the search page appears.
	 * */
	@QAFTestStep(description = "reject all cookies")
	public static void rejectAllCookies() {
		QAFWebElement rejectAllButton = new QAFExtendedWebElement("reject.all");

		if (rejectAllButton.isPresent()) {
			click("reject.all");
		}
	}
}
