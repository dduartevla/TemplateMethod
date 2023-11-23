public abstract class BancadaTemplate {

    private String nomeCultura;
    private String dataPlantio;

    private Leitura leitura;

    public BancadaTemplate(){}

    public BancadaTemplate(String nome, String dataPlantio){
        this.nomeCultura = nome;
        this.dataPlantio = dataPlantio;
    }

    public void setLeitura(Leitura leitura) {
        this.leitura = leitura;
    }

    public abstract String verificarSensor(Leitura leitura);

    public String getNomeCultura() {
        return nomeCultura;
    }

    public void setNomeCultura(String nomeCultura) {
        this.nomeCultura = nomeCultura;
    }

    public String getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(String dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public String getInfo(){
        String info = "Nome: " + this.nomeCultura + "\n"
                + "Data Plantio: " + this.dataPlantio + "\n"
                + "Alertas: " + this.verificarSensor(this.leitura);
        return info;
    }
}
