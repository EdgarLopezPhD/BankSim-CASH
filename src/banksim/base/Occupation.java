public class Occupation {
    String occupation;
    String description;
    int risk;
    boolean highCash=0;
    {
        return description;
    }
    public String getDescription()

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public boolean isHighCash() {
        return highCash;
    }

    public void setHighCash(boolean highCash) {
        this.highCash = highCash;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Occupation{" +
                "occupation='" + occupation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Occupation() {
    }
}