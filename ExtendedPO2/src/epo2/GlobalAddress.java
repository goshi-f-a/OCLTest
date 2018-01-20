/**
 */
package epo2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link epo2.GlobalAddress#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see epo2.Epo2Package#getGlobalAddress()
 * @model
 * @generated
 */
public interface GlobalAddress extends Address, GlobalLocation {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see epo2.Epo2Package#getGlobalAddress_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link epo2.GlobalAddress#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // GlobalAddress
