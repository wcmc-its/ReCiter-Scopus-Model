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
 * @author jil3004
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
	private int seq; // <author seq="1"> tag.
	private long authid; // <authid> tag.
	private String authname; // <authname> tag.
	private String surname; // <surname> tag.
	private String givenName; // <given-name> tag.
	private String initials; // <initials> tag.
	private List<Integer> afids; // <afid> tag. Using a set because duplicates are not allowed.
}
