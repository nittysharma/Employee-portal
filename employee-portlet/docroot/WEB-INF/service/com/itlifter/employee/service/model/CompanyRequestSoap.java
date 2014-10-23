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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Ashish
 * @generated
 */
public class CompanyRequestSoap implements Serializable {
	public static CompanyRequestSoap toSoapModel(CompanyRequest model) {
		CompanyRequestSoap soapModel = new CompanyRequestSoap();

		soapModel.setRequestId(model.getRequestId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCname(model.getCname());
		soapModel.setCtype(model.getCtype());
		soapModel.setCrecursable(model.getCrecursable());
		soapModel.setCregionId(model.getCregionId());
		soapModel.setCcountryId(model.getCcountryId());
		soapModel.setCaddress(model.getCaddress());
		soapModel.setCphone(model.getCphone());
		soapModel.setCwebsite(model.getCwebsite());
		soapModel.setCemailAddress(model.getCemailAddress());
		soapModel.setCaddress1(model.getCaddress1());
		soapModel.setCaddress2(model.getCaddress2());
		soapModel.setCarea(model.getCarea());
		soapModel.setCcity(model.getCcity());
		soapModel.setCdistrict(model.getCdistrict());
		soapModel.setCstate(model.getCstate());
		soapModel.setCzipcode(model.getCzipcode());
		soapModel.setCfax(model.getCfax());
		soapModel.setTitle(model.getTitle());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setFax(model.getFax());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserName(model.getUserName());
		soapModel.setExts1(model.getExts1());
		soapModel.setExts2(model.getExts2());
		soapModel.setExts3(model.getExts3());
		soapModel.setExts4(model.getExts4());
		soapModel.setExts5(model.getExts5());
		soapModel.setExts6(model.getExts6());
		soapModel.setExts7(model.getExts7());
		soapModel.setExts8(model.getExts8());
		soapModel.setExts9(model.getExts9());
		soapModel.setExtl10(model.getExtl10());
		soapModel.setExtl11(model.getExtl11());
		soapModel.setExtl12(model.getExtl12());
		soapModel.setExtd13(model.getExtd13());
		soapModel.setExtd14(model.getExtd14());
		soapModel.setExtd15(model.getExtd15());

		return soapModel;
	}

	public static CompanyRequestSoap[] toSoapModels(CompanyRequest[] models) {
		CompanyRequestSoap[] soapModels = new CompanyRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompanyRequestSoap[][] toSoapModels(CompanyRequest[][] models) {
		CompanyRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompanyRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompanyRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompanyRequestSoap[] toSoapModels(List<CompanyRequest> models) {
		List<CompanyRequestSoap> soapModels = new ArrayList<CompanyRequestSoap>(models.size());

		for (CompanyRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompanyRequestSoap[soapModels.size()]);
	}

	public CompanyRequestSoap() {
	}

	public long getPrimaryKey() {
		return _requestId;
	}

	public void setPrimaryKey(long pk) {
		setRequestId(pk);
	}

	public long getRequestId() {
		return _requestId;
	}

	public void setRequestId(long requestId) {
		_requestId = requestId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getCname() {
		return _cname;
	}

	public void setCname(String cname) {
		_cname = cname;
	}

	public String getCtype() {
		return _ctype;
	}

	public void setCtype(String ctype) {
		_ctype = ctype;
	}

	public boolean getCrecursable() {
		return _crecursable;
	}

	public boolean isCrecursable() {
		return _crecursable;
	}

	public void setCrecursable(boolean crecursable) {
		_crecursable = crecursable;
	}

	public long getCregionId() {
		return _cregionId;
	}

	public void setCregionId(long cregionId) {
		_cregionId = cregionId;
	}

	public long getCcountryId() {
		return _ccountryId;
	}

	public void setCcountryId(long ccountryId) {
		_ccountryId = ccountryId;
	}

	public String getCaddress() {
		return _caddress;
	}

	public void setCaddress(String caddress) {
		_caddress = caddress;
	}

	public long getCphone() {
		return _cphone;
	}

	public void setCphone(long cphone) {
		_cphone = cphone;
	}

	public String getCwebsite() {
		return _cwebsite;
	}

	public void setCwebsite(String cwebsite) {
		_cwebsite = cwebsite;
	}

	public String getCemailAddress() {
		return _cemailAddress;
	}

	public void setCemailAddress(String cemailAddress) {
		_cemailAddress = cemailAddress;
	}

	public String getCaddress1() {
		return _caddress1;
	}

	public void setCaddress1(String caddress1) {
		_caddress1 = caddress1;
	}

	public String getCaddress2() {
		return _caddress2;
	}

	public void setCaddress2(String caddress2) {
		_caddress2 = caddress2;
	}

	public String getCarea() {
		return _carea;
	}

	public void setCarea(String carea) {
		_carea = carea;
	}

	public String getCcity() {
		return _ccity;
	}

	public void setCcity(String ccity) {
		_ccity = ccity;
	}

	public String getCdistrict() {
		return _cdistrict;
	}

	public void setCdistrict(String cdistrict) {
		_cdistrict = cdistrict;
	}

	public String getCstate() {
		return _cstate;
	}

	public void setCstate(String cstate) {
		_cstate = cstate;
	}

	public long getCzipcode() {
		return _czipcode;
	}

	public void setCzipcode(long czipcode) {
		_czipcode = czipcode;
	}

	public long getCfax() {
		return _cfax;
	}

	public void setCfax(long cfax) {
		_cfax = cfax;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public long getFax() {
		return _fax;
	}

	public void setFax(long fax) {
		_fax = fax;
	}

	public long getMobile() {
		return _mobile;
	}

	public void setMobile(long mobile) {
		_mobile = mobile;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getExts1() {
		return _exts1;
	}

	public void setExts1(String exts1) {
		_exts1 = exts1;
	}

	public String getExts2() {
		return _exts2;
	}

	public void setExts2(String exts2) {
		_exts2 = exts2;
	}

	public String getExts3() {
		return _exts3;
	}

	public void setExts3(String exts3) {
		_exts3 = exts3;
	}

	public String getExts4() {
		return _exts4;
	}

	public void setExts4(String exts4) {
		_exts4 = exts4;
	}

	public String getExts5() {
		return _exts5;
	}

	public void setExts5(String exts5) {
		_exts5 = exts5;
	}

	public String getExts6() {
		return _exts6;
	}

	public void setExts6(String exts6) {
		_exts6 = exts6;
	}

	public String getExts7() {
		return _exts7;
	}

	public void setExts7(String exts7) {
		_exts7 = exts7;
	}

	public String getExts8() {
		return _exts8;
	}

	public void setExts8(String exts8) {
		_exts8 = exts8;
	}

	public String getExts9() {
		return _exts9;
	}

	public void setExts9(String exts9) {
		_exts9 = exts9;
	}

	public long getExtl10() {
		return _extl10;
	}

	public void setExtl10(long extl10) {
		_extl10 = extl10;
	}

	public long getExtl11() {
		return _extl11;
	}

	public void setExtl11(long extl11) {
		_extl11 = extl11;
	}

	public long getExtl12() {
		return _extl12;
	}

	public void setExtl12(long extl12) {
		_extl12 = extl12;
	}

	public Date getExtd13() {
		return _extd13;
	}

	public void setExtd13(Date extd13) {
		_extd13 = extd13;
	}

	public Date getExtd14() {
		return _extd14;
	}

	public void setExtd14(Date extd14) {
		_extd14 = extd14;
	}

	public Date getExtd15() {
		return _extd15;
	}

	public void setExtd15(Date extd15) {
		_extd15 = extd15;
	}

	private long _requestId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _cname;
	private String _ctype;
	private boolean _crecursable;
	private long _cregionId;
	private long _ccountryId;
	private String _caddress;
	private long _cphone;
	private String _cwebsite;
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
}