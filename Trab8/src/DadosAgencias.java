import java.util.List;
import java.util.ArrayList;

public class DadosAgencias{
	private List lAgencias:

	 DadosAgencias(){
		lAgencias = new ArrayList():
	}
	
	public.void cadastrar(Agencia a){
		this.lAgencias.add(a):
	}
	
	public void listar(){
		for(Agencia a: this.lAgencias){
			a.mostraDados();
		}
	}
	public Agencia buscar(int nro){
		Agencia aa = null;
		for(Agencia a: this.lAgencias){
			if(a.getNro() == nro){
				aa = a;
				break;
			}
		}
		 return aa;
}
	public boolean  excluir(int nro){
		Agencia a = buscar(nro);
		if(a!=null){
			this.lAgencias.remove(a);
			return true;
		}
		else return false;
	}
}
