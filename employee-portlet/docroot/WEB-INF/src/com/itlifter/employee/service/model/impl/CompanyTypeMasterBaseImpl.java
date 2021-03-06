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
import com.itlifter.employee.service.service.CompanyTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CompanyTypeMaster service. Represents a row in the &quot;employee_CompanyTypeMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyTypeMasterImpl}.
 * </p>
 *
 * @author Ashish
 * @see CompanyTypeMasterImpl
 * @see com.itlifter.employee.service.model.CompanyTypeMaster
 * @generated
 */
public abstract class CompanyTypeMasterBaseImpl
	extends CompanyTypeMasterModelImpl implements CompanyTypeMaster {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company type master model instance should use the {@link CompanyTypeMaster} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CompanyTypeMasterLocalServiceUtil.addCompanyTypeMaster(this);
		}
		else {
			CompanyTypeMasterLocalServiceUtil.updateCompanyTypeMaster(this);
		}
	}
}