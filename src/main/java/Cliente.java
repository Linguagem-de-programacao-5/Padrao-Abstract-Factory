public class Cliente {

    private Contrato contrato;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
    }

    String emitirContrato(){
        return this.contrato.emitirContrato();
    }
}
