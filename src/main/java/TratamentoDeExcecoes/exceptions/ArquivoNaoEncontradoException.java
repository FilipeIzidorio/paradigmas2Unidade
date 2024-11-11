package TratamentoDeExcecoes.exceptions;

import java.io.FileNotFoundException;

public class ArquivoNaoEncontradoException extends FileNotFoundException {

    public ArquivoNaoEncontradoException(String e){
        super("Arquivo nao encontrado");
    }
}
