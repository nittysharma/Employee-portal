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

import com.itlifter.employee.service.NoSuchCompanyTypeMasterException;
import com.itlifter.employee.service.model.CompanyTypeMaster;
import com.itlifter.employee.service.model.impl.CompanyTypeMasterImpl;
import com.itlifter.employee.service.model.impl.CompanyTypeMasterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the company type master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMasterPersistence
 * @see CompanyTypeMasterUtil
 * @generated
 */
public class CompanyTypeMasterPersistenceImpl extends BasePersistenceImpl<CompanyTypeMaster>
	implements CompanyTypeMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CompanyTypeMasterUtil} to access the company type master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CompanyTypeMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			CompanyTypeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			CompanyTypeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CompanyTypeMasterPersistenceImpl() {
		setModelClass(CompanyTypeMaster.class);
	}

	/**
	 * Caches the company type master in the entity cache if it is enabled.
	 *
	 * @param companyTypeMaster the company type master
	 */
	@Override
	public void cacheResult(CompanyTypeMaster companyTypeMaster) {
		EntityCacheUtil.putResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterImpl.class, companyTypeMaster.getPrimaryKey(),
			companyTypeMaster);

		companyTypeMaster.resetOriginalValues();
	}

	/**
	 * Caches the company type masters in the entity cache if it is enabled.
	 *
	 * @param companyTypeMasters the company type masters
	 */
	@Override
	public void cacheResult(List<CompanyTypeMaster> companyTypeMasters) {
		for (CompanyTypeMaster companyTypeMaster : companyTypeMasters) {
			if (EntityCacheUtil.getResult(
						CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						CompanyTypeMasterImpl.class,
						companyTypeMaster.getPrimaryKey()) == null) {
				cacheResult(companyTypeMaster);
			}
			else {
				companyTypeMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all company type masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CompanyTypeMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CompanyTypeMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the company type master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyTypeMaster companyTypeMaster) {
		EntityCacheUtil.removeResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterImpl.class, companyTypeMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CompanyTypeMaster> companyTypeMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CompanyTypeMaster companyTypeMaster : companyTypeMasters) {
			EntityCacheUtil.removeResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				CompanyTypeMasterImpl.class, companyTypeMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new company type master with the primary key. Does not add the company type master to the database.
	 *
	 * @param typeId the primary key for the new company type master
	 * @return the new company type master
	 */
	@Override
	public CompanyTypeMaster create(long typeId) {
		CompanyTypeMaster companyTypeMaster = new CompanyTypeMasterImpl();

		companyTypeMaster.setNew(true);
		companyTypeMaster.setPrimaryKey(typeId);

		return companyTypeMaster;
	}

	/**
	 * Removes the company type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the company type master
	 * @return the company type master that was removed
	 * @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster remove(long typeId)
		throws NoSuchCompanyTypeMasterException, SystemException {
		return remove((Serializable)typeId);
	}

	/**
	 * Removes the company type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company type master
	 * @return the company type master that was removed
	 * @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster remove(Serializable primaryKey)
		throws NoSuchCompanyTypeMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CompanyTypeMaster companyTypeMaster = (CompanyTypeMaster)session.get(CompanyTypeMasterImpl.class,
					primaryKey);

			if (companyTypeMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(companyTypeMaster);
		}
		catch (NoSuchCompanyTypeMasterException nsee) {
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
	protected CompanyTypeMaster removeImpl(CompanyTypeMaster companyTypeMaster)
		throws SystemException {
		companyTypeMaster = toUnwrappedModel(companyTypeMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyTypeMaster)) {
				companyTypeMaster = (CompanyTypeMaster)session.get(CompanyTypeMasterImpl.class,
						companyTypeMaster.getPrimaryKeyObj());
			}

			if (companyTypeMaster != null) {
				session.delete(companyTypeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (companyTypeMaster != null) {
			clearCache(companyTypeMaster);
		}

		return companyTypeMaster;
	}

	@Override
	public CompanyTypeMaster updateImpl(
		com.itlifter.employee.service.model.CompanyTypeMaster companyTypeMaster)
		throws SystemException {
		companyTypeMaster = toUnwrappedModel(companyTypeMaster);

		boolean isNew = companyTypeMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (companyTypeMaster.isNew()) {
				session.save(companyTypeMaster);

				companyTypeMaster.setNew(false);
			}
			else {
				session.merge(companyTypeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			CompanyTypeMasterImpl.class, companyTypeMaster.getPrimaryKey(),
			companyTypeMaster);

		return companyTypeMaster;
	}

	protected CompanyTypeMaster toUnwrappedModel(
		CompanyTypeMaster companyTypeMaster) {
		if (companyTypeMaster instanceof CompanyTypeMasterImpl) {
			return companyTypeMaster;
		}

		CompanyTypeMasterImpl companyTypeMasterImpl = new CompanyTypeMasterImpl();

		companyTypeMasterImpl.setNew(companyTypeMaster.isNew());
		companyTypeMasterImpl.setPrimaryKey(companyTypeMaster.getPrimaryKey());

		companyTypeMasterImpl.setTypeId(companyTypeMaster.getTypeId());
		companyTypeMasterImpl.setTypeCode(companyTypeMaster.getTypeCode());
		companyTypeMasterImpl.setTypeName(companyTypeMaster.getTypeName());

		return companyTypeMasterImpl;
	}

	/**
	 * Returns the company type master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the company type master
	 * @return the company type master
	 * @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyTypeMasterException, SystemException {
		CompanyTypeMaster companyTypeMaster = fetchByPrimaryKey(primaryKey);

		if (companyTypeMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return companyTypeMaster;
	}

	/**
	 * Returns the company type master with the primary key or throws a {@link com.itlifter.employee.service.NoSuchCompanyTypeMasterException} if it could not be found.
	 *
	 * @param typeId the primary key of the company type master
	 * @return the company type master
	 * @throws com.itlifter.employee.service.NoSuchCompanyTypeMasterException if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster findByPrimaryKey(long typeId)
		throws NoSuchCompanyTypeMasterException, SystemException {
		return findByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns the company type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company type master
	 * @return the company type master, or <code>null</code> if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CompanyTypeMaster companyTypeMaster = (CompanyTypeMaster)EntityCacheUtil.getResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				CompanyTypeMasterImpl.class, primaryKey);

		if (companyTypeMaster == _nullCompanyTypeMaster) {
			return null;
		}

		if (companyTypeMaster == null) {
			Session session = null;

			try {
				session = openSession();

				companyTypeMaster = (CompanyTypeMaster)session.get(CompanyTypeMasterImpl.class,
						primaryKey);

				if (companyTypeMaster != null) {
					cacheResult(companyTypeMaster);
				}
				else {
					EntityCacheUtil.putResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						CompanyTypeMasterImpl.class, primaryKey,
						_nullCompanyTypeMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CompanyTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
					CompanyTypeMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return companyTypeMaster;
	}

	/**
	 * Returns the company type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the company type master
	 * @return the company type master, or <code>null</code> if a company type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompanyTypeMaster fetchByPrimaryKey(long typeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns all the company type masters.
	 *
	 * @return the company type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompanyTypeMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CompanyTypeMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<CompanyTypeMaster> findAll(int start, int end,
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

		List<CompanyTypeMaster> list = (List<CompanyTypeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COMPANYTYPEMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYTYPEMASTER;

				if (pagination) {
					sql = sql.concat(CompanyTypeMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CompanyTypeMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompanyTypeMaster>(list);
				}
				else {
					list = (List<CompanyTypeMaster>)QueryUtil.list(q,
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
	 * Removes all the company type masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CompanyTypeMaster companyTypeMaster : findAll()) {
			remove(companyTypeMaster);
		}
	}

	/**
	 * Returns the number of company type masters.
	 *
	 * @return the number of company type masters
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

				Query q = session.createQuery(_SQL_COUNT_COMPANYTYPEMASTER);

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
	 * Initializes the company type master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.itlifter.employee.service.model.CompanyTypeMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CompanyTypeMaster>> listenersList = new ArrayList<ModelListener<CompanyTypeMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CompanyTypeMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CompanyTypeMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COMPANYTYPEMASTER = "SELECT companyTypeMaster FROM CompanyTypeMaster companyTypeMaster";
	private static final String _SQL_COUNT_COMPANYTYPEMASTER = "SELECT COUNT(companyTypeMaster) FROM CompanyTypeMaster companyTypeMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "companyTypeMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CompanyTypeMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CompanyTypeMasterPersistenceImpl.class);
	private static CompanyTypeMaster _nullCompanyTypeMaster = new CompanyTypeMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CompanyTypeMaster> toCacheModel() {
				return _nullCompanyTypeMasterCacheModel;
			}
		};

	private static CacheModel<CompanyTypeMaster> _nullCompanyTypeMasterCacheModel =
		new CacheModel<CompanyTypeMaster>() {
			@Override
			public CompanyTypeMaster toEntityModel() {
				return _nullCompanyTypeMaster;
			}
		};
}