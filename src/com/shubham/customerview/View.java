package com.shubham.customerview;

import java.util.List;
import java.util.Map;

public class View {

    private String id;
    private String name;
    private String type;
    private Map<String, Object> properties;
    private List<PhaseAndCFEInfo> cfes;
    private DefaultViewColumns defaultViewColumns;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<PhaseAndCFEInfo> getCfes() {
        return cfes;
    }

    public void setCfes(List<PhaseAndCFEInfo> cfes) {
        this.cfes = cfes;
    }

    public DefaultViewColumns getDefaultViewColumns() {
        return defaultViewColumns;
    }

    public void setDefaultViewColumns(DefaultViewColumns defaultViewColumns) {
        this.defaultViewColumns = defaultViewColumns;
    }
}
