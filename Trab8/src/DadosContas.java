import java.util.List;
import java.util.ArrayList;

public class DadosContas{
    private List<Conta> lContas;

    DadosContas(){
        lContas = new ArrayList<Conta>();
    }

    public void cadastrar(Conta c){
        this.lContas.add(c);
    }

    public void listar(){
        for(Conta c: this.lContas){
            c.mostraDados();
        }
    }

    public Conta buscar(int nmr){
        Conta cc= null;
        for(Conta c: this.lContas){
            if(c.getNumero()==nmr){
                cc = c;
                break;
            }
        }
        return cc;
    }

    public boolean excluir(int nmr){
        Conta c = buscar(nmr);
        if(c!=null){
            this.lContas.remove(c);
            return true;
        }
        else return false;
    }

    public List<Conta> getlContas() {
        return lContas;
    }
    
}