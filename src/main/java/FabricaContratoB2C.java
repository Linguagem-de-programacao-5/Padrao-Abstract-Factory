public class FabricaContratoB2C implements FabricaAbstrata{
    @Override
    public Contrato createContrato() {
        return new ContratoB2C();
    }
}
