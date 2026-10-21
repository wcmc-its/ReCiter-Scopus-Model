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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * A class model representing a Scopus article author XML tag.
 * @author ved4006
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
public class Author {
	
	 /**
     * The sequence number of the author .
     * Maps to the <author seq="1"> XML tag .
     */
	private int seq;
	
	 /**
     * The unique author identifier.
     * Maps to the <authid> XML tag.
     */
	private long authid; 
	
	/**
     * The full name of the author.
     * Maps to the  <authname> XML tag.
     */
	private String authname; 
	
	/**
     * The surname (last name) of the author.
     * Maps to the  <surname> XML tag.
     */
	private String surname; 
	
	  /**
     * The given name of the author.
     * Maps to the <given-name> XML tag.
     */
	private String givenName; 
	
	 /**
     * The initials of the author's name.
     * Maps to the  <initials> XML tag.
     */
	private String initials;
	
	 /**
     * The list of affiliation IDs associated with the author.
     * Maps to one or more <afid>> XML tags.
     * <p>
     * A list is used to preserve order if needed, but duplicates should be filtered by the parser.
     * </p>
     */
	private List<Integer> afids;
}
