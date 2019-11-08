// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package io.takari.maven.plugins.plugin.model;

/**
 * Class MojoParameter.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class MojoParameter
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field name.
     */
    private String name;

    /**
     * Field alias.
     */
    private String alias;

    /**
     * Field type.
     */
    private String type;

    /**
     * Field required.
     */
    private boolean required = false;

    /**
     * Field editable.
     */
    private boolean editable = false;

    /**
     * Field description.
     */
    private String description;

    /**
     * Field deprecated.
     */
    private String deprecated;

    /**
     * Field since.
     */
    private String since;

    /**
     * Field implementation.
     */
    private String implementation;

    /**
     * Field defaultValue.
     */
    private String defaultValue;

    /**
     * Field expression.
     */
    private String expression;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return MojoParameter
     */
    public MojoParameter clone()
    {
        try
        {
            MojoParameter copy = (MojoParameter) super.clone();

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- MojoParameter clone()

    /**
     * Get the alias field.
     * 
     * @return String
     */
    public String getAlias()
    {
        return this.alias;
    } //-- String getAlias()

    /**
     * Get the defaultValue field.
     * 
     * @return String
     */
    public String getDefaultValue()
    {
        return this.defaultValue;
    } //-- String getDefaultValue()

    /**
     * Get the deprecated field.
     * 
     * @return String
     */
    public String getDeprecated()
    {
        return this.deprecated;
    } //-- String getDeprecated()

    /**
     * Get the description field.
     * 
     * @return String
     */
    public String getDescription()
    {
        return this.description;
    } //-- String getDescription()

    /**
     * Get the expression field.
     * 
     * @return String
     */
    public String getExpression()
    {
        return this.expression;
    } //-- String getExpression()

    /**
     * Get the implementation field.
     * 
     * @return String
     */
    public String getImplementation()
    {
        return this.implementation;
    } //-- String getImplementation()

    /**
     * Get the name field.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the since field.
     * 
     * @return String
     */
    public String getSince()
    {
        return this.since;
    } //-- String getSince()

    /**
     * Get the type field.
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get the editable field.
     * 
     * @return boolean
     */
    public boolean isEditable()
    {
        return this.editable;
    } //-- boolean isEditable()

    /**
     * Get the required field.
     * 
     * @return boolean
     */
    public boolean isRequired()
    {
        return this.required;
    } //-- boolean isRequired()

    /**
     * Set the alias field.
     * 
     * @param alias
     */
    public void setAlias( String alias )
    {
        this.alias = alias;
    } //-- void setAlias( String )

    /**
     * Set the defaultValue field.
     * 
     * @param defaultValue
     */
    public void setDefaultValue( String defaultValue )
    {
        this.defaultValue = defaultValue;
    } //-- void setDefaultValue( String )

    /**
     * Set the deprecated field.
     * 
     * @param deprecated
     */
    public void setDeprecated( String deprecated )
    {
        this.deprecated = deprecated;
    } //-- void setDeprecated( String )

    /**
     * Set the description field.
     * 
     * @param description
     */
    public void setDescription( String description )
    {
        this.description = description;
    } //-- void setDescription( String )

    /**
     * Set the editable field.
     * 
     * @param editable
     */
    public void setEditable( boolean editable )
    {
        this.editable = editable;
    } //-- void setEditable( boolean )

    /**
     * Set the expression field.
     * 
     * @param expression
     */
    public void setExpression( String expression )
    {
        this.expression = expression;
    } //-- void setExpression( String )

    /**
     * Set the implementation field.
     * 
     * @param implementation
     */
    public void setImplementation( String implementation )
    {
        this.implementation = implementation;
    } //-- void setImplementation( String )

    /**
     * Set the name field.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the required field.
     * 
     * @param required
     */
    public void setRequired( boolean required )
    {
        this.required = required;
    } //-- void setRequired( boolean )

    /**
     * Set the since field.
     * 
     * @param since
     */
    public void setSince( String since )
    {
        this.since = since;
    } //-- void setSince( String )

    /**
     * Set the type field.
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

}
