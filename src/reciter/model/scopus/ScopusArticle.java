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
 * A class model for representing a Scopus XML article.
 * A ScopusArticle consists of a map of afids to affiliations.
 * Note:
 * Sometimes scopus articles contains duplicate affiliation information.
 * However, this problem is resolved by using a map to store only distinct affiliation based on afid.
 * @author jil3004, Sarbajit Dutta(szd2013)
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class ScopusArticle {
	
	/**
     * The unique Scopus document identifier.
     */
	private String scopusDocId;
	
	 /**
     * The PubMed ID associated with the article.
     */
	private long pubmedId;
	
	/**
     * The Digital Object Identifier (DOI) of the article.
     */
	private String doi;
	
	/**
     * The Digital Object Identifier (DOI) of the article.
     */
	private String title;
	
	/**
     * The name of the  publication.
     * Maps to publication-name in XML.
     */
	private String publicationName;
	
	 /**
     * The publication cover Date format (yyyy-MM-dd).
     */
	private String coverDate;
	
	/**
     * The human-readable display date, e.g., "March 2021".
     */
	private String coverDisplayDate;
	
	/**
     * The International Standard Serial Number of the publication.
     */
	private String issn;
	
	/**
     * The electronic International Standard Serial Number (eISSN) of the publication.
     */
	private String eIssn;
	
	/**
     * The volume in which the article appears, e.g.,231.
     */
	private String volume;
	
	/**
     * The issue identifier of the publication.
     */
	private String issueIdentifier;
	
	
	/**
     * The page range for the article (e.g., "135").
     */
	private String pageRange;
	
	/**
     * The subtype of the document, e.g., "ar" .
     */
	private String subType;
	
	
	/**
     * A textual description of the document subtype.
     */
	private String subTypeDescription;
	
	/**
     * The number of times this article has been cited.
     */
	private long citedByCount;
	
	/**
     * A list of affiliations extracted from the article.
     * Each affiliation may represent an institution .
     */
	private List<Affiliation> affiliations;
	
	 /**
     * A list of authors associated with the article.
     * 
     */
	private List<Author> authors;
}
