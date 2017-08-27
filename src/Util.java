import pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willi on 23/08/2017.
 */
public class Util {



    public static List<Pessoa> buscaPessoa(List<Pessoa> pessoas ,Class tipo ) {
        List<Pessoa> pessoa = new ArrayList<>();

            for (Pessoa p : pessoas) {
                if (tipo.isInstance(p)) {
                    pessoa.add(p);
                }
            }
            return pessoa;
        }


}
