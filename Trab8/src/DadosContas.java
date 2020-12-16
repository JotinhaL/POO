import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DadosContas implements salvador{
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
    
    public void salvar(String arq){
		try{
			FileOutputStream out = new FileOutputStream(arq);
			ObjectOutputStream eObj = new ObjectOutputStream(out);
			eObj.writeObject(this.lContas);
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}