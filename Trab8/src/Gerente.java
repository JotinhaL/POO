import meuPacote.ValidaCPF;
import java.util.Date;

public class Gerente extends Funcionario{
    private Date dataIng;
    private Agencia agencia;
    private Boolean cursado;
    public static float bonificacao;

    public Gerente() {
        this("",null,"","",0.0f,null,null,false);
    }

    public Gerente(String name, Endereco endereco, String CPF, String CTPS, Float salario, Date dataIng, Agencia agencia, Boolean cursado) {
        this.name = name;
        this.endereco = endereco;
        this.setCPF(CPF);
        this.CTPS = CTPS;
        this.salario = salario;
        this.dataIng = dataIng;
        this.agencia = agencia;
        this.cursado = cursado;
    }

    public Date getDate() {
        return dataIng;
    }

    public void setDate(Date date) {
        this.dataIng = date;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Boolean getCursado() {
        return cursado;
    }

    public void setCursado(Boolean cursado) {
        this.cursado = cursado;
    }

}