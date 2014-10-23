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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CompanyRequest. This utility wraps
 * {@link com.itlifter.employee.service.service.impl.CompanyRequestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Ashish
 * @see CompanyRequestLocalService
 * @see com.itlifter.employee.service.service.base.CompanyRequestLocalServiceBaseImpl
 * @see com.itlifter.employee.service.service.impl.CompanyRequestLocalServiceImpl
 * @generated
 */
public class CompanyRequestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.itlifter.employee.service.service.impl.CompanyRequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the company request to the database. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest addCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCompanyRequest(companyRequest);
	}

	/**
	* Creates a new company request with the primary key. Does not add the company request to the database.
	*
	* @param requestId the primary key for the new company request
	* @return the new company request
	*/
	public static com.itlifter.employee.service.model.CompanyRequest createCompanyRequest(
		long requestId) {
		return getService().createCompanyRequest(requestId);
	}

	/**
	* Deletes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company request
	* @return the company request that was removed
	* @throws PortalException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest deleteCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCompanyRequest(requestId);
	}

	/**
	* Deletes the company request from the database. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest deleteCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCompanyRequest(companyRequest);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.itlifter.employee.service.model.CompanyRequest fetchCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCompanyRequest(requestId);
	}

	/**
	* Returns the company request with the primary key.
	*
	* @param requestId the primary key of the company request
	* @return the company request
	* @throws PortalException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest getCompanyRequest(
		long requestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyRequest(requestId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> getCompanyRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyRequests(start, end);
	}

	/**
	* Returns the number of company requests.
	*
	* @return the number of company requests
	* @throws SystemException if a system exception occurred
	*/
	public static int getCompanyRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyRequestsCount();
	}

	/**
	* Updates the company request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param companyRequest the company request
	* @return the company request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest updateCompanyRequest(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCompanyRequest(companyRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static CompanyRequestLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CompanyRequestLocalService.class.getName());

			if (invokableLocalService instanceof CompanyRequestLocalService) {
				_service = (CompanyRequestLocalService)invokableLocalService;
			}
			else {
				_service = new CompanyRequestLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CompanyRequestLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CompanyRequestLocalService service) {
	}

	private static CompanyRequestLocalService _service;
}