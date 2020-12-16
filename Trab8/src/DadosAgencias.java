import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DadosAgencias implements salvador{
	private List<Agencia> lAgencias;

	 DadosAgencias(){
		lAgencias = new ArrayList();
	}
	
	public void cadastrar(Agencia a){
		this.lAgencias.add(a);
	}
	
	public void listar(){
		for(Agencia a: this.lAgencias){
			a.mostraDados();
		}
	}
	public Agencia buscar(int nro){
		Agencia aa = null;
		for(Agencia a: this.lAgencias){
			if(a.getNumero() == nro){
				aa = a;
				break;
			}
		}
		 return aa;
}
	public boolean excluir(int nro){
		Agencia a = buscar(nro);
		if(a!=null){
			this.lAgencias.remove(a);
			return true;
		}
		else return false;
	}

	public void salvar(String arq){
		try{
			FileOutputStream out = new FileOutputStream(arq);
			ObjectOutputStream eObj = new ObjectOutputStream(out);
			eObj.writeObject(this.lAgencias);
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}
