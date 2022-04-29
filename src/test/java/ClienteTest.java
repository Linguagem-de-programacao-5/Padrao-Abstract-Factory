import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoB2C() {
        FabricaAbstrata fabrica = new FabricaContratoB2C();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato para B2C", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoB2B() {
        FabricaAbstrata fabrica = new FabricaContratoB2B();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato para B2B", cliente.emitirContrato());
    }
}