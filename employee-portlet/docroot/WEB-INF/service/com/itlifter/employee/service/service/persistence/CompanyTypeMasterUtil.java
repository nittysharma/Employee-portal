/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.itlifter.employee.service.service.persistence;

import com.itlifter.employee.service.model.CompanyTypeMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the company type master service. This utility wraps {@link CompanyTypeMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMasterPersistence
 * @see CompanyTypeMasterPersistenceImpl
 * @generated
 */
public class CompanyTypeMasterUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CompanyTypeMaster companyTypeMaster) {
		getPersistence().clearCache(companyTypeMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanyTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CompanyTypeMaster update(CompanyTypeMaster companyTypeMaster)
		throws SystemException {
		return getPersistence().update(companyTypeMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CompanyTypeMaster update(
		CompanyTypeMaster companyTypeMaster, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(companyTypeMaster, serviceContext);
	}

	/**
	* Caches the company type master in the entity cache if it is enabled.
	*
	* @param companyTypeMaster the company type master
	*/
	public static void cacheResult(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster) {
		getPersistence().cacheResult(companyTypeMaster);
	}

	/**
	* Caches the company type masters in the entity cache if it is enabled.
	*
	* @param companyTypeMasters the company type masters
	*/
	public static void cacheResult(
		java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> companyTypeMasters) {
		getPersistence().cacheResult(companyTypeMasters);
	}

	/**
	* Creates a new company type master with the primary key. Does not add the company type master to the database.
	*
	* @param typeId the primary key for the new company type master
	* @return the new company type master
	*/
	public static com.itlifter.employee.service.model.CompanyTypeMaster create(
		long typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the company type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master that was removed
	* @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyTypeMaster remove(
		long typeId)
		throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(typeId);
	}

	public static com.itlifter.employee.service.model.CompanyTypeMaster updateImpl(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(companyTypeMaster);
	}

	/**
	* Returns the company type master with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyTypeMasterException} if it could not be found.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master
	* @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyTypeMaster findByPrimaryKey(
		long typeId)
		throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Returns the company type master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master, or <code>null</code> if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyTypeMaster fetchByPrimaryKey(
		long typeId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	/**
	* Returns all the company type masters.
	*
	* @return the company type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the company type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company type masters
	* @param end the upper bound of the range of company type masters (not inclusive)
	* @return the range of company type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the company type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company type masters
	* @param end the upper bound of the range of company type masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the company type masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of company type masters.
	*
	* @return the number of company type masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CompanyTypeMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CompanyTypeMasterPersistence)PortletBeanLocatorUtil.locate(com.itlifter.employee.service.service.ClpSerializer.getServletContextName(),
					CompanyTypeMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(CompanyTypeMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CompanyTypeMasterPersistence persistence) {
	}

	private static CompanyTypeMasterPersistence _persistence;
}