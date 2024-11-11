package TratamentoDeExcecoes.factory;



import TratamentoDeExcecoes.enums.TipoBalanca;
import TratamentoDeExcecoes.interfaces.IBalanca;
import TratamentoDeExcecoes.models.Produto;
import TratamentoDeExcecoes.services.FilizolaSmart;
import TratamentoDeExcecoes.services.ToledoMGV6;
import TratamentoDeExcecoes.services.UranoIntegra;

import java.io.IOException;

public class BalancaFactory {
    public static IBalanca<Produto> getBalanca(TipoBalanca tipo) {

        switch (tipo) {
            case FINIZOLA_SMART:
                return (IBalanca<Produto>) new FilizolaSmart();
            case TOLEDO_MGV6:
                return (IBalanca<Produto>) new ToledoMGV6();
            case URANO_INTEGRA:
                return (IBalanca<Produto>) new UranoIntegra();
            default:
                return null;
        }
    }
}
