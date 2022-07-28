// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Enum_Race
{
	Chinese(new java.lang.String[][] { new java.lang.String[] { "en_US", "Chinese" }, new java.lang.String[] { "zh_SG", "华族" } }),
	Malay(new java.lang.String[][] { new java.lang.String[] { "en_US", "Malay" }, new java.lang.String[] { "zh_SG", "马来族" } }),
	Indian(new java.lang.String[][] { new java.lang.String[] { "en_US", "Indian" }, new java.lang.String[] { "zh_SG", "印度族" } }),
	Eurasian(new java.lang.String[][] { new java.lang.String[] { "en_US", "Eurasian" }, new java.lang.String[] { "zh_SG", "欧亚族" } }),
	Others(new java.lang.String[][] { new java.lang.String[] { "en_US", "Others" }, new java.lang.String[] { "zh_SG", "其他" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_Race(java.lang.String[][] captionStrings)
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
