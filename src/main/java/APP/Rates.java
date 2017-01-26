package APP;

/**
 * Created by kalisiaczki on 21.01.2017.
 */


public class Rates {
    private int buyRate;
    private int sellRate;
    private int amount;

    public Rates(int buyRate, int sellRate, int amount) {
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.amount = amount;
    }

    public int getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(int buyRate) {
        this.buyRate = buyRate;
    }

    public int getSellRate() {
        return sellRate;
    }

    public void setSellRate(int sellRate) {
        this.sellRate = sellRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
