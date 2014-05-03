/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Composed Text Control (obsolete)</b><br></p><p>ID: 13871003</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CTC#getConData <em>Con Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCTC()
 * @model
 * @generated
 */
public interface CTC extends SF {
	/**
	 * Returns the value of the '<em><b>Con Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data</em>' attribute.
	 * @see #setConData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getCTC_ConData()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CTC#getConData <em>Con Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data</em>' attribute.
	 * @see #getConData()
	 * @generated
	 */
	void setConData(byte[] value);

} // CTC
