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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CompanyTypeMaster in entity cache.
 *
 * @author Ashish
 * @see CompanyTypeMaster
 * @generated
 */
public class CompanyTypeMasterCacheModel implements CacheModel<CompanyTypeMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{typeId=");
		sb.append(typeId);
		sb.append(", TypeCode=");
		sb.append(TypeCode);
		sb.append(", TypeName=");
		sb.append(TypeName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyTypeMaster toEntityModel() {
		CompanyTypeMasterImpl companyTypeMasterImpl = new CompanyTypeMasterImpl();

		companyTypeMasterImpl.setTypeId(typeId);

		if (TypeCode == null) {
			companyTypeMasterImpl.setTypeCode(StringPool.BLANK);
		}
		else {
			companyTypeMasterImpl.setTypeCode(TypeCode);
		}

		if (TypeName == null) {
			companyTypeMasterImpl.setTypeName(StringPool.BLANK);
		}
		else {
			companyTypeMasterImpl.setTypeName(TypeName);
		}

		companyTypeMasterImpl.resetOriginalValues();

		return companyTypeMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		typeId = objectInput.readLong();
		TypeCode = objectInput.readUTF();
		TypeName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(typeId);

		if (TypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TypeCode);
		}

		if (TypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TypeName);
		}
	}

	public long typeId;
	public String TypeCode;
	public String TypeName;
}