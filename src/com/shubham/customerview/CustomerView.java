package com.shubham.customerview;

import java.util.List;

public class CustomerView {

    private String id;
    private String offerCaseVersionId;
    private String offerCaseId;
    private String type;
    private List<View> views;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOfferCaseVersionId() {
        return offerCaseVersionId;
    }

    public void setOfferCaseVersionId(String offerCaseVersionId) {
        this.offerCaseVersionId = offerCaseVersionId;
    }

    public String getOfferCaseId() {
        return offerCaseId;
    }

    public void setOfferCaseId(String offerCaseId) {
        this.offerCaseId = offerCaseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }
}
