<%@page import="com.itlifter.employee.service.service.CompanyTypeMasterLocalServiceUtil"%>
<%@page import="com.itlifter.employee.service.model.CompanyTypeMaster"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages" %>
<%@include file="/html/init.jsp"%>

<%
List<CompanyTypeMaster> companyTypeMasters = CompanyTypeMasterLocalServiceUtil.getCompanyTypeMasters(0, CompanyTypeMasterLocalServiceUtil.getCompanyTypeMastersCount());
String redirect=PortalUtil.getCurrentURL(renderRequest);
%>
<portlet:actionURL name='addRequest' var="addRequestURL" windowState="normal" />

<liferay-ui:header
	backURL=""
	title='Request'
/>
<br />
<aui:form action="<%=addRequestURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="requestId" value='"'/>
	
		<aui:input name="cname" label="Company Name"/>	
		
		<aui:select name="ctype" label="Company Type">
	 		<%
				for(CompanyTypeMaster companyTypeMaster: companyTypeMasters){
			%>
			<aui:option value="<%= companyTypeMaster.getTypeName().toLowerCase() %>" ><%=HtmlUtil.escape(companyTypeMaster.getTypeName().toLowerCase())%></aui:option>
			<%
				}
			%>
</aui:select>

		
		<aui:input name="caddress1"  label="Address Line1"/>
		
		<aui:input name="caddress2" label="Address Line2"/>
		 
		<aui:input name="cphone" label="Company Phone"/>
		 
		<aui:input name="cemailAddress" label="Company Email"/>
				
		<aui:input name="cwebsite" label="Company Website"/>
		 
		<aui:input name="carea" label="Area"/>

		<aui:input name="ccity" label="City"/>
		
		<aui:input name="cdistrict" label="District"/>

		<aui:input name="cstate" label="State"/>
		 
		<aui:input name="czipcode" label="ZipCode"/>
		
		<aui:input name="cfax" label="Fax"/>
		<hr/>
		<aui:input name="title" label="Title"/>
		
		<aui:input name="firstName" label="FirstName"/>
		
		<aui:input name="lastName" label="LastName"/>
		
		<aui:input name="designation" label="Designation"/>
		
		<aui:input name="email" label="email"/>
				<aui:input name="mobile" label="Mobile"/>
						<aui:input name="fax" label="Fax"/>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel" onClick="#" />
	</aui:button-row>
</aui:form> 