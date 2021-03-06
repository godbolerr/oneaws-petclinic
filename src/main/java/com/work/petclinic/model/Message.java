/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.work.petclinic.model;

import java.util.Calendar;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Rob Winch
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Message extends BaseEntity {

	private static final long serialVersionUID = -4768045909580278883L;

	@Column
	@NotEmpty
	private String messageText;

	@Column
	@NotEmpty
	private String summary;

	private Calendar created = Calendar.getInstance();
}
