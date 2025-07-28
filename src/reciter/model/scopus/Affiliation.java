/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package reciter.model.scopus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * A class model for a Scopus article affiliation XML tag.
 * @author jil3004
 * @author ved4006
 *
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class Affiliation {

	 /**
     * The affiliation ID.
     * Maps to the <afid> XML tag.
     */
	private int afid; 
	
	 /**
     * The name of the affiliated institution.
     * Maps to the <affilname> XML tag.
     */
	private String affilname;
	
	 /**
     * The city where the institution is located.
     * Maps to the <affiliation-city> XML tag.
     */
	private String affiliationCity; 
	
	/**
     * The country where the institution is located.
     * Maps to the <affiliation-country> XML tag.
     */
	private String affiliationCountry;
}
