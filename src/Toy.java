public class Toy {
    private int toyID;
    private String toyName;
    private int toyQuantity;
    private double toyPrice;

    public Toy(int toyID, String toyName, int toyQuantity, double toyPrice) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyQuantity = toyQuantity;
        this.toyPrice = toyPrice;
    }

    public int getToyID() {
        return toyID;
    }

    public void setToyID(int toyID) {
        this.toyID = toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyQuantity() {
        return toyQuantity;
    }

    public void setToyQuantity(int toyQuantity) {
        this.toyQuantity = toyQuantity;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public String getToyInformation() {
        return String.format("Toy(%d,%s), quantity(%d) with $( %.2f)/toy", toyID, toyName, toyQuantity, toyPrice);
    }
}
