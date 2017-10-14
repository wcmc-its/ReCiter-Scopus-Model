package reciter.model.scopus;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * A class model for representing a Scopus XML article.
 * <p>
 * <p>
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
public class ScopusArticle {

	private long pubmedId;
	private List<Affiliation> affiliations;
	private List<Author> authors;
	private String doi;
}
