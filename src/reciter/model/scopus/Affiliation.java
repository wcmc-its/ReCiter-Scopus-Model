package reciter.model.scopus;

/**
 * A class model for a Scopus article affiliation XML tag.
 * @author jil3004
 *
 */
public class Affiliation {

	private int afid; // <afid> XML tag.
	private String affilname; // <affilname> XML tag.
	private String affiliationCity; // <affiliation-city> XML tag.
	private String affiliationCountry; // <affiliation-country> XML tag.
	
	public Affiliation() {}
	
	public Affiliation(int afid, String affilname, String affiliationCity, String affiliationCountry) {
		this.afid = afid;
		this.affilname = affilname;
		this.affiliationCity = affiliationCity;
		this.affiliationCountry = affiliationCountry;
	}

	public int getAfid() {
		return afid;
	}

	public String getAffilname() {
		return affilname;
	}
	
	public String getAffiliationCity() {
		return affiliationCity;
	}

	public String getAffiliationCountry() {
		return affiliationCountry;
	}
}
