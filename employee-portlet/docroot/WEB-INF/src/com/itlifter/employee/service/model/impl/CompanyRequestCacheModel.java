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

import com.itlifter.employee.service.model.CompanyRequest;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanyRequest in entity cache.
 *
 * @author Ashish
 * @see CompanyRequest
 * @generated
 */
public class CompanyRequestCacheModel implements CacheModel<CompanyRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(95);

		sb.append("{requestId=");
		sb.append(requestId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", cname=");
		sb.append(cname);
		sb.append(", ctype=");
		sb.append(ctype);
		sb.append(", crecursable=");
		sb.append(crecursable);
		sb.append(", cregionId=");
		sb.append(cregionId);
		sb.append(", ccountryId=");
		sb.append(ccountryId);
		sb.append(", caddress=");
		sb.append(caddress);
		sb.append(", cphone=");
		sb.append(cphone);
		sb.append(", cwebsite=");
		sb.append(cwebsite);
		sb.append(", cemailAddress=");
		sb.append(cemailAddress);
		sb.append(", caddress1=");
		sb.append(caddress1);
		sb.append(", caddress2=");
		sb.append(caddress2);
		sb.append(", carea=");
		sb.append(carea);
		sb.append(", ccity=");
		sb.append(ccity);
		sb.append(", cdistrict=");
		sb.append(cdistrict);
		sb.append(", cstate=");
		sb.append(cstate);
		sb.append(", czipcode=");
		sb.append(czipcode);
		sb.append(", cfax=");
		sb.append(cfax);
		sb.append(", title=");
		sb.append(title);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", exts1=");
		sb.append(exts1);
		sb.append(", exts2=");
		sb.append(exts2);
		sb.append(", exts3=");
		sb.append(exts3);
		sb.append(", exts4=");
		sb.append(exts4);
		sb.append(", exts5=");
		sb.append(exts5);
		sb.append(", exts6=");
		sb.append(exts6);
		sb.append(", exts7=");
		sb.append(exts7);
		sb.append(", exts8=");
		sb.append(exts8);
		sb.append(", exts9=");
		sb.append(exts9);
		sb.append(", extl10=");
		sb.append(extl10);
		sb.append(", extl11=");
		sb.append(extl11);
		sb.append(", extl12=");
		sb.append(extl12);
		sb.append(", extd13=");
		sb.append(extd13);
		sb.append(", extd14=");
		sb.append(extd14);
		sb.append(", extd15=");
		sb.append(extd15);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyRequest toEntityModel() {
		CompanyRequestImpl companyRequestImpl = new CompanyRequestImpl();

		companyRequestImpl.setRequestId(requestId);
		companyRequestImpl.setCompanyId(companyId);
		companyRequestImpl.setGroupId(groupId);
		companyRequestImpl.setUserId(userId);

		if (cname == null) {
			companyRequestImpl.setCname(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCname(cname);
		}

		if (ctype == null) {
			companyRequestImpl.setCtype(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCtype(ctype);
		}

		companyRequestImpl.setCrecursable(crecursable);
		companyRequestImpl.setCregionId(cregionId);
		companyRequestImpl.setCcountryId(ccountryId);

		if (caddress == null) {
			companyRequestImpl.setCaddress(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCaddress(caddress);
		}

		companyRequestImpl.setCphone(cphone);

		if (cwebsite == null) {
			companyRequestImpl.setCwebsite(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCwebsite(cwebsite);
		}

		if (cemailAddress == null) {
			companyRequestImpl.setCemailAddress(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCemailAddress(cemailAddress);
		}

		if (caddress1 == null) {
			companyRequestImpl.setCaddress1(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCaddress1(caddress1);
		}

		if (caddress2 == null) {
			companyRequestImpl.setCaddress2(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCaddress2(caddress2);
		}

		if (carea == null) {
			companyRequestImpl.setCarea(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCarea(carea);
		}

		if (ccity == null) {
			companyRequestImpl.setCcity(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCcity(ccity);
		}

		if (cdistrict == null) {
			companyRequestImpl.setCdistrict(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCdistrict(cdistrict);
		}

		if (cstate == null) {
			companyRequestImpl.setCstate(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setCstate(cstate);
		}

		companyRequestImpl.setCzipcode(czipcode);
		companyRequestImpl.setCfax(cfax);

		if (title == null) {
			companyRequestImpl.setTitle(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setTitle(title);
		}

		if (firstName == null) {
			companyRequestImpl.setFirstName(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			companyRequestImpl.setLastName(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setLastName(lastName);
		}

		if (designation == null) {
			companyRequestImpl.setDesignation(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setDesignation(designation);
		}

		companyRequestImpl.setFax(fax);
		companyRequestImpl.setMobile(mobile);

		if (email == null) {
			companyRequestImpl.setEmail(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setEmail(email);
		}

		if (status == null) {
			companyRequestImpl.setStatus(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setStatus(status);
		}

		if (createDate == Long.MIN_VALUE) {
			companyRequestImpl.setCreateDate(null);
		}
		else {
			companyRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companyRequestImpl.setModifiedDate(null);
		}
		else {
			companyRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (userName == null) {
			companyRequestImpl.setUserName(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setUserName(userName);
		}

		if (exts1 == null) {
			companyRequestImpl.setExts1(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts1(exts1);
		}

		if (exts2 == null) {
			companyRequestImpl.setExts2(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts2(exts2);
		}

		if (exts3 == null) {
			companyRequestImpl.setExts3(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts3(exts3);
		}

		if (exts4 == null) {
			companyRequestImpl.setExts4(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts4(exts4);
		}

		if (exts5 == null) {
			companyRequestImpl.setExts5(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts5(exts5);
		}

		if (exts6 == null) {
			companyRequestImpl.setExts6(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts6(exts6);
		}

		if (exts7 == null) {
			companyRequestImpl.setExts7(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts7(exts7);
		}

		if (exts8 == null) {
			companyRequestImpl.setExts8(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts8(exts8);
		}

		if (exts9 == null) {
			companyRequestImpl.setExts9(StringPool.BLANK);
		}
		else {
			companyRequestImpl.setExts9(exts9);
		}

		companyRequestImpl.setExtl10(extl10);
		companyRequestImpl.setExtl11(extl11);
		companyRequestImpl.setExtl12(extl12);

		if (extd13 == Long.MIN_VALUE) {
			companyRequestImpl.setExtd13(null);
		}
		else {
			companyRequestImpl.setExtd13(new Date(extd13));
		}

		if (extd14 == Long.MIN_VALUE) {
			companyRequestImpl.setExtd14(null);
		}
		else {
			companyRequestImpl.setExtd14(new Date(extd14));
		}

		if (extd15 == Long.MIN_VALUE) {
			companyRequestImpl.setExtd15(null);
		}
		else {
			companyRequestImpl.setExtd15(new Date(extd15));
		}

		companyRequestImpl.resetOriginalValues();

		return companyRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		requestId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		cname = objectInput.readUTF();
		ctype = objectInput.readUTF();
		crecursable = objectInput.readBoolean();
		cregionId = objectInput.readLong();
		ccountryId = objectInput.readLong();
		caddress = objectInput.readUTF();
		cphone = objectInput.readLong();
		cwebsite = objectInput.readUTF();
		cemailAddress = objectInput.readUTF();
		caddress1 = objectInput.readUTF();
		caddress2 = objectInput.readUTF();
		carea = objectInput.readUTF();
		ccity = objectInput.readUTF();
		cdistrict = objectInput.readUTF();
		cstate = objectInput.readUTF();
		czipcode = objectInput.readLong();
		cfax = objectInput.readLong();
		title = objectInput.readUTF();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		designation = objectInput.readUTF();
		fax = objectInput.readLong();
		mobile = objectInput.readLong();
		email = objectInput.readUTF();
		status = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		userName = objectInput.readUTF();
		exts1 = objectInput.readUTF();
		exts2 = objectInput.readUTF();
		exts3 = objectInput.readUTF();
		exts4 = objectInput.readUTF();
		exts5 = objectInput.readUTF();
		exts6 = objectInput.readUTF();
		exts7 = objectInput.readUTF();
		exts8 = objectInput.readUTF();
		exts9 = objectInput.readUTF();
		extl10 = objectInput.readLong();
		extl11 = objectInput.readLong();
		extl12 = objectInput.readLong();
		extd13 = objectInput.readLong();
		extd14 = objectInput.readLong();
		extd15 = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(requestId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (cname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cname);
		}

		if (ctype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ctype);
		}

		objectOutput.writeBoolean(crecursable);
		objectOutput.writeLong(cregionId);
		objectOutput.writeLong(ccountryId);

		if (caddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(caddress);
		}

		objectOutput.writeLong(cphone);

		if (cwebsite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cwebsite);
		}

		if (cemailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cemailAddress);
		}

		if (caddress1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(caddress1);
		}

		if (caddress2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(caddress2);
		}

		if (carea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(carea);
		}

		if (ccity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccity);
		}

		if (cdistrict == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cdistrict);
		}

		if (cstate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cstate);
		}

		objectOutput.writeLong(czipcode);
		objectOutput.writeLong(cfax);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}

		objectOutput.writeLong(fax);
		objectOutput.writeLong(mobile);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (exts1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts1);
		}

		if (exts2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts2);
		}

		if (exts3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts3);
		}

		if (exts4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts4);
		}

		if (exts5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts5);
		}

		if (exts6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts6);
		}

		if (exts7 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts7);
		}

		if (exts8 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts8);
		}

		if (exts9 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(exts9);
		}

		objectOutput.writeLong(extl10);
		objectOutput.writeLong(extl11);
		objectOutput.writeLong(extl12);
		objectOutput.writeLong(extd13);
		objectOutput.writeLong(extd14);
		objectOutput.writeLong(extd15);
	}

	public long requestId;
	public long companyId;
	public long groupId;
	public long userId;
	public String cname;
	public String ctype;
	public boolean crecursable;
	public long cregionId;
	public long ccountryId;
	public String caddress;
	public long cphone;
	public String cwebsite;
	public String cemailAddress;
	public String caddress1;
	public String caddress2;
	public String carea;
	public String ccity;
	public String cdistrict;
	public String cstate;
	public long czipcode;
	public long cfax;
	public String title;
	public String firstName;
	public String lastName;
	public String designation;
	public long fax;
	public long mobile;
	public String email;
	public String status;
	public long createDate;
	public long modifiedDate;
	public String userName;
	public String exts1;
	public String exts2;
	public String exts3;
	public String exts4;
	public String exts5;
	public String exts6;
	public String exts7;
	public String exts8;
	public String exts9;
	public long extl10;
	public long extl11;
	public long extl12;
	public long extd13;
	public long extd14;
	public long extd15;
}