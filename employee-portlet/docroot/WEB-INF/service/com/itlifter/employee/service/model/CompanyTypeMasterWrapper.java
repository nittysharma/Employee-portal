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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CompanyTypeMaster}.
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMaster
 * @generated
 */
public class CompanyTypeMasterWrapper implements CompanyTypeMaster,
	ModelWrapper<CompanyTypeMaster> {
	public CompanyTypeMasterWrapper(CompanyTypeMaster companyTypeMaster) {
		_companyTypeMaster = companyTypeMaster;
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

	/**
	* Returns the primary key of this company type master.
	*
	* @return the primary key of this company type master
	*/
	@Override
	public long getPrimaryKey() {
		return _companyTypeMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this company type master.
	*
	* @param primaryKey the primary key of this company type master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_companyTypeMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the type ID of this company type master.
	*
	* @return the type ID of this company type master
	*/
	@Override
	public long getTypeId() {
		return _companyTypeMaster.getTypeId();
	}

	/**
	* Sets the type ID of this company type master.
	*
	* @param typeId the type ID of this company type master
	*/
	@Override
	public void setTypeId(long typeId) {
		_companyTypeMaster.setTypeId(typeId);
	}

	/**
	* Returns the type code of this company type master.
	*
	* @return the type code of this company type master
	*/
	@Override
	public java.lang.String getTypeCode() {
		return _companyTypeMaster.getTypeCode();
	}

	/**
	* Sets the type code of this company type master.
	*
	* @param TypeCode the type code of this company type master
	*/
	@Override
	public void setTypeCode(java.lang.String TypeCode) {
		_companyTypeMaster.setTypeCode(TypeCode);
	}

	/**
	* Returns the type name of this company type master.
	*
	* @return the type name of this company type master
	*/
	@Override
	public java.lang.String getTypeName() {
		return _companyTypeMaster.getTypeName();
	}

	/**
	* Sets the type name of this company type master.
	*
	* @param TypeName the type name of this company type master
	*/
	@Override
	public void setTypeName(java.lang.String TypeName) {
		_companyTypeMaster.setTypeName(TypeName);
	}

	@Override
	public boolean isNew() {
		return _companyTypeMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_companyTypeMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _companyTypeMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_companyTypeMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _companyTypeMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _companyTypeMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_companyTypeMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _companyTypeMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_companyTypeMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_companyTypeMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_companyTypeMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CompanyTypeMasterWrapper((CompanyTypeMaster)_companyTypeMaster.clone());
	}

	@Override
	public int compareTo(CompanyTypeMaster companyTypeMaster) {
		return _companyTypeMaster.compareTo(companyTypeMaster);
	}

	@Override
	public int hashCode() {
		return _companyTypeMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CompanyTypeMaster> toCacheModel() {
		return _companyTypeMaster.toCacheModel();
	}

	@Override
	public CompanyTypeMaster toEscapedModel() {
		return new CompanyTypeMasterWrapper(_companyTypeMaster.toEscapedModel());
	}

	@Override
	public CompanyTypeMaster toUnescapedModel() {
		return new CompanyTypeMasterWrapper(_companyTypeMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _companyTypeMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _companyTypeMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_companyTypeMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompanyTypeMasterWrapper)) {
			return false;
		}

		CompanyTypeMasterWrapper companyTypeMasterWrapper = (CompanyTypeMasterWrapper)obj;

		if (Validator.equals(_companyTypeMaster,
					companyTypeMasterWrapper._companyTypeMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CompanyTypeMaster getWrappedCompanyTypeMaster() {
		return _companyTypeMaster;
	}

	@Override
	public CompanyTypeMaster getWrappedModel() {
		return _companyTypeMaster;
	}

	@Override
	public void resetOriginalValues() {
		_companyTypeMaster.resetOriginalValues();
	}

	private CompanyTypeMaster _companyTypeMaster;
}