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

import com.itlifter.employee.service.model.CompanyRequest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the company request service. This utility wraps {@link CompanyRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyRequestPersistence
 * @see CompanyRequestPersistenceImpl
 * @generated
 */
public class CompanyRequestUtil {
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
	public static void clearCache(CompanyRequest companyRequest) {
		getPersistence().clearCache(companyRequest);
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
	public static List<CompanyRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CompanyRequest update(CompanyRequest companyRequest)
		throws SystemException {
		return getPersistence().update(companyRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CompanyRequest update(CompanyRequest companyRequest,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(companyRequest, serviceContext);
	}

	/**
	* Returns all the company requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the company requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of company requests
	* @param end the upper bound of the range of company requests (not inclusive)
	* @return the range of matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the company requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of company requests
	* @param end the upper bound of the range of company requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company request, or <code>null</code> if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company request, or <code>null</code> if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the company requests before and after the current company request in the ordered set where groupId = &#63;.
	*
	* @param requestId the primary key of the current company request
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest[] findByGroupId_PrevAndNext(
		long requestId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(requestId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the company requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of company requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the company request in the entity cache if it is enabled.
	*
	* @param companyRequest the company request
	*/
	public static void cacheResult(
		com.itlifter.employee.service.model.CompanyRequest companyRequest) {
		getPersistence().cacheResult(companyRequest);
	}

	/**
	* Caches the company requests in the entity cache if it is enabled.
	*
	* @param companyRequests the company requests
	*/
	public static void cacheResult(
		java.util.List<com.itlifter.employee.service.model.CompanyRequest> companyRequests) {
		getPersistence().cacheResult(companyRequests);
	}

	/**
	* Creates a new company request with the primary key. Does not add the company request to the database.
	*
	* @param requestId the primary key for the new company request
	* @return the new company request
	*/
	public static com.itlifter.employee.service.model.CompanyRequest create(
		long requestId) {
		return getPersistence().create(requestId);
	}

	/**
	* Removes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company request
	* @return the company request that was removed
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest remove(
		long requestId)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(requestId);
	}

	public static com.itlifter.employee.service.model.CompanyRequest updateImpl(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(companyRequest);
	}

	/**
	* Returns the company request with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyRequestException} if it could not be found.
	*
	* @param requestId the primary key of the company request
	* @return the company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest findByPrimaryKey(
		long requestId)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(requestId);
	}

	/**
	* Returns the company request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestId the primary key of the company request
	* @return the company request, or <code>null</code> if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.itlifter.employee.service.model.CompanyRequest fetchByPrimaryKey(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(requestId);
	}

	/**
	* Returns all the company requests.
	*
	* @return the company requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the company requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company requests
	* @param end the upper bound of the range of company requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the company requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of company requests.
	*
	* @return the number of company requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CompanyRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CompanyRequestPersistence)PortletBeanLocatorUtil.locate(com.itlifter.employee.service.service.ClpSerializer.getServletContextName(),
					CompanyRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(CompanyRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CompanyRequestPersistence persistence) {
	}

	private static CompanyRequestPersistence _persistence;
}