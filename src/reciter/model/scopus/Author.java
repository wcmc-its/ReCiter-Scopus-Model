package reciter.model.scopus;

import java.util.Set;

/**
 * A class model representing a Scopus article author XML tag.
 * @author jil3004
 *
 */
public class Author {
	private int seq; // <author seq="1"> tag.
	private long authid; // <authid> tag.
	private String authname; // <authname> tag.
	private String surname; // <surname> tag.
	private String givenName; // <given-name> tag.
	private String initials; // <initials> tag.
	private Set<Integer> afids; // <afid> tag. Using a set because duplicates are not allowed.
	
	public Author() {}
	
	public Author(int seq, long authid, String authname, String surname,
			String givenName, String initials, Set<Integer> afids) {
		this.seq = seq;
		this.authid = authid;
		this.authname = authname;
		this.surname = surname;
		this.givenName = givenName;
		this.initials = initials;
		this.afids = afids;
	}

	public int getSeq() {
		return seq;
	}

	public long getAuthid() {
		return authid;
	}

	public String getAuthname() {
		return authname;
	}

	public String getSurname() {
		return surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getInitials() {
		return initials;
	}

	public Set<Integer> getAfidSet() {
		return afids;
	}
}
