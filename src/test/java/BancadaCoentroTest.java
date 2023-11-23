import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancadaCoentroTest {

    @Test
    void deveRetornarPhAbaixoDoPermitido(){
        BancadaCoentro bancada = new BancadaCoentro("01/01/1900");
        Leitura leitura = new Leitura(3, 51);
        assertEquals("Ph " + "3.0" + " abaixo do permitido. "
                , bancada.verificarSensor(leitura));

    }

    @Test
    void deveRetornarPhAcimaDoPermitido(){
        BancadaCoentro bancada = new BancadaCoentro("01/01/1900");
        Leitura leitura = new Leitura(7, 51);
        bancada.setLeitura(leitura);
        assertEquals("Ph " + "7.0" + " acima do permitido. "
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAbaixoDoPermitido(){
        BancadaCoentro bancada = new BancadaCoentro("01/01/1900");
        Leitura leitura = new Leitura(6, 49);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "49.0" + " abaixo do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAcimaDoPermitido(){
        BancadaCoentro bancada = new BancadaCoentro("01/01/1900");
        Leitura leitura = new Leitura(6, 81);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "81.0" + " acima do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarInformacoes(){
        BancadaCoentro bancada = new BancadaCoentro("01/01/1900");
        Leitura leitura = new Leitura(5, 51);
        bancada.setLeitura(leitura);
        assertEquals("Nome: " + "Coentro" + "\n"
                        + "Data Plantio: " + "01/01/1900" + "\n"
                        + "Alertas: "
                , bancada.getInfo());
    }

}