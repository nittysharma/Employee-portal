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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Ashish
 * @generated
 */
public class CompanyTypeMasterSoap implements Serializable {
	public static CompanyTypeMasterSoap toSoapModel(CompanyTypeMaster model) {
		CompanyTypeMasterSoap soapModel = new CompanyTypeMasterSoap();

		soapModel.setTypeId(model.getTypeId());
		soapModel.setTypeCode(model.getTypeCode());
		soapModel.setTypeName(model.getTypeName());

		return soapModel;
	}

	public static CompanyTypeMasterSoap[] toSoapModels(
		CompanyTypeMaster[] models) {
		CompanyTypeMasterSoap[] soapModels = new CompanyTypeMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompanyTypeMasterSoap[][] toSoapModels(
		CompanyTypeMaster[][] models) {
		CompanyTypeMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompanyTypeMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompanyTypeMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompanyTypeMasterSoap[] toSoapModels(
		List<CompanyTypeMaster> models) {
		List<CompanyTypeMasterSoap> soapModels = new ArrayList<CompanyTypeMasterSoap>(models.size());

		for (CompanyTypeMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompanyTypeMasterSoap[soapModels.size()]);
	}

	public CompanyTypeMasterSoap() {
	}

	public long getPrimaryKey() {
		return _typeId;
	}

	public void setPrimaryKey(long pk) {
		setTypeId(pk);
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public String getTypeCode() {
		return _TypeCode;
	}

	public void setTypeCode(String TypeCode) {
		_TypeCode = TypeCode;
	}

	public String getTypeName() {
		return _TypeName;
	}

	public void setTypeName(String TypeName) {
		_TypeName = TypeName;
	}

	private long _typeId;
	private String _TypeCode;
	private String _TypeName;
}