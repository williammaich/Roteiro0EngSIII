import pessoa.Pessoa;

/**
 * Created by willi on 09/08/2017.
 */
public class PessoaJuridica extends Pessoa {

    String cnpj;

    public PessoaJuridica(String nome, String cnpj) throws Exception {
        super(nome);
        setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return " Pessoa Juridica     " +
                super.toString() +
                "    Cnpj= " + cnpj
                +"\n";
    }
}
