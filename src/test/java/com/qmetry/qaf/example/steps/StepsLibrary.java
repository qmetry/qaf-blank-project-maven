package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import com.qmetry.qaf.automation.step.QAFTestStep;

import com.qmetry.qaf.automation.ui.webdriver.*;

public class StepsLibrary {

	@QAFTestStep(description = "navigate to search page")
	public static void navigateToSearchPage() {
		get("/");
		rejectAllCookies();
	}

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
	 * It has Reject All button. Once clicked, cookies are rejected and the search page appears.
	 * */
	private static void rejectAllCookies() {
		QAFWebElement rejectAllButton = new QAFExtendedWebElement("reject.all");

		if (rejectAllButton.isPresent()) {
			rejectAllButton.click();
		}
	}
}
