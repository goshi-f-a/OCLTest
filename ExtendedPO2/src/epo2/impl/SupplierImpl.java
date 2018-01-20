/**
 */
package epo2.impl;

import epo2.Customer;
import epo2.Epo2Package;
import epo2.PurchaseOrder;
import epo2.Supplier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link epo2.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link epo2.impl.SupplierImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link epo2.impl.SupplierImpl#getPendingOrders <em>Pending Orders</em>}</li>
 *   <li>{@link epo2.impl.SupplierImpl#getShippedOrders <em>Shipped Orders</em>}</li>
 *   <li>{@link epo2.impl.SupplierImpl#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends MinimalEObjectImpl.Container implements Supplier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> orders;

	/**
	 * The cached value of the '{@link #getPendingOrders() <em>Pending Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> pendingOrders;

	/**
	 * The cached value of the '{@link #getShippedOrders() <em>Shipped Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippedOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> shippedOrders;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Epo2Package.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Epo2Package.SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<PurchaseOrder>(PurchaseOrder.class, this, Epo2Package.SUPPLIER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getPendingOrders() {
		if (pendingOrders == null) {
			pendingOrders = new EObjectResolvingEList<PurchaseOrder>(PurchaseOrder.class, this, Epo2Package.SUPPLIER__PENDING_ORDERS);
		}
		return pendingOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getShippedOrders() {
		if (shippedOrders == null) {
			shippedOrders = new EObjectResolvingEList<PurchaseOrder>(PurchaseOrder.class, this, Epo2Package.SUPPLIER__SHIPPED_ORDERS);
		}
		return shippedOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, Epo2Package.SUPPLIER__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Epo2Package.SUPPLIER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case Epo2Package.SUPPLIER__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Epo2Package.SUPPLIER__NAME:
				return getName();
			case Epo2Package.SUPPLIER__ORDERS:
				return getOrders();
			case Epo2Package.SUPPLIER__PENDING_ORDERS:
				return getPendingOrders();
			case Epo2Package.SUPPLIER__SHIPPED_ORDERS:
				return getShippedOrders();
			case Epo2Package.SUPPLIER__CUSTOMERS:
				return getCustomers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Epo2Package.SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case Epo2Package.SUPPLIER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case Epo2Package.SUPPLIER__PENDING_ORDERS:
				getPendingOrders().clear();
				getPendingOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case Epo2Package.SUPPLIER__SHIPPED_ORDERS:
				getShippedOrders().clear();
				getShippedOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case Epo2Package.SUPPLIER__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Epo2Package.SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Epo2Package.SUPPLIER__ORDERS:
				getOrders().clear();
				return;
			case Epo2Package.SUPPLIER__PENDING_ORDERS:
				getPendingOrders().clear();
				return;
			case Epo2Package.SUPPLIER__SHIPPED_ORDERS:
				getShippedOrders().clear();
				return;
			case Epo2Package.SUPPLIER__CUSTOMERS:
				getCustomers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Epo2Package.SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Epo2Package.SUPPLIER__ORDERS:
				return orders != null && !orders.isEmpty();
			case Epo2Package.SUPPLIER__PENDING_ORDERS:
				return pendingOrders != null && !pendingOrders.isEmpty();
			case Epo2Package.SUPPLIER__SHIPPED_ORDERS:
				return shippedOrders != null && !shippedOrders.isEmpty();
			case Epo2Package.SUPPLIER__CUSTOMERS:
				return customers != null && !customers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
