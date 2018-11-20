public class Branch {
    String idBranch;
    String typeBranch;
    int risk;
    String zip;

    public Branch(String idBranch, String typeBranch, int risk, String zip) {
        this.idBranch = idBranch;
        this.typeBranch = typeBranch;
        this.risk = risk;
        this.zip = zip;
    }

    public Branch() {
    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public String getTypeBranch() {
        return typeBranch;
    }

    public void setTypeBranch(String typeBranch) {
        this.typeBranch = typeBranch;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}