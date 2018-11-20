

public class Client {
    String id;
    int age;
    String gender;
    String type; // Person or Organization
    String occupation; // Occupation CIIU
    String profile;
    boolean newClient=false; // Account age < 1 year = true
    boolean incomingForeignEx=false;
    boolean outgoingForeignEx=false;
    double declaredIncome;

    public boolean isNewClient() {
        return newClient;
    }

    public void setNewClient(boolean newClient) {
        this.newClient = newClient;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String zip;
    /*

        Variables depending on the risk model
         */
    int risk;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public double getDeclaredIncome() {
        return declaredIncome;
    }

    public void setDeclaredIncome(double declaredIncome) {
        this.declaredIncome = declaredIncome;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client() {
    }
}