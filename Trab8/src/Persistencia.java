import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persistencia implements salvador{
    
    public void salvar(String arq, Object o){
	try{
            FileOutputStream out = new FileOutputStream(arq);
            ObjectOutputStream eObj = new ObjectOutputStream(out);
            eObj.writeObject(o);
	}
	catch (FileNotFoundException e){
            System.out.println(e.getMessage());
	}
	catch (IOException e){
            System.out.println(e.getMessage());
	}
    }
}
