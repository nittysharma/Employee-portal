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
 * Provides a wrapper for {@link CompanyRequestLocalService}.
 *
 * @author Ashish
 * @see CompanyRequestLocalService
 * @generated
 */
public class CompanyRequestLocalServiceWrapper
	implements CompanyRequestLocalService,
		ServiceWrapper<CompanyRequestLocalService> {
	public CompanyRequestLocalServiceWrapper(
		CompanyRequestLocalService companyRequestLocalService) {
		_companyRequestLocalService = companyRequestLocalService;
	}

	/**
	* Adds the company request to the database. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest addCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.addCompanyRequest(companyRequest);
	}

	/**
	* Creates a new company request with the primary key. Does not add the company request to the database.
	*
	* @param requestId the primary key for the new company request
	* @return the new company request
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest createCompanyRequest(
		long requestId) {
		return _companyRequestLocalService.createCompanyRequest(requestId);
	}

	/**
	* Deletes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company request
	* @return the company request that was removed
	* @throws PortalException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest deleteCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.deleteCompanyRequest(requestId);
	}

	/**
	* Deletes the company request from the database. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest deleteCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.deleteCompanyRequest(companyRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyRequestLocalService.dynamicQuery();
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
		return _companyRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _companyRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _companyRequestLocalService.dynamicQuery(dynamicQuery, start,
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
		return _companyRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _companyRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.itlifter.employee.service.model.CompanyRequest fetchCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.fetchCompanyRequest(requestId);
	}

	/**
	* Returns the company request with the primary key.
	*
	* @param requestId the primary key of the company request
	* @return the company request
	* @throws PortalException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest getCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.getCompanyRequest(requestId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the company requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company requests
	* @param end the upper bound of the range of company requests (not inclusive)
	* @return the range of company requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> getCompanyRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.getCompanyRequests(start, end);
	}

	/**
	* Returns the number of company requests.
	*
	* @return the number of company requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompanyRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.getCompanyRequestsCount();
	}

	/**
	* Updates the company request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.CompanyRequest updateCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequestLocalService.updateCompanyRequest(companyRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _companyRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_companyRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _companyRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CompanyRequestLocalService getWrappedCompanyRequestLocalService() {
		return _companyRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCompanyRequestLocalService(
		CompanyRequestLocalService companyRequestLocalService) {
		_companyRequestLocalService = companyRequestLocalService;
	}

	@Override
	public CompanyRequestLocalService getWrappedService() {
		return _companyRequestLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyRequestLocalService companyRequestLocalService) {
		_companyRequestLocalService = companyRequestLocalService;
	}

	private CompanyRequestLocalService _companyRequestLocalService;
}