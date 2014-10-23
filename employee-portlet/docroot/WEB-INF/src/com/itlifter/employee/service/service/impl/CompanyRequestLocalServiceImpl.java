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

package com.itlifter.employee.service.service.impl;

import com.itlifter.employee.service.model.CompanyRequest;
import com.itlifter.employee.service.service.base.CompanyRequestLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the company request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.itlifter.employee.service.service.CompanyRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ashish
 * @see com.itlifter.employee.service.service.base.CompanyRequestLocalServiceBaseImpl
 * @see com.itlifter.employee.service.service.CompanyRequestLocalServiceUtil
 */
public class CompanyRequestLocalServiceImpl
	extends CompanyRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.itlifter.employee.service.service.CompanyRequestLocalServiceUtil} to access the company request local service.
	 */
	
	public CompanyRequest addCompanyRequest(CompanyRequest companyRequest) throws SystemException {

		long requestId = counterLocalService.increment(CompanyRequest.class.getName());

		companyRequest.setRequestId(requestId);

		return super.addCompanyRequest(companyRequest);
	}

	
	
}