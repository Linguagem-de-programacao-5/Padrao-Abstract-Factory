public class FabricaContratoB2B implements FabricaAbstrata{
    @Override
    public Contrato createContrato() {
        return new ContratoB2B();
    }
}
