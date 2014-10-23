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

package com.itlifter.employee.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyTypeMasterLocalService}.
 *
 * @author Ashish
 * @see CompanyTypeMasterLocalService
 * @generated
 */
public class CompanyTypeMasterLocalServiceWrapper
	implements CompanyTypeMasterLocalService,
		ServiceWrapper<CompanyTypeMasterLocalService> {
	public CompanyTypeMasterLocalServiceWrapper(
		CompanyTypeMasterLocalService companyTypeMasterLocalService) {
		_companyTypeMasterLocalService = companyTypeMasterLocalService;
	}

	/**
	* Adds the company type master to the database. Also notifies the appropriate model listeners.
	*
	* @param companyTypeMaster the company type master
	* @return the company type master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster addCompanyTypeMaster(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.addCompanyTypeMaster(companyTypeMaster);
	}

	/**
	* Creates a new company type master with the primary key. Does not add the company type master to the database.
	*
	* @param typeId the primary key for the new company type master
	* @return the new company type master
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster createCompanyTypeMaster(
		long typeId) {
		return _companyTypeMasterLocalService.createCompanyTypeMaster(typeId);
	}

	/**
	* Deletes the company type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master that was removed
	* @throws PortalException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster deleteCompanyTypeMaster(
		long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.deleteCompanyTypeMaster(typeId);
	}

	/**
	* Deletes the company type master from the database. Also notifies the appropriate model listeners.
	*
	* @param companyTypeMaster the company type master
	* @return the company type master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster deleteCompanyTypeMaster(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.deleteCompanyTypeMaster(companyTypeMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyTypeMasterLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster fetchCompanyTypeMaster(
		long typeId) throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.fetchCompanyTypeMaster(typeId);
	}

	/**
	* Returns the company type master with the primary key.
	*
	* @param typeId the primary key of the company type master
	* @return the company type master
	* @throws PortalException if a company type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster getCompanyTypeMaster(
		long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.getCompanyTypeMaster(typeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.itlifter.employee.service.model.CompanyTypeMaster> getCompanyTypeMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.getCompanyTypeMasters(start, end);
	}

	/**
	* Returns the number of company type masters.
	*
	* @return the number of company type masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompanyTypeMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.getCompanyTypeMastersCount();
	}

	/**
	* Updates the company type master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param companyTypeMaster the company type master
	* @return the company type master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyTypeMaster updateCompanyTypeMaster(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyTypeMasterLocalService.updateCompanyTypeMaster(companyTypeMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _companyTypeMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_companyTypeMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _companyTypeMasterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CompanyTypeMasterLocalService getWrappedCompanyTypeMasterLocalService() {
		return _companyTypeMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCompanyTypeMasterLocalService(
		CompanyTypeMasterLocalService companyTypeMasterLocalService) {
		_companyTypeMasterLocalService = companyTypeMasterLocalService;
	}

	@Override
	public CompanyTypeMasterLocalService getWrappedService() {
		return _companyTypeMasterLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyTypeMasterLocalService companyTypeMasterLocalService) {
		_companyTypeMasterLocalService = companyTypeMasterLocalService;
	}

	private CompanyTypeMasterLocalService _companyTypeMasterLocalService;
}