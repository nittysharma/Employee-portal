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

import com.itlifter.employee.service.NoSuchCompanyRequestException;
import com.itlifter.employee.service.model.CompanyRequest;
import com.itlifter.employee.service.model.impl.CompanyRequestImpl;
import com.itlifter.employee.service.model.impl.CompanyRequestModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the company request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyRequestPersistence
 * @see CompanyRequestUtil
 * @generated
 */
public class CompanyRequestPersistenceImpl extends BasePersistenceImpl<CompanyRequest>
	implements CompanyRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CompanyRequestUtil} to access the company request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CompanyRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED,
			CompanyRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED,
			CompanyRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED,
			CompanyRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED,
			CompanyRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			CompanyRequestModelImpl.GROUPID_COLUMN_BITMASK |
			CompanyRequestModelImpl.CNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the company requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching company requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompanyRequest> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CompanyRequest> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<CompanyRequest> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<CompanyRequest> list = (List<CompanyRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CompanyRequest companyRequest : list) {
				if ((groupId != companyRequest.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COMPANYREQUEST_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CompanyRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<CompanyRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompanyRequest>(list);
				}
				else {
					list = (List<CompanyRequest>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public CompanyRequest findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCompanyRequestException, SystemException {
		CompanyRequest companyRequest = fetchByGroupId_First(groupId,
				orderByComparator);

		if (companyRequest != null) {
			return companyRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompanyRequestException(msg.toString());
	}

	/**
	 * Returns the first company request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company request, or <code>null</code> if a matching company request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CompanyRequest> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CompanyRequest findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCompanyRequestException, SystemException {
		CompanyRequest companyRequest = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (companyRequest != null) {
			return companyRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompanyRequestException(msg.toString());
	}

	/**
	 * Returns the last company request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company request, or <code>null</code> if a matching company request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<CompanyRequest> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CompanyRequest[] findByGroupId_PrevAndNext(long requestId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchCompanyRequestException, SystemException {
		CompanyRequest companyRequest = findByPrimaryKey(requestId);

		Session session = null;

		try {
			session = openSession();

			CompanyRequest[] array = new CompanyRequestImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, companyRequest,
					groupId, orderByComparator, true);

			array[1] = companyRequest;

			array[2] = getByGroupId_PrevAndNext(session, companyRequest,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CompanyRequest getByGroupId_PrevAndNext(Session session,
		CompanyRequest companyRequest, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPANYREQUEST_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CompanyRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(companyRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CompanyRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company requests where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (CompanyRequest companyRequest : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(companyRequest);
		}
	}

	/**
	 * Returns the number of company requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching company requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANYREQUEST_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "companyRequest.groupId = ?";

	public CompanyRequestPersistenceImpl() {
		setModelClass(CompanyRequest.class);
	}

	/**
	 * Caches the company request in the entity cache if it is enabled.
	 *
	 * @param companyRequest the company request
	 */
	@Override
	public void cacheResult(CompanyRequest companyRequest) {
		EntityCacheUtil.putResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestImpl.class, companyRequest.getPrimaryKey(),
			companyRequest);

		companyRequest.resetOriginalValues();
	}

	/**
	 * Caches the company requests in the entity cache if it is enabled.
	 *
	 * @param companyRequests the company requests
	 */
	@Override
	public void cacheResult(List<CompanyRequest> companyRequests) {
		for (CompanyRequest companyRequest : companyRequests) {
			if (EntityCacheUtil.getResult(
						CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
						CompanyRequestImpl.class, companyRequest.getPrimaryKey()) == null) {
				cacheResult(companyRequest);
			}
			else {
				companyRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all company requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CompanyRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CompanyRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the company request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyRequest companyRequest) {
		EntityCacheUtil.removeResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestImpl.class, companyRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CompanyRequest> companyRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CompanyRequest companyRequest : companyRequests) {
			EntityCacheUtil.removeResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
				CompanyRequestImpl.class, companyRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new company request with the primary key. Does not add the company request to the database.
	 *
	 * @param requestId the primary key for the new company request
	 * @return the new company request
	 */
	@Override
	public CompanyRequest create(long requestId) {
		CompanyRequest companyRequest = new CompanyRequestImpl();

		companyRequest.setNew(true);
		companyRequest.setPrimaryKey(requestId);

		return companyRequest;
	}

	/**
	 * Removes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the company request
	 * @return the company request that was removed
	 * @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest remove(long requestId)
		throws NoSuchCompanyRequestException, SystemException {
		return remove((Serializable)requestId);
	}

	/**
	 * Removes the company request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company request
	 * @return the company request that was removed
	 * @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest remove(Serializable primaryKey)
		throws NoSuchCompanyRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CompanyRequest companyRequest = (CompanyRequest)session.get(CompanyRequestImpl.class,
					primaryKey);

			if (companyRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(companyRequest);
		}
		catch (NoSuchCompanyRequestException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CompanyRequest removeImpl(CompanyRequest companyRequest)
		throws SystemException {
		companyRequest = toUnwrappedModel(companyRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyRequest)) {
				companyRequest = (CompanyRequest)session.get(CompanyRequestImpl.class,
						companyRequest.getPrimaryKeyObj());
			}

			if (companyRequest != null) {
				session.delete(companyRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (companyRequest != null) {
			clearCache(companyRequest);
		}

		return companyRequest;
	}

	@Override
	public CompanyRequest updateImpl(
		com.itlifter.employee.service.model.CompanyRequest companyRequest)
		throws SystemException {
		companyRequest = toUnwrappedModel(companyRequest);

		boolean isNew = companyRequest.isNew();

		CompanyRequestModelImpl companyRequestModelImpl = (CompanyRequestModelImpl)companyRequest;

		Session session = null;

		try {
			session = openSession();

			if (companyRequest.isNew()) {
				session.save(companyRequest);

				companyRequest.setNew(false);
			}
			else {
				session.merge(companyRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CompanyRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((companyRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						companyRequestModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { companyRequestModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
			CompanyRequestImpl.class, companyRequest.getPrimaryKey(),
			companyRequest);

		return companyRequest;
	}

	protected CompanyRequest toUnwrappedModel(CompanyRequest companyRequest) {
		if (companyRequest instanceof CompanyRequestImpl) {
			return companyRequest;
		}

		CompanyRequestImpl companyRequestImpl = new CompanyRequestImpl();

		companyRequestImpl.setNew(companyRequest.isNew());
		companyRequestImpl.setPrimaryKey(companyRequest.getPrimaryKey());

		companyRequestImpl.setRequestId(companyRequest.getRequestId());
		companyRequestImpl.setCompanyId(companyRequest.getCompanyId());
		companyRequestImpl.setGroupId(companyRequest.getGroupId());
		companyRequestImpl.setUserId(companyRequest.getUserId());
		companyRequestImpl.setCname(companyRequest.getCname());
		companyRequestImpl.setCtype(companyRequest.getCtype());
		companyRequestImpl.setCrecursable(companyRequest.isCrecursable());
		companyRequestImpl.setCregionId(companyRequest.getCregionId());
		companyRequestImpl.setCcountryId(companyRequest.getCcountryId());
		companyRequestImpl.setCaddress(companyRequest.getCaddress());
		companyRequestImpl.setCphone(companyRequest.getCphone());
		companyRequestImpl.setCwebsite(companyRequest.getCwebsite());
		companyRequestImpl.setCemailAddress(companyRequest.getCemailAddress());
		companyRequestImpl.setCaddress1(companyRequest.getCaddress1());
		companyRequestImpl.setCaddress2(companyRequest.getCaddress2());
		companyRequestImpl.setCarea(companyRequest.getCarea());
		companyRequestImpl.setCcity(companyRequest.getCcity());
		companyRequestImpl.setCdistrict(companyRequest.getCdistrict());
		companyRequestImpl.setCstate(companyRequest.getCstate());
		companyRequestImpl.setCzipcode(companyRequest.getCzipcode());
		companyRequestImpl.setCfax(companyRequest.getCfax());
		companyRequestImpl.setTitle(companyRequest.getTitle());
		companyRequestImpl.setFirstName(companyRequest.getFirstName());
		companyRequestImpl.setLastName(companyRequest.getLastName());
		companyRequestImpl.setDesignation(companyRequest.getDesignation());
		companyRequestImpl.setFax(companyRequest.getFax());
		companyRequestImpl.setMobile(companyRequest.getMobile());
		companyRequestImpl.setEmail(companyRequest.getEmail());
		companyRequestImpl.setStatus(companyRequest.getStatus());
		companyRequestImpl.setCreateDate(companyRequest.getCreateDate());
		companyRequestImpl.setModifiedDate(companyRequest.getModifiedDate());
		companyRequestImpl.setUserName(companyRequest.getUserName());
		companyRequestImpl.setExts1(companyRequest.getExts1());
		companyRequestImpl.setExts2(companyRequest.getExts2());
		companyRequestImpl.setExts3(companyRequest.getExts3());
		companyRequestImpl.setExts4(companyRequest.getExts4());
		companyRequestImpl.setExts5(companyRequest.getExts5());
		companyRequestImpl.setExts6(companyRequest.getExts6());
		companyRequestImpl.setExts7(companyRequest.getExts7());
		companyRequestImpl.setExts8(companyRequest.getExts8());
		companyRequestImpl.setExts9(companyRequest.getExts9());
		companyRequestImpl.setExtl10(companyRequest.getExtl10());
		companyRequestImpl.setExtl11(companyRequest.getExtl11());
		companyRequestImpl.setExtl12(companyRequest.getExtl12());
		companyRequestImpl.setExtd13(companyRequest.getExtd13());
		companyRequestImpl.setExtd14(companyRequest.getExtd14());
		companyRequestImpl.setExtd15(companyRequest.getExtd15());

		return companyRequestImpl;
	}

	/**
	 * Returns the company request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the company request
	 * @return the company request
	 * @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyRequestException, SystemException {
		CompanyRequest companyRequest = fetchByPrimaryKey(primaryKey);

		if (companyRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return companyRequest;
	}

	/**
	 * Returns the company request with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyRequestException} if it could not be found.
	 *
	 * @param requestId the primary key of the company request
	 * @return the company request
	 * @throws com.itlifter.employee.service.NoSuchCompanyRequestException if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest findByPrimaryKey(long requestId)
		throws NoSuchCompanyRequestException, SystemException {
		return findByPrimaryKey((Serializable)requestId);
	}

	/**
	 * Returns the company request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company request
	 * @return the company request, or <code>null</code> if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CompanyRequest companyRequest = (CompanyRequest)EntityCacheUtil.getResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
				CompanyRequestImpl.class, primaryKey);

		if (companyRequest == _nullCompanyRequest) {
			return null;
		}

		if (companyRequest == null) {
			Session session = null;

			try {
				session = openSession();

				companyRequest = (CompanyRequest)session.get(CompanyRequestImpl.class,
						primaryKey);

				if (companyRequest != null) {
					cacheResult(companyRequest);
				}
				else {
					EntityCacheUtil.putResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
						CompanyRequestImpl.class, primaryKey,
						_nullCompanyRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CompanyRequestModelImpl.ENTITY_CACHE_ENABLED,
					CompanyRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return companyRequest;
	}

	/**
	 * Returns the company request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestId the primary key of the company request
	 * @return the company request, or <code>null</code> if a company request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyRequest fetchByPrimaryKey(long requestId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)requestId);
	}

	/**
	 * Returns all the company requests.
	 *
	 * @return the company requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompanyRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CompanyRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<CompanyRequest> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CompanyRequest> list = (List<CompanyRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COMPANYREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYREQUEST;

				if (pagination) {
					sql = sql.concat(CompanyRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CompanyRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompanyRequest>(list);
				}
				else {
					list = (List<CompanyRequest>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the company requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CompanyRequest companyRequest : findAll()) {
			remove(companyRequest);
		}
	}

	/**
	 * Returns the number of company requests.
	 *
	 * @return the number of company requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPANYREQUEST);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the company request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.itlifter.employee.service.model.CompanyRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CompanyRequest>> listenersList = new ArrayList<ModelListener<CompanyRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CompanyRequest>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CompanyRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COMPANYREQUEST = "SELECT companyRequest FROM CompanyRequest companyRequest";
	private static final String _SQL_SELECT_COMPANYREQUEST_WHERE = "SELECT companyRequest FROM CompanyRequest companyRequest WHERE ";
	private static final String _SQL_COUNT_COMPANYREQUEST = "SELECT COUNT(companyRequest) FROM CompanyRequest companyRequest";
	private static final String _SQL_COUNT_COMPANYREQUEST_WHERE = "SELECT COUNT(companyRequest) FROM CompanyRequest companyRequest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "companyRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CompanyRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CompanyRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CompanyRequestPersistenceImpl.class);
	private static CompanyRequest _nullCompanyRequest = new CompanyRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CompanyRequest> toCacheModel() {
				return _nullCompanyRequestCacheModel;
			}
		};

	private static CacheModel<CompanyRequest> _nullCompanyRequestCacheModel = new CacheModel<CompanyRequest>() {
			@Override
			public CompanyRequest toEntityModel() {
				return _nullCompanyRequest;
			}
		};
}