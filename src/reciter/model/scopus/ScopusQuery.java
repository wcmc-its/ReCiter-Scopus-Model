package reciter.model.scopus;

import java.util.List;

public class ScopusQuery {
    private List<Object> query;
    private String type;

    public ScopusQuery() {}

    public ScopusQuery(List<Object> query, String type) {
        this.query = query;
        this.type = type;
    }
    public List<Object> getQuery() {
        return query;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

