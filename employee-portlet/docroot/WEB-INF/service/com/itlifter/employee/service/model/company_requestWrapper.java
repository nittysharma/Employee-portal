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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link company_request}.
 * </p>
 *
 * @author Ashish
 * @see company_request
 * @generated
 */
public class company_requestWrapper implements company_request,
	ModelWrapper<company_request> {
	public company_requestWrapper(company_request company_request) {
		_company_request = company_request;
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

	/**
	* Returns the primary key of this company_request.
	*
	* @return the primary key of this company_request
	*/
	@Override
	public long getPrimaryKey() {
		return _company_request.getPrimaryKey();
	}

	/**
	* Sets the primary key of this company_request.
	*
	* @param primaryKey the primary key of this company_request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_company_request.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the request ID of this company_request.
	*
	* @return the request ID of this company_request
	*/
	@Override
	public long getRequestId() {
		return _company_request.getRequestId();
	}

	/**
	* Sets the request ID of this company_request.
	*
	* @param requestId the request ID of this company_request
	*/
	@Override
	public void setRequestId(long requestId) {
		_company_request.setRequestId(requestId);
	}

	/**
	* Returns the company ID of this company_request.
	*
	* @return the company ID of this company_request
	*/
	@Override
	public long getCompanyId() {
		return _company_request.getCompanyId();
	}

	/**
	* Sets the company ID of this company_request.
	*
	* @param companyId the company ID of this company_request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_company_request.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this company_request.
	*
	* @return the group ID of this company_request
	*/
	@Override
	public long getGroupId() {
		return _company_request.getGroupId();
	}

	/**
	* Sets the group ID of this company_request.
	*
	* @param groupId the group ID of this company_request
	*/
	@Override
	public void setGroupId(long groupId) {
		_company_request.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this company_request.
	*
	* @return the user ID of this company_request
	*/
	@Override
	public long getUserId() {
		return _company_request.getUserId();
	}

	/**
	* Sets the user ID of this company_request.
	*
	* @param userId the user ID of this company_request
	*/
	@Override
	public void setUserId(long userId) {
		_company_request.setUserId(userId);
	}

	/**
	* Returns the user uuid of this company_request.
	*
	* @return the user uuid of this company_request
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _company_request.getUserUuid();
	}

	/**
	* Sets the user uuid of this company_request.
	*
	* @param userUuid the user uuid of this company_request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_company_request.setUserUuid(userUuid);
	}

	/**
	* Returns the cname of this company_request.
	*
	* @return the cname of this company_request
	*/
	@Override
	public java.lang.String getCname() {
		return _company_request.getCname();
	}

	/**
	* Sets the cname of this company_request.
	*
	* @param cname the cname of this company_request
	*/
	@Override
	public void setCname(java.lang.String cname) {
		_company_request.setCname(cname);
	}

	/**
	* Returns the ctype of this company_request.
	*
	* @return the ctype of this company_request
	*/
	@Override
	public java.lang.String getCtype() {
		return _company_request.getCtype();
	}

	/**
	* Sets the ctype of this company_request.
	*
	* @param ctype the ctype of this company_request
	*/
	@Override
	public void setCtype(java.lang.String ctype) {
		_company_request.setCtype(ctype);
	}

	/**
	* Returns the crecursable of this company_request.
	*
	* @return the crecursable of this company_request
	*/
	@Override
	public boolean getCrecursable() {
		return _company_request.getCrecursable();
	}

	/**
	* Returns <code>true</code> if this company_request is crecursable.
	*
	* @return <code>true</code> if this company_request is crecursable; <code>false</code> otherwise
	*/
	@Override
	public boolean isCrecursable() {
		return _company_request.isCrecursable();
	}

	/**
	* Sets whether this company_request is crecursable.
	*
	* @param crecursable the crecursable of this company_request
	*/
	@Override
	public void setCrecursable(boolean crecursable) {
		_company_request.setCrecursable(crecursable);
	}

	/**
	* Returns the cregion ID of this company_request.
	*
	* @return the cregion ID of this company_request
	*/
	@Override
	public long getCregionId() {
		return _company_request.getCregionId();
	}

	/**
	* Sets the cregion ID of this company_request.
	*
	* @param cregionId the cregion ID of this company_request
	*/
	@Override
	public void setCregionId(long cregionId) {
		_company_request.setCregionId(cregionId);
	}

	/**
	* Returns the ccountry ID of this company_request.
	*
	* @return the ccountry ID of this company_request
	*/
	@Override
	public long getCcountryId() {
		return _company_request.getCcountryId();
	}

	/**
	* Sets the ccountry ID of this company_request.
	*
	* @param ccountryId the ccountry ID of this company_request
	*/
	@Override
	public void setCcountryId(long ccountryId) {
		_company_request.setCcountryId(ccountryId);
	}

	/**
	* Returns the caddress of this company_request.
	*
	* @return the caddress of this company_request
	*/
	@Override
	public java.lang.String getCaddress() {
		return _company_request.getCaddress();
	}

	/**
	* Sets the caddress of this company_request.
	*
	* @param caddress the caddress of this company_request
	*/
	@Override
	public void setCaddress(java.lang.String caddress) {
		_company_request.setCaddress(caddress);
	}

	/**
	* Returns the cphone of this company_request.
	*
	* @return the cphone of this company_request
	*/
	@Override
	public long getCphone() {
		return _company_request.getCphone();
	}

	/**
	* Sets the cphone of this company_request.
	*
	* @param cphone the cphone of this company_request
	*/
	@Override
	public void setCphone(long cphone) {
		_company_request.setCphone(cphone);
	}

	/**
	* Returns the cwebsite of this company_request.
	*
	* @return the cwebsite of this company_request
	*/
	@Override
	public long getCwebsite() {
		return _company_request.getCwebsite();
	}

	/**
	* Sets the cwebsite of this company_request.
	*
	* @param cwebsite the cwebsite of this company_request
	*/
	@Override
	public void setCwebsite(long cwebsite) {
		_company_request.setCwebsite(cwebsite);
	}

	/**
	* Returns the cemail address of this company_request.
	*
	* @return the cemail address of this company_request
	*/
	@Override
	public java.lang.String getCemailAddress() {
		return _company_request.getCemailAddress();
	}

	/**
	* Sets the cemail address of this company_request.
	*
	* @param cemailAddress the cemail address of this company_request
	*/
	@Override
	public void setCemailAddress(java.lang.String cemailAddress) {
		_company_request.setCemailAddress(cemailAddress);
	}

	/**
	* Returns the caddress1 of this company_request.
	*
	* @return the caddress1 of this company_request
	*/
	@Override
	public java.lang.String getCaddress1() {
		return _company_request.getCaddress1();
	}

	/**
	* Sets the caddress1 of this company_request.
	*
	* @param caddress1 the caddress1 of this company_request
	*/
	@Override
	public void setCaddress1(java.lang.String caddress1) {
		_company_request.setCaddress1(caddress1);
	}

	/**
	* Returns the caddress2 of this company_request.
	*
	* @return the caddress2 of this company_request
	*/
	@Override
	public java.lang.String getCaddress2() {
		return _company_request.getCaddress2();
	}

	/**
	* Sets the caddress2 of this company_request.
	*
	* @param caddress2 the caddress2 of this company_request
	*/
	@Override
	public void setCaddress2(java.lang.String caddress2) {
		_company_request.setCaddress2(caddress2);
	}

	/**
	* Returns the carea of this company_request.
	*
	* @return the carea of this company_request
	*/
	@Override
	public java.lang.String getCarea() {
		return _company_request.getCarea();
	}

	/**
	* Sets the carea of this company_request.
	*
	* @param carea the carea of this company_request
	*/
	@Override
	public void setCarea(java.lang.String carea) {
		_company_request.setCarea(carea);
	}

	/**
	* Returns the ccity of this company_request.
	*
	* @return the ccity of this company_request
	*/
	@Override
	public java.lang.String getCcity() {
		return _company_request.getCcity();
	}

	/**
	* Sets the ccity of this company_request.
	*
	* @param ccity the ccity of this company_request
	*/
	@Override
	public void setCcity(java.lang.String ccity) {
		_company_request.setCcity(ccity);
	}

	/**
	* Returns the cdistrict of this company_request.
	*
	* @return the cdistrict of this company_request
	*/
	@Override
	public java.lang.String getCdistrict() {
		return _company_request.getCdistrict();
	}

	/**
	* Sets the cdistrict of this company_request.
	*
	* @param cdistrict the cdistrict of this company_request
	*/
	@Override
	public void setCdistrict(java.lang.String cdistrict) {
		_company_request.setCdistrict(cdistrict);
	}

	/**
	* Returns the cstate of this company_request.
	*
	* @return the cstate of this company_request
	*/
	@Override
	public java.lang.String getCstate() {
		return _company_request.getCstate();
	}

	/**
	* Sets the cstate of this company_request.
	*
	* @param cstate the cstate of this company_request
	*/
	@Override
	public void setCstate(java.lang.String cstate) {
		_company_request.setCstate(cstate);
	}

	/**
	* Returns the czipcode of this company_request.
	*
	* @return the czipcode of this company_request
	*/
	@Override
	public long getCzipcode() {
		return _company_request.getCzipcode();
	}

	/**
	* Sets the czipcode of this company_request.
	*
	* @param czipcode the czipcode of this company_request
	*/
	@Override
	public void setCzipcode(long czipcode) {
		_company_request.setCzipcode(czipcode);
	}

	/**
	* Returns the cfax of this company_request.
	*
	* @return the cfax of this company_request
	*/
	@Override
	public long getCfax() {
		return _company_request.getCfax();
	}

	/**
	* Sets the cfax of this company_request.
	*
	* @param cfax the cfax of this company_request
	*/
	@Override
	public void setCfax(long cfax) {
		_company_request.setCfax(cfax);
	}

	/**
	* Returns the title of this company_request.
	*
	* @return the title of this company_request
	*/
	@Override
	public java.lang.String getTitle() {
		return _company_request.getTitle();
	}

	/**
	* Sets the title of this company_request.
	*
	* @param title the title of this company_request
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_company_request.setTitle(title);
	}

	/**
	* Returns the first name of this company_request.
	*
	* @return the first name of this company_request
	*/
	@Override
	public java.lang.String getFirstName() {
		return _company_request.getFirstName();
	}

	/**
	* Sets the first name of this company_request.
	*
	* @param firstName the first name of this company_request
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_company_request.setFirstName(firstName);
	}

	/**
	* Returns the last name of this company_request.
	*
	* @return the last name of this company_request
	*/
	@Override
	public java.lang.String getLastName() {
		return _company_request.getLastName();
	}

	/**
	* Sets the last name of this company_request.
	*
	* @param lastName the last name of this company_request
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_company_request.setLastName(lastName);
	}

	/**
	* Returns the designation of this company_request.
	*
	* @return the designation of this company_request
	*/
	@Override
	public java.lang.String getDesignation() {
		return _company_request.getDesignation();
	}

	/**
	* Sets the designation of this company_request.
	*
	* @param designation the designation of this company_request
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_company_request.setDesignation(designation);
	}

	/**
	* Returns the fax of this company_request.
	*
	* @return the fax of this company_request
	*/
	@Override
	public long getFax() {
		return _company_request.getFax();
	}

	/**
	* Sets the fax of this company_request.
	*
	* @param fax the fax of this company_request
	*/
	@Override
	public void setFax(long fax) {
		_company_request.setFax(fax);
	}

	/**
	* Returns the mobile of this company_request.
	*
	* @return the mobile of this company_request
	*/
	@Override
	public long getMobile() {
		return _company_request.getMobile();
	}

	/**
	* Sets the mobile of this company_request.
	*
	* @param mobile the mobile of this company_request
	*/
	@Override
	public void setMobile(long mobile) {
		_company_request.setMobile(mobile);
	}

	/**
	* Returns the email of this company_request.
	*
	* @return the email of this company_request
	*/
	@Override
	public java.lang.String getEmail() {
		return _company_request.getEmail();
	}

	/**
	* Sets the email of this company_request.
	*
	* @param email the email of this company_request
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_company_request.setEmail(email);
	}

	/**
	* Returns the status of this company_request.
	*
	* @return the status of this company_request
	*/
	@Override
	public java.lang.String getStatus() {
		return _company_request.getStatus();
	}

	/**
	* Sets the status of this company_request.
	*
	* @param status the status of this company_request
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_company_request.setStatus(status);
	}

	/**
	* Returns the create date of this company_request.
	*
	* @return the create date of this company_request
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _company_request.getCreateDate();
	}

	/**
	* Sets the create date of this company_request.
	*
	* @param createDate the create date of this company_request
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_company_request.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this company_request.
	*
	* @return the modified date of this company_request
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _company_request.getModifiedDate();
	}

	/**
	* Sets the modified date of this company_request.
	*
	* @param modifiedDate the modified date of this company_request
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_company_request.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the user name of this company_request.
	*
	* @return the user name of this company_request
	*/
	@Override
	public java.lang.String getUserName() {
		return _company_request.getUserName();
	}

	/**
	* Sets the user name of this company_request.
	*
	* @param userName the user name of this company_request
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_company_request.setUserName(userName);
	}

	/**
	* Returns the exts1 of this company_request.
	*
	* @return the exts1 of this company_request
	*/
	@Override
	public java.lang.String getExts1() {
		return _company_request.getExts1();
	}

	/**
	* Sets the exts1 of this company_request.
	*
	* @param exts1 the exts1 of this company_request
	*/
	@Override
	public void setExts1(java.lang.String exts1) {
		_company_request.setExts1(exts1);
	}

	/**
	* Returns the exts2 of this company_request.
	*
	* @return the exts2 of this company_request
	*/
	@Override
	public java.lang.String getExts2() {
		return _company_request.getExts2();
	}

	/**
	* Sets the exts2 of this company_request.
	*
	* @param exts2 the exts2 of this company_request
	*/
	@Override
	public void setExts2(java.lang.String exts2) {
		_company_request.setExts2(exts2);
	}

	/**
	* Returns the exts3 of this company_request.
	*
	* @return the exts3 of this company_request
	*/
	@Override
	public java.lang.String getExts3() {
		return _company_request.getExts3();
	}

	/**
	* Sets the exts3 of this company_request.
	*
	* @param exts3 the exts3 of this company_request
	*/
	@Override
	public void setExts3(java.lang.String exts3) {
		_company_request.setExts3(exts3);
	}

	/**
	* Returns the exts4 of this company_request.
	*
	* @return the exts4 of this company_request
	*/
	@Override
	public java.lang.String getExts4() {
		return _company_request.getExts4();
	}

	/**
	* Sets the exts4 of this company_request.
	*
	* @param exts4 the exts4 of this company_request
	*/
	@Override
	public void setExts4(java.lang.String exts4) {
		_company_request.setExts4(exts4);
	}

	/**
	* Returns the exts5 of this company_request.
	*
	* @return the exts5 of this company_request
	*/
	@Override
	public java.lang.String getExts5() {
		return _company_request.getExts5();
	}

	/**
	* Sets the exts5 of this company_request.
	*
	* @param exts5 the exts5 of this company_request
	*/
	@Override
	public void setExts5(java.lang.String exts5) {
		_company_request.setExts5(exts5);
	}

	/**
	* Returns the exts6 of this company_request.
	*
	* @return the exts6 of this company_request
	*/
	@Override
	public java.lang.String getExts6() {
		return _company_request.getExts6();
	}

	/**
	* Sets the exts6 of this company_request.
	*
	* @param exts6 the exts6 of this company_request
	*/
	@Override
	public void setExts6(java.lang.String exts6) {
		_company_request.setExts6(exts6);
	}

	/**
	* Returns the exts7 of this company_request.
	*
	* @return the exts7 of this company_request
	*/
	@Override
	public java.lang.String getExts7() {
		return _company_request.getExts7();
	}

	/**
	* Sets the exts7 of this company_request.
	*
	* @param exts7 the exts7 of this company_request
	*/
	@Override
	public void setExts7(java.lang.String exts7) {
		_company_request.setExts7(exts7);
	}

	/**
	* Returns the exts8 of this company_request.
	*
	* @return the exts8 of this company_request
	*/
	@Override
	public java.lang.String getExts8() {
		return _company_request.getExts8();
	}

	/**
	* Sets the exts8 of this company_request.
	*
	* @param exts8 the exts8 of this company_request
	*/
	@Override
	public void setExts8(java.lang.String exts8) {
		_company_request.setExts8(exts8);
	}

	/**
	* Returns the exts9 of this company_request.
	*
	* @return the exts9 of this company_request
	*/
	@Override
	public java.lang.String getExts9() {
		return _company_request.getExts9();
	}

	/**
	* Sets the exts9 of this company_request.
	*
	* @param exts9 the exts9 of this company_request
	*/
	@Override
	public void setExts9(java.lang.String exts9) {
		_company_request.setExts9(exts9);
	}

	/**
	* Returns the extl10 of this company_request.
	*
	* @return the extl10 of this company_request
	*/
	@Override
	public long getExtl10() {
		return _company_request.getExtl10();
	}

	/**
	* Sets the extl10 of this company_request.
	*
	* @param extl10 the extl10 of this company_request
	*/
	@Override
	public void setExtl10(long extl10) {
		_company_request.setExtl10(extl10);
	}

	/**
	* Returns the extl11 of this company_request.
	*
	* @return the extl11 of this company_request
	*/
	@Override
	public long getExtl11() {
		return _company_request.getExtl11();
	}

	/**
	* Sets the extl11 of this company_request.
	*
	* @param extl11 the extl11 of this company_request
	*/
	@Override
	public void setExtl11(long extl11) {
		_company_request.setExtl11(extl11);
	}

	/**
	* Returns the extl12 of this company_request.
	*
	* @return the extl12 of this company_request
	*/
	@Override
	public long getExtl12() {
		return _company_request.getExtl12();
	}

	/**
	* Sets the extl12 of this company_request.
	*
	* @param extl12 the extl12 of this company_request
	*/
	@Override
	public void setExtl12(long extl12) {
		_company_request.setExtl12(extl12);
	}

	/**
	* Returns the extd13 of this company_request.
	*
	* @return the extd13 of this company_request
	*/
	@Override
	public java.util.Date getExtd13() {
		return _company_request.getExtd13();
	}

	/**
	* Sets the extd13 of this company_request.
	*
	* @param extd13 the extd13 of this company_request
	*/
	@Override
	public void setExtd13(java.util.Date extd13) {
		_company_request.setExtd13(extd13);
	}

	/**
	* Returns the extd14 of this company_request.
	*
	* @return the extd14 of this company_request
	*/
	@Override
	public java.util.Date getExtd14() {
		return _company_request.getExtd14();
	}

	/**
	* Sets the extd14 of this company_request.
	*
	* @param extd14 the extd14 of this company_request
	*/
	@Override
	public void setExtd14(java.util.Date extd14) {
		_company_request.setExtd14(extd14);
	}

	/**
	* Returns the extd15 of this company_request.
	*
	* @return the extd15 of this company_request
	*/
	@Override
	public java.util.Date getExtd15() {
		return _company_request.getExtd15();
	}

	/**
	* Sets the extd15 of this company_request.
	*
	* @param extd15 the extd15 of this company_request
	*/
	@Override
	public void setExtd15(java.util.Date extd15) {
		_company_request.setExtd15(extd15);
	}

	@Override
	public boolean isNew() {
		return _company_request.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_company_request.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _company_request.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_company_request.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _company_request.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _company_request.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_company_request.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _company_request.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_company_request.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_company_request.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_company_request.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new company_requestWrapper((company_request)_company_request.clone());
	}

	@Override
	public int compareTo(company_request company_request) {
		return _company_request.compareTo(company_request);
	}

	@Override
	public int hashCode() {
		return _company_request.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<company_request> toCacheModel() {
		return _company_request.toCacheModel();
	}

	@Override
	public company_request toEscapedModel() {
		return new company_requestWrapper(_company_request.toEscapedModel());
	}

	@Override
	public company_request toUnescapedModel() {
		return new company_requestWrapper(_company_request.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _company_request.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _company_request.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_company_request.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_requestWrapper)) {
			return false;
		}

		company_requestWrapper company_requestWrapper = (company_requestWrapper)obj;

		if (Validator.equals(_company_request,
					company_requestWrapper._company_request)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public company_request getWrappedcompany_request() {
		return _company_request;
	}

	@Override
	public company_request getWrappedModel() {
		return _company_request;
	}

	@Override
	public void resetOriginalValues() {
		_company_request.resetOriginalValues();
	}

	private company_request _company_request;
}