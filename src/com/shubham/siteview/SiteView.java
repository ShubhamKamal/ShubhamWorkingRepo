package com.shubham.siteview;

import java.util.List;

public class SiteView {

    private String offerCaseVersionId;
    private String offerCaseId;
    private List<SiteViewCfes> views;

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

    public List<SiteViewCfes> getViews() {
        return views;
    }

    public void setViews(List<SiteViewCfes> views) {
        this.views = views;
    }
}
