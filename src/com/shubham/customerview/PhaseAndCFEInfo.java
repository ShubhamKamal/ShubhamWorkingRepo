package com.shubham.customerview;

import java.util.List;

public class PhaseAndCFEInfo {

    private String phaseId;
    private List<CFEInfo> cfe;

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public List<CFEInfo> getCfe() {
        return cfe;
    }

    public void setCfe(List<CFEInfo> cfe) {
        this.cfe = cfe;
    }
}
