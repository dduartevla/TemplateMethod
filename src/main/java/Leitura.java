public class Leitura {

    private double ph;
    private double condutividade;


    public Leitura(double ph, double condutividade) {
        this.ph = ph;
        this.condutividade = condutividade;
    }

    public double getPh() {
        return ph;
    }

    public double getCondutividade() {
        return condutividade;
    }
}
