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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the company request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyRequestPersistenceImpl
 * @see CompanyRequestUtil
 * @generated
 */
public interface CompanyRequestPersistence extends BasePersistence<CompanyRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyRequestUtil} to access the company request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the company requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company request, or <code>null</code> if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last company request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company request, or <code>null</code> if a matching company request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.itlifter.employee.service.model.CompanyRequest[] findByGroupId_PrevAndNext(
		long requestId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the company requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of company requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching company requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the company request in the entity cache if it is enabled.
	*
	* @param companyRequest the company request
	*/
	public void cacheResult(
		com.itlifter.employee.service.model.CompanyRequest companyRequest);

	/**
	* Caches the company requests in the entity cache if it is enabled.
	*
	* @param companyRequests the company requests
	*/
	public void cacheResult(
		java.util.List<com.itlifter.employee.service.model.CompanyRequest> companyRequests);

	/**
	* Creates a new company request with the primary key. Does not add the company request to the database.
	*
	* @param requestId the primary key for the new company request
	* @return the new company request
	*/
	public com.itlifter.employee.service.model.CompanyRequest create(
		long requestId);

	/**
	* Removes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company request
	* @return the company request that was removed
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest remove(
		long requestId)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.itlifter.employee.service.model.CompanyRequest updateImpl(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company request with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyRequestException} if it could not be found.
	*
	* @param requestId the primary key of the company request
	* @return the company request
	* @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest findByPrimaryKey(
		long requestId)
		throws com.itlifter.employee.service.NoSuchCompanyRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestId the primary key of the company request
	* @return the company request, or <code>null</code> if a company request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.CompanyRequest fetchByPrimaryKey(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the company requests.
	*
	* @return the company requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.CompanyRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the company requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of company requests.
	*
	* @return the number of company requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}