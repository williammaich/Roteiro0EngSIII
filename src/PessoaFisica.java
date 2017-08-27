import pessoa.Pessoa;

import java.security.PublicKey;

/**
 * Created by willi on 09/08/2017.
 */
public class PessoaFisica extends Pessoa{

    String cpf;

    public PessoaFisica(String nome, String cpf) throws Exception {
        super(nome);
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return " Pessoa Fisica    " +
                 super.toString() +
                "    Cpf = " + cpf
                +"\n";
    }
}
