package reciter.model.scopus;

import java.util.List;

public class ScopusQuery {
    private List<Object> query;
    private String type;

    public ScopusQuery() {}

    public ScopusQuery(List<Object> query) {
        this.query = query;
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

