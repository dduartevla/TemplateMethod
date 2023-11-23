public class BancadaAlface extends BancadaTemplate{

    public BancadaAlface(String dataPlantio){
        super("Alface",dataPlantio);
    }
    @Override
    public String verificarSensor(Leitura leitura) {
        String alerta = "";

        if (leitura.getPh() < 5){
            alerta = alerta + "Ph " + leitura.getPh() + " abaixo do permitido. ";
        } else if (leitura.getPh() > 8){
            alerta = alerta + "Ph " + leitura.getPh() + " acima do permitido. ";
        }

        if (leitura.getCondutividade() < 30){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " abaixo do permitido.";
        } else if (leitura.getCondutividade() > 70){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " acima do permitido.";
        }

        return alerta;
    }
}
