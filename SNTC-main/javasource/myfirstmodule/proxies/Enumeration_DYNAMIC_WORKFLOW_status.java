// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Enumeration_DYNAMIC_WORKFLOW_status
{
	Case_manager_approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Case manager_approved" } }),
	SNTC_submited(new java.lang.String[][] { new java.lang.String[] { "en_US", "SNTC_submited" } }),
	Senior_case_manager_approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Senior case manager approved" } }),
	Senior_manager_approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Senior manager approved" } }),
	General_manager_approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "General manager approved" } }),
	Trust_admin(new java.lang.String[][] { new java.lang.String[] { "en_US", "Trust_admin" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enumeration_DYNAMIC_WORKFLOW_status(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
