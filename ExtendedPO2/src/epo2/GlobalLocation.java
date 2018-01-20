/**
 */
package epo2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link epo2.GlobalLocation#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @see epo2.Epo2Package#getGlobalLocation()
 * @model
 * @generated
 */
public interface GlobalLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(int)
	 * @see epo2.Epo2Package#getGlobalLocation_CountryCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCountryCode();

	/**
	 * Sets the value of the '{@link epo2.GlobalLocation#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(int value);

} // GlobalLocation
