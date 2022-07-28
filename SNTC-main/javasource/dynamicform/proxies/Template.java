// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dynamicform.proxies;

public class Template
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject templateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DynamicForm.Template";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PermanentName("PermanentName"),
		Active("Active"),
		Form_Description("Form_Description"),
		Main("Main"),
		FormName("FormName"),
		Template_Applicant("DynamicForm.Template_Applicant");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Template(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Template(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject templateMendixObject)
	{
		if (templateMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, templateMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.templateMendixObject = templateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Template.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dynamicform.proxies.Template initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dynamicform.proxies.Template.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static dynamicform.proxies.Template initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dynamicform.proxies.Template(context, mendixObject);
	}

	public static dynamicform.proxies.Template load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dynamicform.proxies.Template.initialize(context, mendixObject);
	}

	public static java.util.List<dynamicform.proxies.Template> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> dynamicform.proxies.Template.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PermanentName
	 */
	public final java.lang.String getPermanentName()
	{
		return getPermanentName(getContext());
	}

	/**
	 * @param context
	 * @return value of PermanentName
	 */
	public final java.lang.String getPermanentName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PermanentName.toString());
	}

	/**
	 * Set value of PermanentName
	 * @param permanentname
	 */
	public final void setPermanentName(java.lang.String permanentname)
	{
		setPermanentName(getContext(), permanentname);
	}

	/**
	 * Set value of PermanentName
	 * @param context
	 * @param permanentname
	 */
	public final void setPermanentName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String permanentname)
	{
		getMendixObject().setValue(context, MemberNames.PermanentName.toString(), permanentname);
	}

	/**
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(java.lang.Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * @return value of Form_Description
	 */
	public final java.lang.String getForm_Description()
	{
		return getForm_Description(getContext());
	}

	/**
	 * @param context
	 * @return value of Form_Description
	 */
	public final java.lang.String getForm_Description(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Form_Description.toString());
	}

	/**
	 * Set value of Form_Description
	 * @param form_description
	 */
	public final void setForm_Description(java.lang.String form_description)
	{
		setForm_Description(getContext(), form_description);
	}

	/**
	 * Set value of Form_Description
	 * @param context
	 * @param form_description
	 */
	public final void setForm_Description(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String form_description)
	{
		getMendixObject().setValue(context, MemberNames.Form_Description.toString(), form_description);
	}

	/**
	 * @return value of Main
	 */
	public final java.lang.Boolean getMain()
	{
		return getMain(getContext());
	}

	/**
	 * @param context
	 * @return value of Main
	 */
	public final java.lang.Boolean getMain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Main.toString());
	}

	/**
	 * Set value of Main
	 * @param main
	 */
	public final void setMain(java.lang.Boolean main)
	{
		setMain(getContext(), main);
	}

	/**
	 * Set value of Main
	 * @param context
	 * @param main
	 */
	public final void setMain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean main)
	{
		getMendixObject().setValue(context, MemberNames.Main.toString(), main);
	}

	/**
	 * @return value of FormName
	 */
	public final java.lang.String getFormName()
	{
		return getFormName(getContext());
	}

	/**
	 * @param context
	 * @return value of FormName
	 */
	public final java.lang.String getFormName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FormName.toString());
	}

	/**
	 * Set value of FormName
	 * @param formname
	 */
	public final void setFormName(java.lang.String formname)
	{
		setFormName(getContext(), formname);
	}

	/**
	 * Set value of FormName
	 * @param context
	 * @param formname
	 */
	public final void setFormName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String formname)
	{
		getMendixObject().setValue(context, MemberNames.FormName.toString(), formname);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Template_Applicant
	 */
	public final myfirstmodule.proxies.Applicant getTemplate_Applicant() throws com.mendix.core.CoreException
	{
		return getTemplate_Applicant(getContext());
	}

	/**
	 * @param context
	 * @return value of Template_Applicant
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Applicant getTemplate_Applicant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Applicant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Template_Applicant.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Applicant.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Template_Applicant
	 * @param template_applicant
	 */
	public final void setTemplate_Applicant(myfirstmodule.proxies.Applicant template_applicant)
	{
		setTemplate_Applicant(getContext(), template_applicant);
	}

	/**
	 * Set value of Template_Applicant
	 * @param context
	 * @param template_applicant
	 */
	public final void setTemplate_Applicant(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Applicant template_applicant)
	{
		if (template_applicant == null) {
			getMendixObject().setValue(context, MemberNames.Template_Applicant.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Template_Applicant.toString(), template_applicant.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return templateMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final dynamicform.proxies.Template that = (dynamicform.proxies.Template) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
