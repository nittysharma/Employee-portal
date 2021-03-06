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

package com.itlifter.employee.service.model.impl;

import com.itlifter.employee.service.model.CompanyTypeMaster;
import com.itlifter.employee.service.model.CompanyTypeMasterModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CompanyTypeMaster service. Represents a row in the &quot;employee_CompanyTypeMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.itlifter.employee.service.model.CompanyTypeMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyTypeMasterImpl}.
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMasterImpl
 * @see com.itlifter.employee.service.model.CompanyTypeMaster
 * @see com.itlifter.employee.service.model.CompanyTypeMasterModel
 * @generated
 */
public class CompanyTypeMasterModelImpl extends BaseModelImpl<CompanyTypeMaster>
	implements CompanyTypeMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company type master model instance should use the {@link com.itlifter.employee.service.model.CompanyTypeMaster} interface instead.
	 */
	public static final String TABLE_NAME = "employee_CompanyTypeMaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "typeId", Types.BIGINT },
			{ "TypeCode", Types.VARCHAR },
			{ "TypeName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table employee_CompanyTypeMaster (typeId LONG not null primary key,TypeCode VARCHAR(75) null,TypeName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table employee_CompanyTypeMaster";
	public static final String ORDER_BY_JPQL = " ORDER BY companyTypeMaster.typeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY employee_CompanyTypeMaster.typeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.itlifter.employee.service.model.CompanyTypeMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.itlifter.employee.service.model.CompanyTypeMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.itlifter.employee.service.model.CompanyTypeMaster"));

	public CompanyTypeMasterModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _typeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTypeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _typeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CompanyTypeMaster.class;
	}

	@Override
	public String getModelClassName() {
		return CompanyTypeMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("TypeCode", getTypeCode());
		attributes.put("TypeName", getTypeName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String TypeCode = (String)attributes.get("TypeCode");

		if (TypeCode != null) {
			setTypeCode(TypeCode);
		}

		String TypeName = (String)attributes.get("TypeName");

		if (TypeName != null) {
			setTypeName(TypeName);
		}
	}

	@Override
	public long getTypeId() {
		return _typeId;
	}

	@Override
	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	@Override
	public String getTypeCode() {
		if (_TypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _TypeCode;
		}
	}

	@Override
	public void setTypeCode(String TypeCode) {
		_TypeCode = TypeCode;
	}

	@Override
	public String getTypeName() {
		if (_TypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _TypeName;
		}
	}

	@Override
	public void setTypeName(String TypeName) {
		_TypeName = TypeName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CompanyTypeMaster.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CompanyTypeMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CompanyTypeMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CompanyTypeMasterImpl companyTypeMasterImpl = new CompanyTypeMasterImpl();

		companyTypeMasterImpl.setTypeId(getTypeId());
		companyTypeMasterImpl.setTypeCode(getTypeCode());
		companyTypeMasterImpl.setTypeName(getTypeName());

		companyTypeMasterImpl.resetOriginalValues();

		return companyTypeMasterImpl;
	}

	@Override
	public int compareTo(CompanyTypeMaster companyTypeMaster) {
		long primaryKey = companyTypeMaster.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompanyTypeMaster)) {
			return false;
		}

		CompanyTypeMaster companyTypeMaster = (CompanyTypeMaster)obj;

		long primaryKey = companyTypeMaster.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<CompanyTypeMaster> toCacheModel() {
		CompanyTypeMasterCacheModel companyTypeMasterCacheModel = new CompanyTypeMasterCacheModel();

		companyTypeMasterCacheModel.typeId = getTypeId();

		companyTypeMasterCacheModel.TypeCode = getTypeCode();

		String TypeCode = companyTypeMasterCacheModel.TypeCode;

		if ((TypeCode != null) && (TypeCode.length() == 0)) {
			companyTypeMasterCacheModel.TypeCode = null;
		}

		companyTypeMasterCacheModel.TypeName = getTypeName();

		String TypeName = companyTypeMasterCacheModel.TypeName;

		if ((TypeName != null) && (TypeName.length() == 0)) {
			companyTypeMasterCacheModel.TypeName = null;
		}

		return companyTypeMasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{typeId=");
		sb.append(getTypeId());
		sb.append(", TypeCode=");
		sb.append(getTypeCode());
		sb.append(", TypeName=");
		sb.append(getTypeName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.itlifter.employee.service.model.CompanyTypeMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TypeCode</column-name><column-value><![CDATA[");
		sb.append(getTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TypeName</column-name><column-value><![CDATA[");
		sb.append(getTypeName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CompanyTypeMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CompanyTypeMaster.class
		};
	private long _typeId;
	private String _TypeCode;
	private String _TypeName;
	private CompanyTypeMaster _escapedModel;
}