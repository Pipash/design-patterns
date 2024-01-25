package structural.design.patterns.adapter;

public class LatestData {
    private Integer position;
    private Integer amount;

    public LatestData(Integer position, Integer amount) {
        this.amount = amount;
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getAmount() {
        return amount;
    }
}
