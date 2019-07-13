package pages;

import libraries.Annotations;

public class MyLeadsPage extends Annotations {
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead")
		.click();
		return new CreateLeadPage();
		
	}

}
