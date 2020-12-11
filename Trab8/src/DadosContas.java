import java.util.List;
import java.util.ArrayList;

public class DadosContas{
    private List<Cliente> lContas;

    DadosContas(){
        lContas = new ArrayList<Cliente>();
    }

    public void cadastrar(Cliente c){
        this.lContas.add(c);
    }

    public void listar(){
        for(Cliente c: this.lContas){
            c.mostraDados();
        }
    }

    public Cliente buscar(String CPF){
        Cliente cc= null;
        for(Cliente c: this.lContas){
            if(c.getCPF().equals(CPF)){
                cc = c;
                break;
            }
        }
        return cc;
    }

    public boolean excluir(String CPF){
        Cliente c = buscar(CPF);
        if(c!=null){
            this.lContas.remove(c);
            return true;
        }
        else return false;
    }
}