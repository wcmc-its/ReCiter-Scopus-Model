package reciter.model.scopus;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * A class model for a Scopus article affiliation XML tag.
 * @author jil3004
 *
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
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

	public void setAfid(int afid) {
		this.afid = afid;
	}

	public String getAffilname() {
		return affilname;
	}

	public void setAffilname(String affilname) {
		this.affilname = affilname;
	}

	public String getAffiliationCity() {
		return affiliationCity;
	}

	public void setAffiliationCity(String affiliationCity) {
		this.affiliationCity = affiliationCity;
	}

	public String getAffiliationCountry() {
		return affiliationCountry;
	}

	public void setAffiliationCountry(String affiliationCountry) {
		this.affiliationCountry = affiliationCountry;
	}
	
}
