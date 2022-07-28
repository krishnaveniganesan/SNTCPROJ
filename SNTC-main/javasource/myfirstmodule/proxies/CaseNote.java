// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class CaseNote
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject caseNoteMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.CaseNote";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Enter_Case_Note("Enter_Case_Note"),
		Date_and_Time("Date_and_Time"),
		User_Name("User_Name"),
		CaseNote_Status("CaseNote_Status"),
		CaseNote_Applicant("MyFirstModule.CaseNote_Applicant"),
		CaseNote_Account("MyFirstModule.CaseNote_Account");

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

	public CaseNote(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected CaseNote(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject caseNoteMendixObject)
	{
		if (caseNoteMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, caseNoteMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.caseNoteMendixObject = caseNoteMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CaseNote.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.CaseNote initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.CaseNote.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.CaseNote initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.CaseNote(context, mendixObject);
	}

	public static myfirstmodule.proxies.CaseNote load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.CaseNote.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.CaseNote> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.CaseNote.initialize(context, obj))
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
	 * @return value of Enter_Case_Note
	 */
	public final java.lang.String getEnter_Case_Note()
	{
		return getEnter_Case_Note(getContext());
	}

	/**
	 * @param context
	 * @return value of Enter_Case_Note
	 */
	public final java.lang.String getEnter_Case_Note(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Enter_Case_Note.toString());
	}

	/**
	 * Set value of Enter_Case_Note
	 * @param enter_case_note
	 */
	public final void setEnter_Case_Note(java.lang.String enter_case_note)
	{
		setEnter_Case_Note(getContext(), enter_case_note);
	}

	/**
	 * Set value of Enter_Case_Note
	 * @param context
	 * @param enter_case_note
	 */
	public final void setEnter_Case_Note(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String enter_case_note)
	{
		getMendixObject().setValue(context, MemberNames.Enter_Case_Note.toString(), enter_case_note);
	}

	/**
	 * @return value of Date_and_Time
	 */
	public final java.util.Date getDate_and_Time()
	{
		return getDate_and_Time(getContext());
	}

	/**
	 * @param context
	 * @return value of Date_and_Time
	 */
	public final java.util.Date getDate_and_Time(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date_and_Time.toString());
	}

	/**
	 * Set value of Date_and_Time
	 * @param date_and_time
	 */
	public final void setDate_and_Time(java.util.Date date_and_time)
	{
		setDate_and_Time(getContext(), date_and_time);
	}

	/**
	 * Set value of Date_and_Time
	 * @param context
	 * @param date_and_time
	 */
	public final void setDate_and_Time(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date_and_time)
	{
		getMendixObject().setValue(context, MemberNames.Date_and_Time.toString(), date_and_time);
	}

	/**
	 * @return value of User_Name
	 */
	public final java.lang.String getUser_Name()
	{
		return getUser_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of User_Name
	 */
	public final java.lang.String getUser_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User_Name.toString());
	}

	/**
	 * Set value of User_Name
	 * @param user_name
	 */
	public final void setUser_Name(java.lang.String user_name)
	{
		setUser_Name(getContext(), user_name);
	}

	/**
	 * Set value of User_Name
	 * @param context
	 * @param user_name
	 */
	public final void setUser_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user_name)
	{
		getMendixObject().setValue(context, MemberNames.User_Name.toString(), user_name);
	}

	/**
	 * @return value of CaseNote_Status
	 */
	public final java.lang.Boolean getCaseNote_Status()
	{
		return getCaseNote_Status(getContext());
	}

	/**
	 * @param context
	 * @return value of CaseNote_Status
	 */
	public final java.lang.Boolean getCaseNote_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CaseNote_Status.toString());
	}

	/**
	 * Set value of CaseNote_Status
	 * @param casenote_status
	 */
	public final void setCaseNote_Status(java.lang.Boolean casenote_status)
	{
		setCaseNote_Status(getContext(), casenote_status);
	}

	/**
	 * Set value of CaseNote_Status
	 * @param context
	 * @param casenote_status
	 */
	public final void setCaseNote_Status(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean casenote_status)
	{
		getMendixObject().setValue(context, MemberNames.CaseNote_Status.toString(), casenote_status);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of CaseNote_Applicant
	 */
	public final myfirstmodule.proxies.Applicant getCaseNote_Applicant() throws com.mendix.core.CoreException
	{
		return getCaseNote_Applicant(getContext());
	}

	/**
	 * @param context
	 * @return value of CaseNote_Applicant
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Applicant getCaseNote_Applicant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Applicant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CaseNote_Applicant.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Applicant.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of CaseNote_Applicant
	 * @param casenote_applicant
	 */
	public final void setCaseNote_Applicant(myfirstmodule.proxies.Applicant casenote_applicant)
	{
		setCaseNote_Applicant(getContext(), casenote_applicant);
	}

	/**
	 * Set value of CaseNote_Applicant
	 * @param context
	 * @param casenote_applicant
	 */
	public final void setCaseNote_Applicant(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Applicant casenote_applicant)
	{
		if (casenote_applicant == null) {
			getMendixObject().setValue(context, MemberNames.CaseNote_Applicant.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.CaseNote_Applicant.toString(), casenote_applicant.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of CaseNote_Account
	 */
	public final administration.proxies.Account getCaseNote_Account() throws com.mendix.core.CoreException
	{
		return getCaseNote_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of CaseNote_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getCaseNote_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CaseNote_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of CaseNote_Account
	 * @param casenote_account
	 */
	public final void setCaseNote_Account(administration.proxies.Account casenote_account)
	{
		setCaseNote_Account(getContext(), casenote_account);
	}

	/**
	 * Set value of CaseNote_Account
	 * @param context
	 * @param casenote_account
	 */
	public final void setCaseNote_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account casenote_account)
	{
		if (casenote_account == null) {
			getMendixObject().setValue(context, MemberNames.CaseNote_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.CaseNote_Account.toString(), casenote_account.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return caseNoteMendixObject;
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
			final myfirstmodule.proxies.CaseNote that = (myfirstmodule.proxies.CaseNote) obj;
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
