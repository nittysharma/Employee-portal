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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CompanyRequest service. Represents a row in the &quot;employee_CompanyRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.itlifter.employee.service.model.impl.CompanyRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.itlifter.employee.service.model.impl.CompanyRequestImpl}.
 * </p>
 *
 * @author Ashish
 * @see CompanyRequest
 * @see com.itlifter.employee.service.model.impl.CompanyRequestImpl
 * @see com.itlifter.employee.service.model.impl.CompanyRequestModelImpl
 * @generated
 */
public interface CompanyRequestModel extends BaseModel<CompanyRequest>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a company request model instance should use the {@link CompanyRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this company request.
	 *
	 * @return the primary key of this company request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this company request.
	 *
	 * @param primaryKey the primary key of this company request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the request ID of this company request.
	 *
	 * @return the request ID of this company request
	 */
	public long getRequestId();

	/**
	 * Sets the request ID of this company request.
	 *
	 * @param requestId the request ID of this company request
	 */
	public void setRequestId(long requestId);

	/**
	 * Returns the company ID of this company request.
	 *
	 * @return the company ID of this company request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this company request.
	 *
	 * @param companyId the company ID of this company request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this company request.
	 *
	 * @return the group ID of this company request
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this company request.
	 *
	 * @param groupId the group ID of this company request
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this company request.
	 *
	 * @return the user ID of this company request
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this company request.
	 *
	 * @param userId the user ID of this company request
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this company request.
	 *
	 * @return the user uuid of this company request
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this company request.
	 *
	 * @param userUuid the user uuid of this company request
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the cname of this company request.
	 *
	 * @return the cname of this company request
	 */
	@AutoEscape
	public String getCname();

	/**
	 * Sets the cname of this company request.
	 *
	 * @param cname the cname of this company request
	 */
	public void setCname(String cname);

	/**
	 * Returns the ctype of this company request.
	 *
	 * @return the ctype of this company request
	 */
	@AutoEscape
	public String getCtype();

	/**
	 * Sets the ctype of this company request.
	 *
	 * @param ctype the ctype of this company request
	 */
	public void setCtype(String ctype);

	/**
	 * Returns the crecursable of this company request.
	 *
	 * @return the crecursable of this company request
	 */
	public boolean getCrecursable();

	/**
	 * Returns <code>true</code> if this company request is crecursable.
	 *
	 * @return <code>true</code> if this company request is crecursable; <code>false</code> otherwise
	 */
	public boolean isCrecursable();

	/**
	 * Sets whether this company request is crecursable.
	 *
	 * @param crecursable the crecursable of this company request
	 */
	public void setCrecursable(boolean crecursable);

	/**
	 * Returns the cregion ID of this company request.
	 *
	 * @return the cregion ID of this company request
	 */
	public long getCregionId();

	/**
	 * Sets the cregion ID of this company request.
	 *
	 * @param cregionId the cregion ID of this company request
	 */
	public void setCregionId(long cregionId);

	/**
	 * Returns the ccountry ID of this company request.
	 *
	 * @return the ccountry ID of this company request
	 */
	public long getCcountryId();

	/**
	 * Sets the ccountry ID of this company request.
	 *
	 * @param ccountryId the ccountry ID of this company request
	 */
	public void setCcountryId(long ccountryId);

	/**
	 * Returns the caddress of this company request.
	 *
	 * @return the caddress of this company request
	 */
	@AutoEscape
	public String getCaddress();

	/**
	 * Sets the caddress of this company request.
	 *
	 * @param caddress the caddress of this company request
	 */
	public void setCaddress(String caddress);

	/**
	 * Returns the cphone of this company request.
	 *
	 * @return the cphone of this company request
	 */
	public long getCphone();

	/**
	 * Sets the cphone of this company request.
	 *
	 * @param cphone the cphone of this company request
	 */
	public void setCphone(long cphone);

	/**
	 * Returns the cwebsite of this company request.
	 *
	 * @return the cwebsite of this company request
	 */
	@AutoEscape
	public String getCwebsite();

	/**
	 * Sets the cwebsite of this company request.
	 *
	 * @param cwebsite the cwebsite of this company request
	 */
	public void setCwebsite(String cwebsite);

	/**
	 * Returns the cemail address of this company request.
	 *
	 * @return the cemail address of this company request
	 */
	@AutoEscape
	public String getCemailAddress();

	/**
	 * Sets the cemail address of this company request.
	 *
	 * @param cemailAddress the cemail address of this company request
	 */
	public void setCemailAddress(String cemailAddress);

	/**
	 * Returns the caddress1 of this company request.
	 *
	 * @return the caddress1 of this company request
	 */
	@AutoEscape
	public String getCaddress1();

	/**
	 * Sets the caddress1 of this company request.
	 *
	 * @param caddress1 the caddress1 of this company request
	 */
	public void setCaddress1(String caddress1);

	/**
	 * Returns the caddress2 of this company request.
	 *
	 * @return the caddress2 of this company request
	 */
	@AutoEscape
	public String getCaddress2();

	/**
	 * Sets the caddress2 of this company request.
	 *
	 * @param caddress2 the caddress2 of this company request
	 */
	public void setCaddress2(String caddress2);

	/**
	 * Returns the carea of this company request.
	 *
	 * @return the carea of this company request
	 */
	@AutoEscape
	public String getCarea();

	/**
	 * Sets the carea of this company request.
	 *
	 * @param carea the carea of this company request
	 */
	public void setCarea(String carea);

	/**
	 * Returns the ccity of this company request.
	 *
	 * @return the ccity of this company request
	 */
	@AutoEscape
	public String getCcity();

	/**
	 * Sets the ccity of this company request.
	 *
	 * @param ccity the ccity of this company request
	 */
	public void setCcity(String ccity);

	/**
	 * Returns the cdistrict of this company request.
	 *
	 * @return the cdistrict of this company request
	 */
	@AutoEscape
	public String getCdistrict();

	/**
	 * Sets the cdistrict of this company request.
	 *
	 * @param cdistrict the cdistrict of this company request
	 */
	public void setCdistrict(String cdistrict);

	/**
	 * Returns the cstate of this company request.
	 *
	 * @return the cstate of this company request
	 */
	@AutoEscape
	public String getCstate();

	/**
	 * Sets the cstate of this company request.
	 *
	 * @param cstate the cstate of this company request
	 */
	public void setCstate(String cstate);

	/**
	 * Returns the czipcode of this company request.
	 *
	 * @return the czipcode of this company request
	 */
	public long getCzipcode();

	/**
	 * Sets the czipcode of this company request.
	 *
	 * @param czipcode the czipcode of this company request
	 */
	public void setCzipcode(long czipcode);

	/**
	 * Returns the cfax of this company request.
	 *
	 * @return the cfax of this company request
	 */
	public long getCfax();

	/**
	 * Sets the cfax of this company request.
	 *
	 * @param cfax the cfax of this company request
	 */
	public void setCfax(long cfax);

	/**
	 * Returns the title of this company request.
	 *
	 * @return the title of this company request
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this company request.
	 *
	 * @param title the title of this company request
	 */
	public void setTitle(String title);

	/**
	 * Returns the first name of this company request.
	 *
	 * @return the first name of this company request
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this company request.
	 *
	 * @param firstName the first name of this company request
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this company request.
	 *
	 * @return the last name of this company request
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this company request.
	 *
	 * @param lastName the last name of this company request
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the designation of this company request.
	 *
	 * @return the designation of this company request
	 */
	@AutoEscape
	public String getDesignation();

	/**
	 * Sets the designation of this company request.
	 *
	 * @param designation the designation of this company request
	 */
	public void setDesignation(String designation);

	/**
	 * Returns the fax of this company request.
	 *
	 * @return the fax of this company request
	 */
	public long getFax();

	/**
	 * Sets the fax of this company request.
	 *
	 * @param fax the fax of this company request
	 */
	public void setFax(long fax);

	/**
	 * Returns the mobile of this company request.
	 *
	 * @return the mobile of this company request
	 */
	public long getMobile();

	/**
	 * Sets the mobile of this company request.
	 *
	 * @param mobile the mobile of this company request
	 */
	public void setMobile(long mobile);

	/**
	 * Returns the email of this company request.
	 *
	 * @return the email of this company request
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this company request.
	 *
	 * @param email the email of this company request
	 */
	public void setEmail(String email);

	/**
	 * Returns the status of this company request.
	 *
	 * @return the status of this company request
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this company request.
	 *
	 * @param status the status of this company request
	 */
	public void setStatus(String status);

	/**
	 * Returns the create date of this company request.
	 *
	 * @return the create date of this company request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this company request.
	 *
	 * @param createDate the create date of this company request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this company request.
	 *
	 * @return the modified date of this company request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this company request.
	 *
	 * @param modifiedDate the modified date of this company request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user name of this company request.
	 *
	 * @return the user name of this company request
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this company request.
	 *
	 * @param userName the user name of this company request
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the exts1 of this company request.
	 *
	 * @return the exts1 of this company request
	 */
	@AutoEscape
	public String getExts1();

	/**
	 * Sets the exts1 of this company request.
	 *
	 * @param exts1 the exts1 of this company request
	 */
	public void setExts1(String exts1);

	/**
	 * Returns the exts2 of this company request.
	 *
	 * @return the exts2 of this company request
	 */
	@AutoEscape
	public String getExts2();

	/**
	 * Sets the exts2 of this company request.
	 *
	 * @param exts2 the exts2 of this company request
	 */
	public void setExts2(String exts2);

	/**
	 * Returns the exts3 of this company request.
	 *
	 * @return the exts3 of this company request
	 */
	@AutoEscape
	public String getExts3();

	/**
	 * Sets the exts3 of this company request.
	 *
	 * @param exts3 the exts3 of this company request
	 */
	public void setExts3(String exts3);

	/**
	 * Returns the exts4 of this company request.
	 *
	 * @return the exts4 of this company request
	 */
	@AutoEscape
	public String getExts4();

	/**
	 * Sets the exts4 of this company request.
	 *
	 * @param exts4 the exts4 of this company request
	 */
	public void setExts4(String exts4);

	/**
	 * Returns the exts5 of this company request.
	 *
	 * @return the exts5 of this company request
	 */
	@AutoEscape
	public String getExts5();

	/**
	 * Sets the exts5 of this company request.
	 *
	 * @param exts5 the exts5 of this company request
	 */
	public void setExts5(String exts5);

	/**
	 * Returns the exts6 of this company request.
	 *
	 * @return the exts6 of this company request
	 */
	@AutoEscape
	public String getExts6();

	/**
	 * Sets the exts6 of this company request.
	 *
	 * @param exts6 the exts6 of this company request
	 */
	public void setExts6(String exts6);

	/**
	 * Returns the exts7 of this company request.
	 *
	 * @return the exts7 of this company request
	 */
	@AutoEscape
	public String getExts7();

	/**
	 * Sets the exts7 of this company request.
	 *
	 * @param exts7 the exts7 of this company request
	 */
	public void setExts7(String exts7);

	/**
	 * Returns the exts8 of this company request.
	 *
	 * @return the exts8 of this company request
	 */
	@AutoEscape
	public String getExts8();

	/**
	 * Sets the exts8 of this company request.
	 *
	 * @param exts8 the exts8 of this company request
	 */
	public void setExts8(String exts8);

	/**
	 * Returns the exts9 of this company request.
	 *
	 * @return the exts9 of this company request
	 */
	@AutoEscape
	public String getExts9();

	/**
	 * Sets the exts9 of this company request.
	 *
	 * @param exts9 the exts9 of this company request
	 */
	public void setExts9(String exts9);

	/**
	 * Returns the extl10 of this company request.
	 *
	 * @return the extl10 of this company request
	 */
	public long getExtl10();

	/**
	 * Sets the extl10 of this company request.
	 *
	 * @param extl10 the extl10 of this company request
	 */
	public void setExtl10(long extl10);

	/**
	 * Returns the extl11 of this company request.
	 *
	 * @return the extl11 of this company request
	 */
	public long getExtl11();

	/**
	 * Sets the extl11 of this company request.
	 *
	 * @param extl11 the extl11 of this company request
	 */
	public void setExtl11(long extl11);

	/**
	 * Returns the extl12 of this company request.
	 *
	 * @return the extl12 of this company request
	 */
	public long getExtl12();

	/**
	 * Sets the extl12 of this company request.
	 *
	 * @param extl12 the extl12 of this company request
	 */
	public void setExtl12(long extl12);

	/**
	 * Returns the extd13 of this company request.
	 *
	 * @return the extd13 of this company request
	 */
	public Date getExtd13();

	/**
	 * Sets the extd13 of this company request.
	 *
	 * @param extd13 the extd13 of this company request
	 */
	public void setExtd13(Date extd13);

	/**
	 * Returns the extd14 of this company request.
	 *
	 * @return the extd14 of this company request
	 */
	public Date getExtd14();

	/**
	 * Sets the extd14 of this company request.
	 *
	 * @param extd14 the extd14 of this company request
	 */
	public void setExtd14(Date extd14);

	/**
	 * Returns the extd15 of this company request.
	 *
	 * @return the extd15 of this company request
	 */
	public Date getExtd15();

	/**
	 * Sets the extd15 of this company request.
	 *
	 * @param extd15 the extd15 of this company request
	 */
	public void setExtd15(Date extd15);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CompanyRequest companyRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CompanyRequest> toCacheModel();

	@Override
	public CompanyRequest toEscapedModel();

	@Override
	public CompanyRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}