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

package com.itlifter.employee.service.service.persistence;

import com.itlifter.employee.service.model.CompanyTypeMaster;
import com.itlifter.employee.service.service.CompanyTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Ashish
 * @generated
 */
public abstract class CompanyTypeMasterActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public CompanyTypeMasterActionableDynamicQuery() throws SystemException {
		setBaseLocalService(CompanyTypeMasterLocalServiceUtil.getService());
		setClass(CompanyTypeMaster.class);

		setClassLoader(com.itlifter.employee.service.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("typeId");
	}
}