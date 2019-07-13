package pages;

import libraries.Annotations;

public class ViewLeadPage extends Annotations {
	
	public ViewLeadPage viewcreatedLead() {
		String leadid = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(leadid);
		replacedid = leadid.replaceAll("\\D", "");
		return this;
	}

	public MyLeadsPage deleteLead() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	
	}

}
