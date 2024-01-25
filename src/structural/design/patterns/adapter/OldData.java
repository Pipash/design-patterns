package structural.design.patterns.adapter;

public class OldData {
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
        System.out.println("Legacy data index: "+ index + " amount: "+ amount);
    }
}
