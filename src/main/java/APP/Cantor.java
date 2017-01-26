package APP;

/**
 * Created by kalisiaczki on 21.01.2017.
 */
public class Cantor {

    private String name;
    private String adress;
    private Rates rates;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw(){
        System.out.println(name+"  " + adress+"  " + rates.getBuyRate());
    }
}
