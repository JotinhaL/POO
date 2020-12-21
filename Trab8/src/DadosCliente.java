import java.util.List;
import java.util.ArrayList;

public class DadosCliente{
	private List<Cliente> lClientes;

	DadosCliente(){
		lClientes = new ArrayList<Cliente>();
	}

	public void cadastrar(Cliente c){
		this.lClientes.add(c);
	}

	public void listar(){
		for(Cliente c: this.lClientes){
			c.mostraDados();
		}
	}

	public Cliente buscar(String CPF){
		Cliente cc= null;
		for(Cliente c: this.lClientes){
			if(c.getCPF().equals(CPF)){
				cc = c;
				break;
			}
		}
		return cc;
	}

	public boolean  excluir(String CPF){
		Cliente c = buscar(CPF);
		if(c!=null){
			this.lClientes.remove(c);
			return true;
		}
		else return false;
	}

    public List<Cliente> getlClientes() {
        return lClientes;
    }
        
        
}
