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

package com.itlifter.employee.service.model;

import com.itlifter.employee.service.service.ClpSerializer;
import com.itlifter.employee.service.service.CompanyTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ashish
 */
public class CompanyTypeMasterClp extends BaseModelImpl<CompanyTypeMaster>
	implements CompanyTypeMaster {
	public CompanyTypeMasterClp() {
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

		if (_companyTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _companyTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeId", long.class);

				method.invoke(_companyTypeMasterRemoteModel, typeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeCode() {
		return _TypeCode;
	}

	@Override
	public void setTypeCode(String TypeCode) {
		_TypeCode = TypeCode;

		if (_companyTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _companyTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeCode", String.class);

				method.invoke(_companyTypeMasterRemoteModel, TypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeName() {
		return _TypeName;
	}

	@Override
	public void setTypeName(String TypeName) {
		_TypeName = TypeName;

		if (_companyTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _companyTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeName", String.class);

				method.invoke(_companyTypeMasterRemoteModel, TypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCompanyTypeMasterRemoteModel() {
		return _companyTypeMasterRemoteModel;
	}

	public void setCompanyTypeMasterRemoteModel(
		BaseModel<?> companyTypeMasterRemoteModel) {
		_companyTypeMasterRemoteModel = companyTypeMasterRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _companyTypeMasterRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_companyTypeMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CompanyTypeMasterLocalServiceUtil.addCompanyTypeMaster(this);
		}
		else {
			CompanyTypeMasterLocalServiceUtil.updateCompanyTypeMaster(this);
		}
	}

	@Override
	public CompanyTypeMaster toEscapedModel() {
		return (CompanyTypeMaster)ProxyUtil.newProxyInstance(CompanyTypeMaster.class.getClassLoader(),
			new Class[] { CompanyTypeMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CompanyTypeMasterClp clone = new CompanyTypeMasterClp();

		clone.setTypeId(getTypeId());
		clone.setTypeCode(getTypeCode());
		clone.setTypeName(getTypeName());

		return clone;
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

		if (!(obj instanceof CompanyTypeMasterClp)) {
			return false;
		}

		CompanyTypeMasterClp companyTypeMaster = (CompanyTypeMasterClp)obj;

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

	private long _typeId;
	private String _TypeCode;
	private String _TypeName;
	private BaseModel<?> _companyTypeMasterRemoteModel;
}