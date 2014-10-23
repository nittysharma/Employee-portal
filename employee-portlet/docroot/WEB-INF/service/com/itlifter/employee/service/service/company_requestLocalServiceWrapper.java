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
 * Provides a wrapper for {@link company_requestLocalService}.
 *
 * @author Ashish
 * @see company_requestLocalService
 * @generated
 */
public class company_requestLocalServiceWrapper
	implements company_requestLocalService,
		ServiceWrapper<company_requestLocalService> {
	public company_requestLocalServiceWrapper(
		company_requestLocalService company_requestLocalService) {
		_company_requestLocalService = company_requestLocalService;
	}

	/**
	* Adds the company_request to the database. Also notifies the appropriate model listeners.
	*
	* @param company_request the company_request
	* @return the company_request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.company_request addcompany_request(
		com.itlifter.employee.service.model.company_request company_request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.addcompany_request(company_request);
	}

	/**
	* Creates a new company_request with the primary key. Does not add the company_request to the database.
	*
	* @param requestId the primary key for the new company_request
	* @return the new company_request
	*/
	@Override
	public com.itlifter.employee.service.model.company_request createcompany_request(
		long requestId) {
		return _company_requestLocalService.createcompany_request(requestId);
	}

	/**
	* Deletes the company_request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company_request
	* @return the company_request that was removed
	* @throws PortalException if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.company_request deletecompany_request(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.deletecompany_request(requestId);
	}

	/**
	* Deletes the company_request from the database. Also notifies the appropriate model listeners.
	*
	* @param company_request the company_request
	* @return the company_request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.company_request deletecompany_request(
		com.itlifter.employee.service.model.company_request company_request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.deletecompany_request(company_request);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _company_requestLocalService.dynamicQuery();
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
		return _company_requestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _company_requestLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _company_requestLocalService.dynamicQuery(dynamicQuery, start,
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
		return _company_requestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _company_requestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.itlifter.employee.service.model.company_request fetchcompany_request(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.fetchcompany_request(requestId);
	}

	/**
	* Returns the company_request with the primary key.
	*
	* @param requestId the primary key of the company_request
	* @return the company_request
	* @throws PortalException if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.company_request getcompany_request(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.getcompany_request(requestId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the company_requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_requests
	* @param end the upper bound of the range of company_requests (not inclusive)
	* @return the range of company_requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.itlifter.employee.service.model.company_request> getcompany_requests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.getcompany_requests(start, end);
	}

	/**
	* Returns the number of company_requests.
	*
	* @return the number of company_requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getcompany_requestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.getcompany_requestsCount();
	}

	/**
	* Updates the company_request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company_request the company_request
	* @return the company_request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.itlifter.employee.service.model.company_request updatecompany_request(
		com.itlifter.employee.service.model.company_request company_request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_requestLocalService.updatecompany_request(company_request);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _company_requestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_company_requestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _company_requestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public company_requestLocalService getWrappedcompany_requestLocalService() {
		return _company_requestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcompany_requestLocalService(
		company_requestLocalService company_requestLocalService) {
		_company_requestLocalService = company_requestLocalService;
	}

	@Override
	public company_requestLocalService getWrappedService() {
		return _company_requestLocalService;
	}

	@Override
	public void setWrappedService(
		company_requestLocalService company_requestLocalService) {
		_company_requestLocalService = company_requestLocalService;
	}

	private company_requestLocalService _company_requestLocalService;
}