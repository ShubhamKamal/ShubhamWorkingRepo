package com.shubham.siteview;

import java.util.Map;

public class SiteViewPhaseAndCfeInfo {

    private String cfeId;
    private String cfeRefId;
    Map<String, PhaseLevelQuantity> quantitiesBySIte;

    public String getCfeId() {
        return cfeId;
    }

    public void setCfeId(String cfeId) {
        this.cfeId = cfeId;
    }

    public String getCfeRefId() {
        return cfeRefId;
    }

    public void setCfeRefId(String cfeRefId) {
        this.cfeRefId = cfeRefId;
    }

    public Map<String, PhaseLevelQuantity> getQuantitiesBySIte() {
        return quantitiesBySIte;
    }

    public void setQuantitiesBySIte(Map<String, PhaseLevelQuantity> quantitiesBySIte) {
        this.quantitiesBySIte = quantitiesBySIte;
    }
}
