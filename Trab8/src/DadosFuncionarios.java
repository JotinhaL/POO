
import java.util.ArrayList;
import java.util.List;

public class DadosFuncionarios {
    List<Funcionario> lFuncionario;
    
    public DadosFuncionarios(){
        this.lFuncionario = new ArrayList<Funcionario>();
    }
    
    public void cadastrar(Funcionario f){
        this.lFuncionario.add(f);
    }
    
    public void listar(){
        for(Funcionario c: this.lFuncionario){
            c.mostraDados();
        }
    }
    
    public Funcionario buscar(String CPF){
	Funcionario ff= null;
	for(Funcionario f: this.lFuncionario){
            if(f.getCPF().equals(CPF)){
            ff = f;
            break;
            }
	}
        return ff;
    }
    
    public boolean  excluir(String CPF){
	Funcionario c = buscar(CPF);
	if(c!=null){
            this.lFuncionario.remove(c);
            return true;
	}
	else return false;
    }

    public List<Funcionario> getlFuncionario() {
        return lFuncionario;
    }
}
