public class BancadaRucula extends BancadaTemplate{
    @Override
    public String verificarSensor(Leitura leitura) {
        String alerta = "";

        if (leitura.getPh() < 5){
            alerta = alerta + "Ph " + leitura.getPh() + " abaixo do permitido. ";
        } else if (leitura.getPh() > 7){
            alerta = alerta + "Ph " + leitura.getPh() + " acima do permitido. ";
        }

        if (leitura.getCondutividade() < 40){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " abaixo do permitido";
        } else if (leitura.getCondutividade() > 60){
            alerta = alerta + "Condutividade " +  leitura.getCondutividade() + " acima do permitido";
        }

        return alerta;
    }

}
