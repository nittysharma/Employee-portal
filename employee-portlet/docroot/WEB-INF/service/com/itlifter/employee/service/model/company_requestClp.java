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
import com.itlifter.employee.service.service.company_requestLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ashish
 */
public class company_requestClp extends BaseModelImpl<company_request>
	implements company_request {
	public company_requestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return company_request.class;
	}

	@Override
	public String getModelClassName() {
		return company_request.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _requestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requestId", getRequestId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("cname", getCname());
		attributes.put("ctype", getCtype());
		attributes.put("crecursable", getCrecursable());
		attributes.put("cregionId", getCregionId());
		attributes.put("ccountryId", getCcountryId());
		attributes.put("caddress", getCaddress());
		attributes.put("cphone", getCphone());
		attributes.put("cwebsite", getCwebsite());
		attributes.put("cemailAddress", getCemailAddress());
		attributes.put("caddress1", getCaddress1());
		attributes.put("caddress2", getCaddress2());
		attributes.put("carea", getCarea());
		attributes.put("ccity", getCcity());
		attributes.put("cdistrict", getCdistrict());
		attributes.put("cstate", getCstate());
		attributes.put("czipcode", getCzipcode());
		attributes.put("cfax", getCfax());
		attributes.put("title", getTitle());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("designation", getDesignation());
		attributes.put("fax", getFax());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("status", getStatus());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userName", getUserName());
		attributes.put("exts1", getExts1());
		attributes.put("exts2", getExts2());
		attributes.put("exts3", getExts3());
		attributes.put("exts4", getExts4());
		attributes.put("exts5", getExts5());
		attributes.put("exts6", getExts6());
		attributes.put("exts7", getExts7());
		attributes.put("exts8", getExts8());
		attributes.put("exts9", getExts9());
		attributes.put("extl10", getExtl10());
		attributes.put("extl11", getExtl11());
		attributes.put("extl12", getExtl12());
		attributes.put("extd13", getExtd13());
		attributes.put("extd14", getExtd14());
		attributes.put("extd15", getExtd15());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requestId = (Long)attributes.get("requestId");

		if (requestId != null) {
			setRequestId(requestId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String cname = (String)attributes.get("cname");

		if (cname != null) {
			setCname(cname);
		}

		String ctype = (String)attributes.get("ctype");

		if (ctype != null) {
			setCtype(ctype);
		}

		Boolean crecursable = (Boolean)attributes.get("crecursable");

		if (crecursable != null) {
			setCrecursable(crecursable);
		}

		Long cregionId = (Long)attributes.get("cregionId");

		if (cregionId != null) {
			setCregionId(cregionId);
		}

		Long ccountryId = (Long)attributes.get("ccountryId");

		if (ccountryId != null) {
			setCcountryId(ccountryId);
		}

		String caddress = (String)attributes.get("caddress");

		if (caddress != null) {
			setCaddress(caddress);
		}

		Long cphone = (Long)attributes.get("cphone");

		if (cphone != null) {
			setCphone(cphone);
		}

		Long cwebsite = (Long)attributes.get("cwebsite");

		if (cwebsite != null) {
			setCwebsite(cwebsite);
		}

		String cemailAddress = (String)attributes.get("cemailAddress");

		if (cemailAddress != null) {
			setCemailAddress(cemailAddress);
		}

		String caddress1 = (String)attributes.get("caddress1");

		if (caddress1 != null) {
			setCaddress1(caddress1);
		}

		String caddress2 = (String)attributes.get("caddress2");

		if (caddress2 != null) {
			setCaddress2(caddress2);
		}

		String carea = (String)attributes.get("carea");

		if (carea != null) {
			setCarea(carea);
		}

		String ccity = (String)attributes.get("ccity");

		if (ccity != null) {
			setCcity(ccity);
		}

		String cdistrict = (String)attributes.get("cdistrict");

		if (cdistrict != null) {
			setCdistrict(cdistrict);
		}

		String cstate = (String)attributes.get("cstate");

		if (cstate != null) {
			setCstate(cstate);
		}

		Long czipcode = (Long)attributes.get("czipcode");

		if (czipcode != null) {
			setCzipcode(czipcode);
		}

		Long cfax = (Long)attributes.get("cfax");

		if (cfax != null) {
			setCfax(cfax);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		Long fax = (Long)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		Long mobile = (Long)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String exts1 = (String)attributes.get("exts1");

		if (exts1 != null) {
			setExts1(exts1);
		}

		String exts2 = (String)attributes.get("exts2");

		if (exts2 != null) {
			setExts2(exts2);
		}

		String exts3 = (String)attributes.get("exts3");

		if (exts3 != null) {
			setExts3(exts3);
		}

		String exts4 = (String)attributes.get("exts4");

		if (exts4 != null) {
			setExts4(exts4);
		}

		String exts5 = (String)attributes.get("exts5");

		if (exts5 != null) {
			setExts5(exts5);
		}

		String exts6 = (String)attributes.get("exts6");

		if (exts6 != null) {
			setExts6(exts6);
		}

		String exts7 = (String)attributes.get("exts7");

		if (exts7 != null) {
			setExts7(exts7);
		}

		String exts8 = (String)attributes.get("exts8");

		if (exts8 != null) {
			setExts8(exts8);
		}

		String exts9 = (String)attributes.get("exts9");

		if (exts9 != null) {
			setExts9(exts9);
		}

		Long extl10 = (Long)attributes.get("extl10");

		if (extl10 != null) {
			setExtl10(extl10);
		}

		Long extl11 = (Long)attributes.get("extl11");

		if (extl11 != null) {
			setExtl11(extl11);
		}

		Long extl12 = (Long)attributes.get("extl12");

		if (extl12 != null) {
			setExtl12(extl12);
		}

		Date extd13 = (Date)attributes.get("extd13");

		if (extd13 != null) {
			setExtd13(extd13);
		}

		Date extd14 = (Date)attributes.get("extd14");

		if (extd14 != null) {
			setExtd14(extd14);
		}

		Date extd15 = (Date)attributes.get("extd15");

		if (extd15 != null) {
			setExtd15(extd15);
		}
	}

	@Override
	public long getRequestId() {
		return _requestId;
	}

	@Override
	public void setRequestId(long requestId) {
		_requestId = requestId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestId", long.class);

				method.invoke(_company_requestRemoteModel, requestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_company_requestRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_company_requestRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_company_requestRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getCname() {
		return _cname;
	}

	@Override
	public void setCname(String cname) {
		_cname = cname;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCname", String.class);

				method.invoke(_company_requestRemoteModel, cname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCtype() {
		return _ctype;
	}

	@Override
	public void setCtype(String ctype) {
		_ctype = ctype;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCtype", String.class);

				method.invoke(_company_requestRemoteModel, ctype);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCrecursable() {
		return _crecursable;
	}

	@Override
	public boolean isCrecursable() {
		return _crecursable;
	}

	@Override
	public void setCrecursable(boolean crecursable) {
		_crecursable = crecursable;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCrecursable", boolean.class);

				method.invoke(_company_requestRemoteModel, crecursable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCregionId() {
		return _cregionId;
	}

	@Override
	public void setCregionId(long cregionId) {
		_cregionId = cregionId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCregionId", long.class);

				method.invoke(_company_requestRemoteModel, cregionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCcountryId() {
		return _ccountryId;
	}

	@Override
	public void setCcountryId(long ccountryId) {
		_ccountryId = ccountryId;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCcountryId", long.class);

				method.invoke(_company_requestRemoteModel, ccountryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCaddress() {
		return _caddress;
	}

	@Override
	public void setCaddress(String caddress) {
		_caddress = caddress;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCaddress", String.class);

				method.invoke(_company_requestRemoteModel, caddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCphone() {
		return _cphone;
	}

	@Override
	public void setCphone(long cphone) {
		_cphone = cphone;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCphone", long.class);

				method.invoke(_company_requestRemoteModel, cphone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCwebsite() {
		return _cwebsite;
	}

	@Override
	public void setCwebsite(long cwebsite) {
		_cwebsite = cwebsite;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCwebsite", long.class);

				method.invoke(_company_requestRemoteModel, cwebsite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCemailAddress() {
		return _cemailAddress;
	}

	@Override
	public void setCemailAddress(String cemailAddress) {
		_cemailAddress = cemailAddress;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCemailAddress", String.class);

				method.invoke(_company_requestRemoteModel, cemailAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCaddress1() {
		return _caddress1;
	}

	@Override
	public void setCaddress1(String caddress1) {
		_caddress1 = caddress1;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCaddress1", String.class);

				method.invoke(_company_requestRemoteModel, caddress1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCaddress2() {
		return _caddress2;
	}

	@Override
	public void setCaddress2(String caddress2) {
		_caddress2 = caddress2;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCaddress2", String.class);

				method.invoke(_company_requestRemoteModel, caddress2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCarea() {
		return _carea;
	}

	@Override
	public void setCarea(String carea) {
		_carea = carea;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCarea", String.class);

				method.invoke(_company_requestRemoteModel, carea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCcity() {
		return _ccity;
	}

	@Override
	public void setCcity(String ccity) {
		_ccity = ccity;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCcity", String.class);

				method.invoke(_company_requestRemoteModel, ccity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCdistrict() {
		return _cdistrict;
	}

	@Override
	public void setCdistrict(String cdistrict) {
		_cdistrict = cdistrict;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCdistrict", String.class);

				method.invoke(_company_requestRemoteModel, cdistrict);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCstate() {
		return _cstate;
	}

	@Override
	public void setCstate(String cstate) {
		_cstate = cstate;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCstate", String.class);

				method.invoke(_company_requestRemoteModel, cstate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCzipcode() {
		return _czipcode;
	}

	@Override
	public void setCzipcode(long czipcode) {
		_czipcode = czipcode;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCzipcode", long.class);

				method.invoke(_company_requestRemoteModel, czipcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCfax() {
		return _cfax;
	}

	@Override
	public void setCfax(long cfax) {
		_cfax = cfax;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCfax", long.class);

				method.invoke(_company_requestRemoteModel, cfax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_company_requestRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstName() {
		return _firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_company_requestRemoteModel, firstName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _lastName;
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_company_requestRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesignation() {
		return _designation;
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setDesignation", String.class);

				method.invoke(_company_requestRemoteModel, designation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFax() {
		return _fax;
	}

	@Override
	public void setFax(long fax) {
		_fax = fax;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", long.class);

				method.invoke(_company_requestRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMobile() {
		return _mobile;
	}

	@Override
	public void setMobile(long mobile) {
		_mobile = mobile;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setMobile", long.class);

				method.invoke(_company_requestRemoteModel, mobile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_company_requestRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_company_requestRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_company_requestRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_company_requestRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_company_requestRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts1() {
		return _exts1;
	}

	@Override
	public void setExts1(String exts1) {
		_exts1 = exts1;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts1", String.class);

				method.invoke(_company_requestRemoteModel, exts1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts2() {
		return _exts2;
	}

	@Override
	public void setExts2(String exts2) {
		_exts2 = exts2;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts2", String.class);

				method.invoke(_company_requestRemoteModel, exts2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts3() {
		return _exts3;
	}

	@Override
	public void setExts3(String exts3) {
		_exts3 = exts3;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts3", String.class);

				method.invoke(_company_requestRemoteModel, exts3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts4() {
		return _exts4;
	}

	@Override
	public void setExts4(String exts4) {
		_exts4 = exts4;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts4", String.class);

				method.invoke(_company_requestRemoteModel, exts4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts5() {
		return _exts5;
	}

	@Override
	public void setExts5(String exts5) {
		_exts5 = exts5;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts5", String.class);

				method.invoke(_company_requestRemoteModel, exts5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts6() {
		return _exts6;
	}

	@Override
	public void setExts6(String exts6) {
		_exts6 = exts6;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts6", String.class);

				method.invoke(_company_requestRemoteModel, exts6);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts7() {
		return _exts7;
	}

	@Override
	public void setExts7(String exts7) {
		_exts7 = exts7;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts7", String.class);

				method.invoke(_company_requestRemoteModel, exts7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts8() {
		return _exts8;
	}

	@Override
	public void setExts8(String exts8) {
		_exts8 = exts8;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts8", String.class);

				method.invoke(_company_requestRemoteModel, exts8);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExts9() {
		return _exts9;
	}

	@Override
	public void setExts9(String exts9) {
		_exts9 = exts9;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExts9", String.class);

				method.invoke(_company_requestRemoteModel, exts9);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExtl10() {
		return _extl10;
	}

	@Override
	public void setExtl10(long extl10) {
		_extl10 = extl10;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtl10", long.class);

				method.invoke(_company_requestRemoteModel, extl10);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExtl11() {
		return _extl11;
	}

	@Override
	public void setExtl11(long extl11) {
		_extl11 = extl11;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtl11", long.class);

				method.invoke(_company_requestRemoteModel, extl11);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExtl12() {
		return _extl12;
	}

	@Override
	public void setExtl12(long extl12) {
		_extl12 = extl12;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtl12", long.class);

				method.invoke(_company_requestRemoteModel, extl12);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExtd13() {
		return _extd13;
	}

	@Override
	public void setExtd13(Date extd13) {
		_extd13 = extd13;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtd13", Date.class);

				method.invoke(_company_requestRemoteModel, extd13);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExtd14() {
		return _extd14;
	}

	@Override
	public void setExtd14(Date extd14) {
		_extd14 = extd14;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtd14", Date.class);

				method.invoke(_company_requestRemoteModel, extd14);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExtd15() {
		return _extd15;
	}

	@Override
	public void setExtd15(Date extd15) {
		_extd15 = extd15;

		if (_company_requestRemoteModel != null) {
			try {
				Class<?> clazz = _company_requestRemoteModel.getClass();

				Method method = clazz.getMethod("setExtd15", Date.class);

				method.invoke(_company_requestRemoteModel, extd15);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcompany_requestRemoteModel() {
		return _company_requestRemoteModel;
	}

	public void setcompany_requestRemoteModel(
		BaseModel<?> company_requestRemoteModel) {
		_company_requestRemoteModel = company_requestRemoteModel;
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

		Class<?> remoteModelClass = _company_requestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_company_requestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			company_requestLocalServiceUtil.addcompany_request(this);
		}
		else {
			company_requestLocalServiceUtil.updatecompany_request(this);
		}
	}

	@Override
	public company_request toEscapedModel() {
		return (company_request)ProxyUtil.newProxyInstance(company_request.class.getClassLoader(),
			new Class[] { company_request.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		company_requestClp clone = new company_requestClp();

		clone.setRequestId(getRequestId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCname(getCname());
		clone.setCtype(getCtype());
		clone.setCrecursable(getCrecursable());
		clone.setCregionId(getCregionId());
		clone.setCcountryId(getCcountryId());
		clone.setCaddress(getCaddress());
		clone.setCphone(getCphone());
		clone.setCwebsite(getCwebsite());
		clone.setCemailAddress(getCemailAddress());
		clone.setCaddress1(getCaddress1());
		clone.setCaddress2(getCaddress2());
		clone.setCarea(getCarea());
		clone.setCcity(getCcity());
		clone.setCdistrict(getCdistrict());
		clone.setCstate(getCstate());
		clone.setCzipcode(getCzipcode());
		clone.setCfax(getCfax());
		clone.setTitle(getTitle());
		clone.setFirstName(getFirstName());
		clone.setLastName(getLastName());
		clone.setDesignation(getDesignation());
		clone.setFax(getFax());
		clone.setMobile(getMobile());
		clone.setEmail(getEmail());
		clone.setStatus(getStatus());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserName(getUserName());
		clone.setExts1(getExts1());
		clone.setExts2(getExts2());
		clone.setExts3(getExts3());
		clone.setExts4(getExts4());
		clone.setExts5(getExts5());
		clone.setExts6(getExts6());
		clone.setExts7(getExts7());
		clone.setExts8(getExts8());
		clone.setExts9(getExts9());
		clone.setExtl10(getExtl10());
		clone.setExtl11(getExtl11());
		clone.setExtl12(getExtl12());
		clone.setExtd13(getExtd13());
		clone.setExtd14(getExtd14());
		clone.setExtd15(getExtd15());

		return clone;
	}

	@Override
	public int compareTo(company_request company_request) {
		int value = 0;

		value = getCname().compareTo(company_request.getCname());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_requestClp)) {
			return false;
		}

		company_requestClp company_request = (company_requestClp)obj;

		long primaryKey = company_request.getPrimaryKey();

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
		StringBundler sb = new StringBundler(95);

		sb.append("{requestId=");
		sb.append(getRequestId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", cname=");
		sb.append(getCname());
		sb.append(", ctype=");
		sb.append(getCtype());
		sb.append(", crecursable=");
		sb.append(getCrecursable());
		sb.append(", cregionId=");
		sb.append(getCregionId());
		sb.append(", ccountryId=");
		sb.append(getCcountryId());
		sb.append(", caddress=");
		sb.append(getCaddress());
		sb.append(", cphone=");
		sb.append(getCphone());
		sb.append(", cwebsite=");
		sb.append(getCwebsite());
		sb.append(", cemailAddress=");
		sb.append(getCemailAddress());
		sb.append(", caddress1=");
		sb.append(getCaddress1());
		sb.append(", caddress2=");
		sb.append(getCaddress2());
		sb.append(", carea=");
		sb.append(getCarea());
		sb.append(", ccity=");
		sb.append(getCcity());
		sb.append(", cdistrict=");
		sb.append(getCdistrict());
		sb.append(", cstate=");
		sb.append(getCstate());
		sb.append(", czipcode=");
		sb.append(getCzipcode());
		sb.append(", cfax=");
		sb.append(getCfax());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", mobile=");
		sb.append(getMobile());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", exts1=");
		sb.append(getExts1());
		sb.append(", exts2=");
		sb.append(getExts2());
		sb.append(", exts3=");
		sb.append(getExts3());
		sb.append(", exts4=");
		sb.append(getExts4());
		sb.append(", exts5=");
		sb.append(getExts5());
		sb.append(", exts6=");
		sb.append(getExts6());
		sb.append(", exts7=");
		sb.append(getExts7());
		sb.append(", exts8=");
		sb.append(getExts8());
		sb.append(", exts9=");
		sb.append(getExts9());
		sb.append(", extl10=");
		sb.append(getExtl10());
		sb.append(", extl11=");
		sb.append(getExtl11());
		sb.append(", extl12=");
		sb.append(getExtl12());
		sb.append(", extd13=");
		sb.append(getExtd13());
		sb.append(", extd14=");
		sb.append(getExtd14());
		sb.append(", extd15=");
		sb.append(getExtd15());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(145);

		sb.append("<model><model-name>");
		sb.append("com.itlifter.employee.service.model.company_request");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requestId</column-name><column-value><![CDATA[");
		sb.append(getRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cname</column-name><column-value><![CDATA[");
		sb.append(getCname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ctype</column-name><column-value><![CDATA[");
		sb.append(getCtype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crecursable</column-name><column-value><![CDATA[");
		sb.append(getCrecursable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cregionId</column-name><column-value><![CDATA[");
		sb.append(getCregionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccountryId</column-name><column-value><![CDATA[");
		sb.append(getCcountryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>caddress</column-name><column-value><![CDATA[");
		sb.append(getCaddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cphone</column-name><column-value><![CDATA[");
		sb.append(getCphone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cwebsite</column-name><column-value><![CDATA[");
		sb.append(getCwebsite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cemailAddress</column-name><column-value><![CDATA[");
		sb.append(getCemailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>caddress1</column-name><column-value><![CDATA[");
		sb.append(getCaddress1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>caddress2</column-name><column-value><![CDATA[");
		sb.append(getCaddress2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carea</column-name><column-value><![CDATA[");
		sb.append(getCarea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccity</column-name><column-value><![CDATA[");
		sb.append(getCcity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cdistrict</column-name><column-value><![CDATA[");
		sb.append(getCdistrict());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cstate</column-name><column-value><![CDATA[");
		sb.append(getCstate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>czipcode</column-name><column-value><![CDATA[");
		sb.append(getCzipcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cfax</column-name><column-value><![CDATA[");
		sb.append(getCfax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobile</column-name><column-value><![CDATA[");
		sb.append(getMobile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts1</column-name><column-value><![CDATA[");
		sb.append(getExts1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts2</column-name><column-value><![CDATA[");
		sb.append(getExts2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts3</column-name><column-value><![CDATA[");
		sb.append(getExts3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts4</column-name><column-value><![CDATA[");
		sb.append(getExts4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts5</column-name><column-value><![CDATA[");
		sb.append(getExts5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts6</column-name><column-value><![CDATA[");
		sb.append(getExts6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts7</column-name><column-value><![CDATA[");
		sb.append(getExts7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts8</column-name><column-value><![CDATA[");
		sb.append(getExts8());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exts9</column-name><column-value><![CDATA[");
		sb.append(getExts9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extl10</column-name><column-value><![CDATA[");
		sb.append(getExtl10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extl11</column-name><column-value><![CDATA[");
		sb.append(getExtl11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extl12</column-name><column-value><![CDATA[");
		sb.append(getExtl12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extd13</column-name><column-value><![CDATA[");
		sb.append(getExtd13());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extd14</column-name><column-value><![CDATA[");
		sb.append(getExtd14());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extd15</column-name><column-value><![CDATA[");
		sb.append(getExtd15());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _requestId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private String _cname;
	private String _ctype;
	private boolean _crecursable;
	private long _cregionId;
	private long _ccountryId;
	private String _caddress;
	private long _cphone;
	private long _cwebsite;
	private String _cemailAddress;
	private String _caddress1;
	private String _caddress2;
	private String _carea;
	private String _ccity;
	private String _cdistrict;
	private String _cstate;
	private long _czipcode;
	private long _cfax;
	private String _title;
	private String _firstName;
	private String _lastName;
	private String _designation;
	private long _fax;
	private long _mobile;
	private String _email;
	private String _status;
	private Date _createDate;
	private Date _modifiedDate;
	private String _userName;
	private String _exts1;
	private String _exts2;
	private String _exts3;
	private String _exts4;
	private String _exts5;
	private String _exts6;
	private String _exts7;
	private String _exts8;
	private String _exts9;
	private long _extl10;
	private long _extl11;
	private long _extl12;
	private Date _extd13;
	private Date _extd14;
	private Date _extd15;
	private BaseModel<?> _company_requestRemoteModel;
}