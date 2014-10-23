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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the company type master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMasterPersistenceImpl
 * @see CompanyTypeMasterUtil
 * @generated
 */
public interface CompanyTypeMasterPersistence extends BasePersistence<CompanyTypeMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyTypeMasterUtil} to access the company type master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the company type master in the entity cache if it is enabled.
	*
	* @param companyTypeMaster the company type master
	*/
	public void cacheResult(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster);

	/**
	* Caches the company type masters in the entity cache if it is enabled.
	*
	* @param companyTypeMasters the company type masters
	*/
	public void cacheResult(
		java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> companyTypeMasters);

	/**
	* Creates a new company type master with the primary key. Does not add the company type master to the database.
	*
	* @param typeId the primary key for the new company type master
	* @return the new company type master
	*/
	public com.itlifter.employee.service.model.CompanyTypeMaster create(
		long typeId);

	/**
	* Removes the company type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master that was removed
	* @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyTypeMaster remove(
		long typeId)
		throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.itlifter.employee.service.model.CompanyTypeMaster updateImpl(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company type master with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyTypeMasterException} if it could not be found.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master
	* @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyTypeMaster findByPrimaryKey(
		long typeId)
		throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company type master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master, or <code>null</code> if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyTypeMaster fetchByPrimaryKey(
		long typeId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the company type masters.
	*
	* @return the company type masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the company type masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of company type masters.
	*
	* @return the number of company type masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}