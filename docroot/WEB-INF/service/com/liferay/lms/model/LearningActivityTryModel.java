/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LearningActivityTry service. Represents a row in the &quot;Lms_LearningActivityTry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.lms.model.impl.LearningActivityTryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.lms.model.impl.LearningActivityTryImpl}.
 * </p>
 *
 * @author TLS
 * @see LearningActivityTry
 * @see com.liferay.lms.model.impl.LearningActivityTryImpl
 * @see com.liferay.lms.model.impl.LearningActivityTryModelImpl
 * @generated
 */
public interface LearningActivityTryModel extends BaseModel<LearningActivityTry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a learning activity try model instance should use the {@link LearningActivityTry} interface instead.
	 */

	/**
	 * Returns the primary key of this learning activity try.
	 *
	 * @return the primary key of this learning activity try
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this learning activity try.
	 *
	 * @param primaryKey the primary key of this learning activity try
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this learning activity try.
	 *
	 * @return the uuid of this learning activity try
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this learning activity try.
	 *
	 * @param uuid the uuid of this learning activity try
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the lat ID of this learning activity try.
	 *
	 * @return the lat ID of this learning activity try
	 */
	public long getLatId();

	/**
	 * Sets the lat ID of this learning activity try.
	 *
	 * @param latId the lat ID of this learning activity try
	 */
	public void setLatId(long latId);

	/**
	 * Returns the act ID of this learning activity try.
	 *
	 * @return the act ID of this learning activity try
	 */
	public long getActId();

	/**
	 * Sets the act ID of this learning activity try.
	 *
	 * @param actId the act ID of this learning activity try
	 */
	public void setActId(long actId);

	/**
	 * Returns the user ID of this learning activity try.
	 *
	 * @return the user ID of this learning activity try
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this learning activity try.
	 *
	 * @param userId the user ID of this learning activity try
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this learning activity try.
	 *
	 * @return the user uuid of this learning activity try
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this learning activity try.
	 *
	 * @param userUuid the user uuid of this learning activity try
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the start date of this learning activity try.
	 *
	 * @return the start date of this learning activity try
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this learning activity try.
	 *
	 * @param startDate the start date of this learning activity try
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the result of this learning activity try.
	 *
	 * @return the result of this learning activity try
	 */
	public long getResult();

	/**
	 * Sets the result of this learning activity try.
	 *
	 * @param result the result of this learning activity try
	 */
	public void setResult(long result);

	/**
	 * Returns the end date of this learning activity try.
	 *
	 * @return the end date of this learning activity try
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this learning activity try.
	 *
	 * @param endDate the end date of this learning activity try
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the end user date of this learning activity try.
	 *
	 * @return the end user date of this learning activity try
	 */
	public Date getEndUserDate();

	/**
	 * Sets the end user date of this learning activity try.
	 *
	 * @param endUserDate the end user date of this learning activity try
	 */
	public void setEndUserDate(Date endUserDate);

	/**
	 * Returns the try data of this learning activity try.
	 *
	 * @return the try data of this learning activity try
	 */
	@AutoEscape
	public String getTryData();

	/**
	 * Sets the try data of this learning activity try.
	 *
	 * @param tryData the try data of this learning activity try
	 */
	public void setTryData(String tryData);

	/**
	 * Returns the try result data of this learning activity try.
	 *
	 * @return the try result data of this learning activity try
	 */
	@AutoEscape
	public String getTryResultData();

	/**
	 * Sets the try result data of this learning activity try.
	 *
	 * @param tryResultData the try result data of this learning activity try
	 */
	public void setTryResultData(String tryResultData);

	/**
	 * Returns the comments of this learning activity try.
	 *
	 * @return the comments of this learning activity try
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this learning activity try.
	 *
	 * @param comments the comments of this learning activity try
	 */
	public void setComments(String comments);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(LearningActivityTry learningActivityTry);

	public int hashCode();

	public CacheModel<LearningActivityTry> toCacheModel();

	public LearningActivityTry toEscapedModel();

	public String toString();

	public String toXmlString();
}