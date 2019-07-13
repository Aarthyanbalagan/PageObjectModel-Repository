package pages;

import libraries.Annotations;

public class FindLeadsPage extends Annotations{
	public ViewLeadPage findmylead() {
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)").sendKeys(replacedid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByLinkText(replacedid).click();
		return new ViewLeadPage();
	}

}

