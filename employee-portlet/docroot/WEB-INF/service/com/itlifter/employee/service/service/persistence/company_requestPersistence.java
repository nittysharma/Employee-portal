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

import com.itlifter.employee.service.model.company_request;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the company_request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see company_requestPersistenceImpl
 * @see company_requestUtil
 * @generated
 */
public interface company_requestPersistence extends BasePersistence<company_request> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link company_requestUtil} to access the company_request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the company_requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching company_requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.company_request> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the company_requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of company_requests
	* @param end the upper bound of the range of company_requests (not inclusive)
	* @return the range of matching company_requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.company_request> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the company_requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of company_requests
	* @param end the upper bound of the range of company_requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company_requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.company_request> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first company_request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_request
	* @throws com.itlifter.employee.service.NoSuchcompany_requestException if a matching company_request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchcompany_requestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first company_request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_request, or <code>null</code> if a matching company_request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last company_request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_request
	* @throws com.itlifter.employee.service.NoSuchcompany_requestException if a matching company_request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchcompany_requestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last company_request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_request, or <code>null</code> if a matching company_request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company_requests before and after the current company_request in the ordered set where groupId = &#63;.
	*
	* @param requestId the primary key of the current company_request
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_request
	* @throws com.itlifter.employee.service.NoSuchcompany_requestException if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request[] findByGroupId_PrevAndNext(
		long requestId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.itlifter.employee.service.NoSuchcompany_requestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the company_requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of company_requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching company_requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the company_request in the entity cache if it is enabled.
	*
	* @param company_request the company_request
	*/
	public void cacheResult(
		com.itlifter.employee.service.model.company_request company_request);

	/**
	* Caches the company_requests in the entity cache if it is enabled.
	*
	* @param company_requests the company_requests
	*/
	public void cacheResult(
		java.util.List<com.itlifter.employee.service.model.company_request> company_requests);

	/**
	* Creates a new company_request with the primary key. Does not add the company_request to the database.
	*
	* @param requestId the primary key for the new company_request
	* @return the new company_request
	*/
	public com.itlifter.employee.service.model.company_request create(
		long requestId);

	/**
	* Removes the company_request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestId the primary key of the company_request
	* @return the company_request that was removed
	* @throws com.itlifter.employee.service.NoSuchcompany_requestException if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request remove(
		long requestId)
		throws com.itlifter.employee.service.NoSuchcompany_requestException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.itlifter.employee.service.model.company_request updateImpl(
		com.itlifter.employee.service.model.company_request company_request)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company_request with the primary key or throws a {@link com.itlifter.employee.service.NoSuchcompany_requestException} if it could not be found.
	*
	* @param requestId the primary key of the company_request
	* @return the company_request
	* @throws com.itlifter.employee.service.NoSuchcompany_requestException if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request findByPrimaryKey(
		long requestId)
		throws com.itlifter.employee.service.NoSuchcompany_requestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company_request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestId the primary key of the company_request
	* @return the company_request, or <code>null</code> if a company_request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.itlifter.employee.service.model.company_request fetchByPrimaryKey(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the company_requests.
	*
	* @return the company_requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.company_request> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.itlifter.employee.service.model.company_request> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the company_requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.itlifter.employee.service.model.impl.company_requestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_requests
	* @param end the upper bound of the range of company_requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company_requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.itlifter.employee.service.model.company_request> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the company_requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of company_requests.
	*
	* @return the number of company_requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}