
import org.ChainOfResponsability.Obra;
import org.ChainOfResponsability.TipoInspecao;
import org.ChainOfResponsability.TipoInspecaoEletrica;
import org.ChainOfResponsability.TipoInspecaoEstrutural;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObraTest {

    @Test
    public void testGetTipoInspecao() {
        TipoInspecao tipoInspecao = TipoInspecaoEstrutural.getTipoInspecaoEstrutural();

        Obra obra = new Obra(tipoInspecao);

        assertEquals(tipoInspecao, obra.getTipoInspecao());
    }

    @Test
    public void testSetTipoInspecao() {
        TipoInspecao tipoInspecao1 = TipoInspecaoEstrutural.getTipoInspecaoEstrutural();
        TipoInspecao tipoInspecao2 = TipoInspecaoEletrica.getTipoInspecaoEletrica();

        Obra obra = new Obra(tipoInspecao1);
        assertEquals(tipoInspecao1, obra.getTipoInspecao());

        obra.setTipoInspecao(tipoInspecao2);

        assertEquals(tipoInspecao2, obra.getTipoInspecao());
    }
}
