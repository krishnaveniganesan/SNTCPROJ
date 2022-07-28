// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dynamicform.proxies;

public class Doc extends dynamicform.proxies.Element
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DynamicForm.Doc";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NameoftheAttribute("NameoftheAttribute"),
		dateandtime("dateandtime"),
		Document_Doc("DynamicForm.Document_Doc"),
		Element_Template("DynamicForm.Element_Template");

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

	public Doc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Doc(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject docMendixObject)
	{
		super(context, docMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, docMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Doc.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dynamicform.proxies.Doc initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dynamicform.proxies.Doc.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static dynamicform.proxies.Doc initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dynamicform.proxies.Doc(context, mendixObject);
	}

	public static dynamicform.proxies.Doc load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dynamicform.proxies.Doc.initialize(context, mendixObject);
	}

	public static java.util.List<dynamicform.proxies.Doc> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> dynamicform.proxies.Doc.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Document_Doc
	 */
	public final dynamicform.proxies.Document getDocument_Doc() throws com.mendix.core.CoreException
	{
		return getDocument_Doc(getContext());
	}

	/**
	 * @param context
	 * @return value of Document_Doc
	 * @throws com.mendix.core.CoreException
	 */
	public final dynamicform.proxies.Document getDocument_Doc(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Document result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Document_Doc.toString());
		if (identifier != null) {
			result = dynamicform.proxies.Document.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Document_Doc
	 * @param document_doc
	 */
	public final void setDocument_Doc(dynamicform.proxies.Document document_doc)
	{
		setDocument_Doc(getContext(), document_doc);
	}

	/**
	 * Set value of Document_Doc
	 * @param context
	 * @param document_doc
	 */
	public final void setDocument_Doc(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Document document_doc)
	{
		if (document_doc == null) {
			getMendixObject().setValue(context, MemberNames.Document_Doc.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Document_Doc.toString(), document_doc.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final dynamicform.proxies.Doc that = (dynamicform.proxies.Doc) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
