public class Zip {
    String zip;
    String name;
    int risk;

    public Zip(String zip, String name, int risk) {
        this.zip = zip;
        this.name = name;
        this.risk = risk;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
}