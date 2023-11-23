public class BancadaCoentro extends BancadaTemplate{


    @Override
    public String verificarSensor(Leitura leitura) {
        String alerta = "";

        if (leitura.getPh() < 4){
            alerta = alerta + "Ph " + leitura.getPh() + " abaixo do permitido. ";
        } else if (leitura.getPh() > 6){
            alerta = alerta + "Ph " + leitura.getPh() + " acima do permitido. ";
        }

        if (leitura.getCondutividade() < 50){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " abaixo do permitido";
        } else if (leitura.getCondutividade() > 80){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " acima do permitido";
        }

        return alerta;
    }
}
