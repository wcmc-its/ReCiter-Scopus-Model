package reciter.model.scopus;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

/**
 * A class model for representing a Scopus XML article.
 * A ScopusArticle consists of a map of afids to affiliations.
 * <p>
 * Note:
 * Sometimes scopus articles contains duplicate affiliation information.
 * However, this problem is resolved by using a map to store only distinct affiliation based on afid.
 * </p>
 *
 * @author jil3004
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class ScopusArticle {
	
	private String scopusDocId;
	private long pubmedId;
	private String doi;
	private String title;
	private String publicationName;
	private String coverDate;
	private String coverDisplayDate;
	private String issn;
	private String eIssn;
	private String volume;
	private String issueIdentifier;
	private String pageRange;
	private String subType;
	private String subTypeDescription;
	private long citedByCount;
	private List<Affiliation> affiliations;
	private List<Author> authors;
}
