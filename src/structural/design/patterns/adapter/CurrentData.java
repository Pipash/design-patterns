package structural.design.patterns.adapter;

public class CurrentData {
    private Integer position;
    private Integer amount;

    public CurrentData(Integer position, Integer amount){
        this.position = position;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getPosition() {
        return position;
    }
}
