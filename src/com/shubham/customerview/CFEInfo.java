package com.shubham.customerview;

public class CFEInfo {

    private String cfeId;
    private String cfeRefId;
    private Long quantity;
    private String site;

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

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
