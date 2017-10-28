package reciter.model.scopus;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * A class model representing a Scopus article author XML tag.
 * @author jil3004
 *
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
public class Author {
	private int seq; // <author seq="1"> tag.
	private long authid; // <authid> tag.
	private String authname; // <authname> tag.
	private String surname; // <surname> tag.
	private String givenName; // <given-name> tag.
	private String initials; // <initials> tag.
	private List<Integer> afids; // <afid> tag. Using a set because duplicates are not allowed.
}
