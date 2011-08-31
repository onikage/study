/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.snk;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 3883588255462590978L;
	
	static Logger logger = LoggerFactory.getLogger("action");
	
	private String name;
	private String age;
	private Date dateNow;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateNow() {
		return dateNow;
	}
	public void setDateNow(Date dateNow) {
		this.dateNow = dateNow;
	}
	public String getAge() {
		return age;
	}
	@RequiredFieldValidator(type=ValidatorType.FIELD, key="age.requried", message="age message")
	public void setAge(String age) {
		this.age = age;
	}
	public String index(){
    	name = "onikage";
    	dateNow = new Date();
    	logger.debug("index debug log...");
    	return SUCCESS;
    }
	
	@Override
	public void validate(){
		logger.debug("in validate() method...");
	}
		
	public void validateIndex(){
		logger.debug("in validateIndex() method...");
	}
}
