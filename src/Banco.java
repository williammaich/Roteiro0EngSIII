import pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willi on 09/08/2017.
 */
public class Banco {

    ArrayList<Pessoa> pessoas = new ArrayList();

    public void cadastrar (Pessoa pessoa){

        pessoas.add(pessoa);
    }



    public List<Pessoa> getPessoaFisica(){

        return Util.buscaPessoa(pessoas,PessoaFisica.class);
    }

    public List<Pessoa> getPessoaJuridica(){


        return Util.buscaPessoa(pessoas,PessoaJuridica.class);
    }



}
