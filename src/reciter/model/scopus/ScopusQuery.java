package reciter.model.scopus;

import java.util.List;

/**
 * Represents a Scopus query object containing a list of query elements and a query type.
 * <p>
 * This class can be used to model search/filter criteria when querying Scopus-like systems.
 * </p>
 * @author ved4006
 */
public class ScopusQuery {
	 /**
     * The list of query 
     */
    private List<Object> query;
    
    /**
     * The type of query.
     */
    private String type;


    /**
     * Default  constructor for ScopusQuery.
     */
    public ScopusQuery() {}

    /**
     * Constructs a new {@code ScopusQuery} with the specified query and type.
     *
     * @param query the list of query elements
     * @param type  the type of the query (e.g., boolean operator)
     */
    public ScopusQuery(List<Object> query, String type) {
        this.query = query;
        this.type = type;
    }
    
    /**
     * Gets the list of query elements.
     *
     * @return the query list
     */
    public List<Object> getQuery() {
        return query;
    }
    
    /**
     * Gets the type of the query.
     *
     * @return the query type
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the type of the query.
     *
     * @param type the new query type
     */
    public void setType(String type) {
        this.type = type;
    }
}

