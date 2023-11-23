import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancadaRuculaTest {

    @Test
    void deveRetornarPhAbaixoDoPermitido(){
        BancadaRucula bancada = new BancadaRucula("01/01/1900");
        Leitura leitura = new Leitura(4, 41);
        assertEquals("Ph " + "4.0" + " abaixo do permitido. "
                , bancada.verificarSensor(leitura));

    }

    @Test
    void deveRetornarPhAcimaDoPermitido(){
        BancadaRucula bancada = new BancadaRucula("01/01/1900");
        Leitura leitura = new Leitura(8, 41);
        bancada.setLeitura(leitura);
        assertEquals("Ph " + "8.0" + " acima do permitido. "
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAbaixoDoPermitido(){
        BancadaRucula bancada = new BancadaRucula("01/01/1900");
        Leitura leitura = new Leitura(6, 39);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "39.0" + " abaixo do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAcimaDoPermitido(){
        BancadaRucula bancada = new BancadaRucula("01/01/1900");
        Leitura leitura = new Leitura(6, 61);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "61.0" + " acima do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarInformacoes(){
        BancadaRucula bancada = new BancadaRucula("01/01/1900");
        Leitura leitura = new Leitura(6, 51);
        bancada.setLeitura(leitura);
        assertEquals("Nome: " + "Rucula" + "\n"
                        + "Data Plantio: " + "01/01/1900" + "\n"
                        + "Alertas: "
                , bancada.getInfo());
    }

}