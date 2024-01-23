package structural.design.patterns.adapter;

public class LegacyData {
    private float index;
    private String amount;

    public float getIndex() {
        return index;
    }

    public void setIndex(float index) {
        this.index = index;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void display() {
        System.out.println("Legacy data are index: "+ index + " amount: "+ amount);
    }
}
