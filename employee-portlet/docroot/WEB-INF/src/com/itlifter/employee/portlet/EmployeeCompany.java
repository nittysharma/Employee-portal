package com.itlifter.employee.portlet;

import com.itlifter.employee.service.model.CompanyRequest;
import com.itlifter.employee.service.service.CompanyRequestLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class EmployeeCompany
 */
public class EmployeeCompany extends MVCPortlet {
	public void addRequest(ActionRequest request, ActionResponse response)
			throws Exception {
System.out.println("inside action");
		//ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	//	long groupId = themeDisplay.getScopeGroupId();

					CompanyRequest companyRequest = CompanyRequestLocalServiceUtil.createCompanyRequest(0);	

					companyRequest.setRequestId(ParamUtil.getLong(request, "requestId"));
					System.out.println("requestid is  "+companyRequest.getRequestId());
					companyRequest.setCaddress(ParamUtil.getString(request,"caddress1")+ParamUtil.getString(request,"caddress2"));
			companyRequest.setCaddress1(ParamUtil.getString(request,"caddress1"));
			companyRequest.setCaddress2(ParamUtil.getString(request,"caddress2"));
			companyRequest.setCarea(ParamUtil.getString(request,"carea"));
			companyRequest.setCcity(ParamUtil.getString(request,"ccity"));
			companyRequest.setCcountryId(0L);
			companyRequest.setCdistrict(ParamUtil.getString(request,"cdistrict"));
			companyRequest.setCemailAddress(ParamUtil.getString(request,"cemailAddress"));
companyRequest.setCfax(ParamUtil.getLong(request,"cfax"));
companyRequest.setCname(ParamUtil.getString(request,"cname"));
companyRequest.setCompanyId(122L);
companyRequest.setCphone(ParamUtil.getLong(request,"cphone"));
companyRequest.setCreateDate(new Date());
companyRequest.setCrecursable(false);
companyRequest.setCregionId(0L);
companyRequest.setCstate(ParamUtil.getString(request,"cstate"));
companyRequest.setCtype(ParamUtil.getString(request,"ctype"));
companyRequest.setCwebsite(ParamUtil.getString(request,"cwebsite"));
companyRequest.setCzipcode(ParamUtil.getLong(request, "czipcode"));
companyRequest.setDesignation(ParamUtil.getString(request,"designation"));
companyRequest.setEmail(ParamUtil.getString(request,"email"));
companyRequest.setFax(ParamUtil.getLong(request,"fax"));
companyRequest.setGroupId(0L);
companyRequest.setLastName(ParamUtil.getString(request,"lastName"));
companyRequest.setFirstName(ParamUtil.getString(request,"firstName"));
companyRequest.setMobile(ParamUtil.getLong(request,"mobile"));
companyRequest.setModifiedDate(null);
companyRequest.setStatus("waiting");
companyRequest.setTitle(ParamUtil.getString(request,"title"));
companyRequest.setUserId(0);

CompanyRequestLocalServiceUtil.addCompanyRequest(companyRequest);
SessionMessages.add(request, "request-added");
sendRedirect(request, response);
			}
		
	}

