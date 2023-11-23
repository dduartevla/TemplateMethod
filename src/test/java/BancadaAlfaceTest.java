import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancadaAlfaceTest {

    @Test
    void deveRetornarPhAbaixoDoPermitido(){
        BancadaAlface bancada = new BancadaAlface("01/01/1900");
        Leitura leitura = new Leitura(4, 40);
        assertEquals("Ph " + "4.0" + " abaixo do permitido. "
                , bancada.verificarSensor(leitura));

    }

    @Test
    void deveRetornarPhAcimaDoPermitido(){
        BancadaAlface bancada = new BancadaAlface("01/01/1900");
        Leitura leitura = new Leitura(10, 40);
        bancada.setLeitura(leitura);
        assertEquals("Ph " + "10.0" + " acima do permitido. "
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAbaixoDoPermitido(){
        BancadaAlface bancada = new BancadaAlface("01/01/1900");
        Leitura leitura = new Leitura(6, 20);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "20.0" + " abaixo do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarCondutividadeAcimaDoPermitido(){
        BancadaAlface bancada = new BancadaAlface("01/01/1900");
        Leitura leitura = new Leitura(6, 90);
        bancada.setLeitura(leitura);
        assertEquals("Condutividade " + "90.0" + " acima do permitido."
                , bancada.verificarSensor(leitura));
    }

    @Test
    void deveRetornarInformacoes(){
        BancadaAlface bancada = new BancadaAlface("01/01/1900");
        Leitura leitura = new Leitura(6, 31);
        bancada.setLeitura(leitura);
        assertEquals("Nome: " + "Alface" + "\n"
                + "Data Plantio: " + "01/01/1900" + "\n"
                + "Alertas: "
                , bancada.getInfo());
    }

}