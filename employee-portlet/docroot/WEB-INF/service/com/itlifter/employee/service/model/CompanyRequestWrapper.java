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
 * This class is a wrapper for {@link CompanyRequest}.
 * </p>
 *
 * @author Ashish
 * @see CompanyRequest
 * @generated
 */
public class CompanyRequestWrapper implements CompanyRequest,
	ModelWrapper<CompanyRequest> {
	public CompanyRequestWrapper(CompanyRequest companyRequest) {
		_companyRequest = companyRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return CompanyRequest.class;
	}

	@Override
	public String getModelClassName() {
		return CompanyRequest.class.getName();
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

		String cwebsite = (String)attributes.get("cwebsite");

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
	* Returns the primary key of this company request.
	*
	* @return the primary key of this company request
	*/
	@Override
	public long getPrimaryKey() {
		return _companyRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this company request.
	*
	* @param primaryKey the primary key of this company request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_companyRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the request ID of this company request.
	*
	* @return the request ID of this company request
	*/
	@Override
	public long getRequestId() {
		return _companyRequest.getRequestId();
	}

	/**
	* Sets the request ID of this company request.
	*
	* @param requestId the request ID of this company request
	*/
	@Override
	public void setRequestId(long requestId) {
		_companyRequest.setRequestId(requestId);
	}

	/**
	* Returns the company ID of this company request.
	*
	* @return the company ID of this company request
	*/
	@Override
	public long getCompanyId() {
		return _companyRequest.getCompanyId();
	}

	/**
	* Sets the company ID of this company request.
	*
	* @param companyId the company ID of this company request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_companyRequest.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this company request.
	*
	* @return the group ID of this company request
	*/
	@Override
	public long getGroupId() {
		return _companyRequest.getGroupId();
	}

	/**
	* Sets the group ID of this company request.
	*
	* @param groupId the group ID of this company request
	*/
	@Override
	public void setGroupId(long groupId) {
		_companyRequest.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this company request.
	*
	* @return the user ID of this company request
	*/
	@Override
	public long getUserId() {
		return _companyRequest.getUserId();
	}

	/**
	* Sets the user ID of this company request.
	*
	* @param userId the user ID of this company request
	*/
	@Override
	public void setUserId(long userId) {
		_companyRequest.setUserId(userId);
	}

	/**
	* Returns the user uuid of this company request.
	*
	* @return the user uuid of this company request
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyRequest.getUserUuid();
	}

	/**
	* Sets the user uuid of this company request.
	*
	* @param userUuid the user uuid of this company request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_companyRequest.setUserUuid(userUuid);
	}

	/**
	* Returns the cname of this company request.
	*
	* @return the cname of this company request
	*/
	@Override
	public java.lang.String getCname() {
		return _companyRequest.getCname();
	}

	/**
	* Sets the cname of this company request.
	*
	* @param cname the cname of this company request
	*/
	@Override
	public void setCname(java.lang.String cname) {
		_companyRequest.setCname(cname);
	}

	/**
	* Returns the ctype of this company request.
	*
	* @return the ctype of this company request
	*/
	@Override
	public java.lang.String getCtype() {
		return _companyRequest.getCtype();
	}

	/**
	* Sets the ctype of this company request.
	*
	* @param ctype the ctype of this company request
	*/
	@Override
	public void setCtype(java.lang.String ctype) {
		_companyRequest.setCtype(ctype);
	}

	/**
	* Returns the crecursable of this company request.
	*
	* @return the crecursable of this company request
	*/
	@Override
	public boolean getCrecursable() {
		return _companyRequest.getCrecursable();
	}

	/**
	* Returns <code>true</code> if this company request is crecursable.
	*
	* @return <code>true</code> if this company request is crecursable; <code>false</code> otherwise
	*/
	@Override
	public boolean isCrecursable() {
		return _companyRequest.isCrecursable();
	}

	/**
	* Sets whether this company request is crecursable.
	*
	* @param crecursable the crecursable of this company request
	*/
	@Override
	public void setCrecursable(boolean crecursable) {
		_companyRequest.setCrecursable(crecursable);
	}

	/**
	* Returns the cregion ID of this company request.
	*
	* @return the cregion ID of this company request
	*/
	@Override
	public long getCregionId() {
		return _companyRequest.getCregionId();
	}

	/**
	* Sets the cregion ID of this company request.
	*
	* @param cregionId the cregion ID of this company request
	*/
	@Override
	public void setCregionId(long cregionId) {
		_companyRequest.setCregionId(cregionId);
	}

	/**
	* Returns the ccountry ID of this company request.
	*
	* @return the ccountry ID of this company request
	*/
	@Override
	public long getCcountryId() {
		return _companyRequest.getCcountryId();
	}

	/**
	* Sets the ccountry ID of this company request.
	*
	* @param ccountryId the ccountry ID of this company request
	*/
	@Override
	public void setCcountryId(long ccountryId) {
		_companyRequest.setCcountryId(ccountryId);
	}

	/**
	* Returns the caddress of this company request.
	*
	* @return the caddress of this company request
	*/
	@Override
	public java.lang.String getCaddress() {
		return _companyRequest.getCaddress();
	}

	/**
	* Sets the caddress of this company request.
	*
	* @param caddress the caddress of this company request
	*/
	@Override
	public void setCaddress(java.lang.String caddress) {
		_companyRequest.setCaddress(caddress);
	}

	/**
	* Returns the cphone of this company request.
	*
	* @return the cphone of this company request
	*/
	@Override
	public long getCphone() {
		return _companyRequest.getCphone();
	}

	/**
	* Sets the cphone of this company request.
	*
	* @param cphone the cphone of this company request
	*/
	@Override
	public void setCphone(long cphone) {
		_companyRequest.setCphone(cphone);
	}

	/**
	* Returns the cwebsite of this company request.
	*
	* @return the cwebsite of this company request
	*/
	@Override
	public java.lang.String getCwebsite() {
		return _companyRequest.getCwebsite();
	}

	/**
	* Sets the cwebsite of this company request.
	*
	* @param cwebsite the cwebsite of this company request
	*/
	@Override
	public void setCwebsite(java.lang.String cwebsite) {
		_companyRequest.setCwebsite(cwebsite);
	}

	/**
	* Returns the cemail address of this company request.
	*
	* @return the cemail address of this company request
	*/
	@Override
	public java.lang.String getCemailAddress() {
		return _companyRequest.getCemailAddress();
	}

	/**
	* Sets the cemail address of this company request.
	*
	* @param cemailAddress the cemail address of this company request
	*/
	@Override
	public void setCemailAddress(java.lang.String cemailAddress) {
		_companyRequest.setCemailAddress(cemailAddress);
	}

	/**
	* Returns the caddress1 of this company request.
	*
	* @return the caddress1 of this company request
	*/
	@Override
	public java.lang.String getCaddress1() {
		return _companyRequest.getCaddress1();
	}

	/**
	* Sets the caddress1 of this company request.
	*
	* @param caddress1 the caddress1 of this company request
	*/
	@Override
	public void setCaddress1(java.lang.String caddress1) {
		_companyRequest.setCaddress1(caddress1);
	}

	/**
	* Returns the caddress2 of this company request.
	*
	* @return the caddress2 of this company request
	*/
	@Override
	public java.lang.String getCaddress2() {
		return _companyRequest.getCaddress2();
	}

	/**
	* Sets the caddress2 of this company request.
	*
	* @param caddress2 the caddress2 of this company request
	*/
	@Override
	public void setCaddress2(java.lang.String caddress2) {
		_companyRequest.setCaddress2(caddress2);
	}

	/**
	* Returns the carea of this company request.
	*
	* @return the carea of this company request
	*/
	@Override
	public java.lang.String getCarea() {
		return _companyRequest.getCarea();
	}

	/**
	* Sets the carea of this company request.
	*
	* @param carea the carea of this company request
	*/
	@Override
	public void setCarea(java.lang.String carea) {
		_companyRequest.setCarea(carea);
	}

	/**
	* Returns the ccity of this company request.
	*
	* @return the ccity of this company request
	*/
	@Override
	public java.lang.String getCcity() {
		return _companyRequest.getCcity();
	}

	/**
	* Sets the ccity of this company request.
	*
	* @param ccity the ccity of this company request
	*/
	@Override
	public void setCcity(java.lang.String ccity) {
		_companyRequest.setCcity(ccity);
	}

	/**
	* Returns the cdistrict of this company request.
	*
	* @return the cdistrict of this company request
	*/
	@Override
	public java.lang.String getCdistrict() {
		return _companyRequest.getCdistrict();
	}

	/**
	* Sets the cdistrict of this company request.
	*
	* @param cdistrict the cdistrict of this company request
	*/
	@Override
	public void setCdistrict(java.lang.String cdistrict) {
		_companyRequest.setCdistrict(cdistrict);
	}

	/**
	* Returns the cstate of this company request.
	*
	* @return the cstate of this company request
	*/
	@Override
	public java.lang.String getCstate() {
		return _companyRequest.getCstate();
	}

	/**
	* Sets the cstate of this company request.
	*
	* @param cstate the cstate of this company request
	*/
	@Override
	public void setCstate(java.lang.String cstate) {
		_companyRequest.setCstate(cstate);
	}

	/**
	* Returns the czipcode of this company request.
	*
	* @return the czipcode of this company request
	*/
	@Override
	public long getCzipcode() {
		return _companyRequest.getCzipcode();
	}

	/**
	* Sets the czipcode of this company request.
	*
	* @param czipcode the czipcode of this company request
	*/
	@Override
	public void setCzipcode(long czipcode) {
		_companyRequest.setCzipcode(czipcode);
	}

	/**
	* Returns the cfax of this company request.
	*
	* @return the cfax of this company request
	*/
	@Override
	public long getCfax() {
		return _companyRequest.getCfax();
	}

	/**
	* Sets the cfax of this company request.
	*
	* @param cfax the cfax of this company request
	*/
	@Override
	public void setCfax(long cfax) {
		_companyRequest.setCfax(cfax);
	}

	/**
	* Returns the title of this company request.
	*
	* @return the title of this company request
	*/
	@Override
	public java.lang.String getTitle() {
		return _companyRequest.getTitle();
	}

	/**
	* Sets the title of this company request.
	*
	* @param title the title of this company request
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_companyRequest.setTitle(title);
	}

	/**
	* Returns the first name of this company request.
	*
	* @return the first name of this company request
	*/
	@Override
	public java.lang.String getFirstName() {
		return _companyRequest.getFirstName();
	}

	/**
	* Sets the first name of this company request.
	*
	* @param firstName the first name of this company request
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_companyRequest.setFirstName(firstName);
	}

	/**
	* Returns the last name of this company request.
	*
	* @return the last name of this company request
	*/
	@Override
	public java.lang.String getLastName() {
		return _companyRequest.getLastName();
	}

	/**
	* Sets the last name of this company request.
	*
	* @param lastName the last name of this company request
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_companyRequest.setLastName(lastName);
	}

	/**
	* Returns the designation of this company request.
	*
	* @return the designation of this company request
	*/
	@Override
	public java.lang.String getDesignation() {
		return _companyRequest.getDesignation();
	}

	/**
	* Sets the designation of this company request.
	*
	* @param designation the designation of this company request
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_companyRequest.setDesignation(designation);
	}

	/**
	* Returns the fax of this company request.
	*
	* @return the fax of this company request
	*/
	@Override
	public long getFax() {
		return _companyRequest.getFax();
	}

	/**
	* Sets the fax of this company request.
	*
	* @param fax the fax of this company request
	*/
	@Override
	public void setFax(long fax) {
		_companyRequest.setFax(fax);
	}

	/**
	* Returns the mobile of this company request.
	*
	* @return the mobile of this company request
	*/
	@Override
	public long getMobile() {
		return _companyRequest.getMobile();
	}

	/**
	* Sets the mobile of this company request.
	*
	* @param mobile the mobile of this company request
	*/
	@Override
	public void setMobile(long mobile) {
		_companyRequest.setMobile(mobile);
	}

	/**
	* Returns the email of this company request.
	*
	* @return the email of this company request
	*/
	@Override
	public java.lang.String getEmail() {
		return _companyRequest.getEmail();
	}

	/**
	* Sets the email of this company request.
	*
	* @param email the email of this company request
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_companyRequest.setEmail(email);
	}

	/**
	* Returns the status of this company request.
	*
	* @return the status of this company request
	*/
	@Override
	public java.lang.String getStatus() {
		return _companyRequest.getStatus();
	}

	/**
	* Sets the status of this company request.
	*
	* @param status the status of this company request
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_companyRequest.setStatus(status);
	}

	/**
	* Returns the create date of this company request.
	*
	* @return the create date of this company request
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _companyRequest.getCreateDate();
	}

	/**
	* Sets the create date of this company request.
	*
	* @param createDate the create date of this company request
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_companyRequest.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this company request.
	*
	* @return the modified date of this company request
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _companyRequest.getModifiedDate();
	}

	/**
	* Sets the modified date of this company request.
	*
	* @param modifiedDate the modified date of this company request
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_companyRequest.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the user name of this company request.
	*
	* @return the user name of this company request
	*/
	@Override
	public java.lang.String getUserName() {
		return _companyRequest.getUserName();
	}

	/**
	* Sets the user name of this company request.
	*
	* @param userName the user name of this company request
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_companyRequest.setUserName(userName);
	}

	/**
	* Returns the exts1 of this company request.
	*
	* @return the exts1 of this company request
	*/
	@Override
	public java.lang.String getExts1() {
		return _companyRequest.getExts1();
	}

	/**
	* Sets the exts1 of this company request.
	*
	* @param exts1 the exts1 of this company request
	*/
	@Override
	public void setExts1(java.lang.String exts1) {
		_companyRequest.setExts1(exts1);
	}

	/**
	* Returns the exts2 of this company request.
	*
	* @return the exts2 of this company request
	*/
	@Override
	public java.lang.String getExts2() {
		return _companyRequest.getExts2();
	}

	/**
	* Sets the exts2 of this company request.
	*
	* @param exts2 the exts2 of this company request
	*/
	@Override
	public void setExts2(java.lang.String exts2) {
		_companyRequest.setExts2(exts2);
	}

	/**
	* Returns the exts3 of this company request.
	*
	* @return the exts3 of this company request
	*/
	@Override
	public java.lang.String getExts3() {
		return _companyRequest.getExts3();
	}

	/**
	* Sets the exts3 of this company request.
	*
	* @param exts3 the exts3 of this company request
	*/
	@Override
	public void setExts3(java.lang.String exts3) {
		_companyRequest.setExts3(exts3);
	}

	/**
	* Returns the exts4 of this company request.
	*
	* @return the exts4 of this company request
	*/
	@Override
	public java.lang.String getExts4() {
		return _companyRequest.getExts4();
	}

	/**
	* Sets the exts4 of this company request.
	*
	* @param exts4 the exts4 of this company request
	*/
	@Override
	public void setExts4(java.lang.String exts4) {
		_companyRequest.setExts4(exts4);
	}

	/**
	* Returns the exts5 of this company request.
	*
	* @return the exts5 of this company request
	*/
	@Override
	public java.lang.String getExts5() {
		return _companyRequest.getExts5();
	}

	/**
	* Sets the exts5 of this company request.
	*
	* @param exts5 the exts5 of this company request
	*/
	@Override
	public void setExts5(java.lang.String exts5) {
		_companyRequest.setExts5(exts5);
	}

	/**
	* Returns the exts6 of this company request.
	*
	* @return the exts6 of this company request
	*/
	@Override
	public java.lang.String getExts6() {
		return _companyRequest.getExts6();
	}

	/**
	* Sets the exts6 of this company request.
	*
	* @param exts6 the exts6 of this company request
	*/
	@Override
	public void setExts6(java.lang.String exts6) {
		_companyRequest.setExts6(exts6);
	}

	/**
	* Returns the exts7 of this company request.
	*
	* @return the exts7 of this company request
	*/
	@Override
	public java.lang.String getExts7() {
		return _companyRequest.getExts7();
	}

	/**
	* Sets the exts7 of this company request.
	*
	* @param exts7 the exts7 of this company request
	*/
	@Override
	public void setExts7(java.lang.String exts7) {
		_companyRequest.setExts7(exts7);
	}

	/**
	* Returns the exts8 of this company request.
	*
	* @return the exts8 of this company request
	*/
	@Override
	public java.lang.String getExts8() {
		return _companyRequest.getExts8();
	}

	/**
	* Sets the exts8 of this company request.
	*
	* @param exts8 the exts8 of this company request
	*/
	@Override
	public void setExts8(java.lang.String exts8) {
		_companyRequest.setExts8(exts8);
	}

	/**
	* Returns the exts9 of this company request.
	*
	* @return the exts9 of this company request
	*/
	@Override
	public java.lang.String getExts9() {
		return _companyRequest.getExts9();
	}

	/**
	* Sets the exts9 of this company request.
	*
	* @param exts9 the exts9 of this company request
	*/
	@Override
	public void setExts9(java.lang.String exts9) {
		_companyRequest.setExts9(exts9);
	}

	/**
	* Returns the extl10 of this company request.
	*
	* @return the extl10 of this company request
	*/
	@Override
	public long getExtl10() {
		return _companyRequest.getExtl10();
	}

	/**
	* Sets the extl10 of this company request.
	*
	* @param extl10 the extl10 of this company request
	*/
	@Override
	public void setExtl10(long extl10) {
		_companyRequest.setExtl10(extl10);
	}

	/**
	* Returns the extl11 of this company request.
	*
	* @return the extl11 of this company request
	*/
	@Override
	public long getExtl11() {
		return _companyRequest.getExtl11();
	}

	/**
	* Sets the extl11 of this company request.
	*
	* @param extl11 the extl11 of this company request
	*/
	@Override
	public void setExtl11(long extl11) {
		_companyRequest.setExtl11(extl11);
	}

	/**
	* Returns the extl12 of this company request.
	*
	* @return the extl12 of this company request
	*/
	@Override
	public long getExtl12() {
		return _companyRequest.getExtl12();
	}

	/**
	* Sets the extl12 of this company request.
	*
	* @param extl12 the extl12 of this company request
	*/
	@Override
	public void setExtl12(long extl12) {
		_companyRequest.setExtl12(extl12);
	}

	/**
	* Returns the extd13 of this company request.
	*
	* @return the extd13 of this company request
	*/
	@Override
	public java.util.Date getExtd13() {
		return _companyRequest.getExtd13();
	}

	/**
	* Sets the extd13 of this company request.
	*
	* @param extd13 the extd13 of this company request
	*/
	@Override
	public void setExtd13(java.util.Date extd13) {
		_companyRequest.setExtd13(extd13);
	}

	/**
	* Returns the extd14 of this company request.
	*
	* @return the extd14 of this company request
	*/
	@Override
	public java.util.Date getExtd14() {
		return _companyRequest.getExtd14();
	}

	/**
	* Sets the extd14 of this company request.
	*
	* @param extd14 the extd14 of this company request
	*/
	@Override
	public void setExtd14(java.util.Date extd14) {
		_companyRequest.setExtd14(extd14);
	}

	/**
	* Returns the extd15 of this company request.
	*
	* @return the extd15 of this company request
	*/
	@Override
	public java.util.Date getExtd15() {
		return _companyRequest.getExtd15();
	}

	/**
	* Sets the extd15 of this company request.
	*
	* @param extd15 the extd15 of this company request
	*/
	@Override
	public void setExtd15(java.util.Date extd15) {
		_companyRequest.setExtd15(extd15);
	}

	@Override
	public boolean isNew() {
		return _companyRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_companyRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _companyRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_companyRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _companyRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _companyRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_companyRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _companyRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_companyRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_companyRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_companyRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CompanyRequestWrapper((CompanyRequest)_companyRequest.clone());
	}

	@Override
	public int compareTo(
		com.itlifter.employee.service.model.CompanyRequest companyRequest) {
		return _companyRequest.compareTo(companyRequest);
	}

	@Override
	public int hashCode() {
		return _companyRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.itlifter.employee.service.model.CompanyRequest> toCacheModel() {
		return _companyRequest.toCacheModel();
	}

	@Override
	public com.itlifter.employee.service.model.CompanyRequest toEscapedModel() {
		return new CompanyRequestWrapper(_companyRequest.toEscapedModel());
	}

	@Override
	public com.itlifter.employee.service.model.CompanyRequest toUnescapedModel() {
		return new CompanyRequestWrapper(_companyRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _companyRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _companyRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_companyRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompanyRequestWrapper)) {
			return false;
		}

		CompanyRequestWrapper companyRequestWrapper = (CompanyRequestWrapper)obj;

		if (Validator.equals(_companyRequest,
					companyRequestWrapper._companyRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CompanyRequest getWrappedCompanyRequest() {
		return _companyRequest;
	}

	@Override
	public CompanyRequest getWrappedModel() {
		return _companyRequest;
	}

	@Override
	public void resetOriginalValues() {
		_companyRequest.resetOriginalValues();
	}

	private CompanyRequest _companyRequest;
}