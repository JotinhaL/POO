import java.util.Date;

public class Gerente extends Funcionario{
    private Date dataIng;
    private Agencia agencia;
    private Boolean cursado;
    public static float bonificacao;

    public Gerente() {
        this("",null,"","",null,null,false);
    }

<<<<<<< HEAD
    public Gerente(String nome, Endereco endereco, String CPF, String CTPS, Float salario, Date dataIng, Agencia agencia, Boolean cursado) {
        this.nome = nome;
=======
    public Gerente(String name, Endereco endereco, String CPF, String CTPS, Date dataIng, Agencia agencia, Boolean cursado) {
        this.name = name;
>>>>>>> fda0c7f26194aec5c8be3697120a631ff9c9b5b6
        this.endereco = endereco;
        this.setCPF(CPF);
        this.CTPS = CTPS;
        this.dataIng = dataIng;
        this.agencia = agencia;
        this.cursado = cursado;
    }

    public Date getDataIng() {
        return dataIng;
    }

    public void setDataIng(Date date) {
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

	public static void setBonificacao(float bon){
		this.bonificacao = bon;
	}

	public static float getBonificacao(){
		return this.bonificacao;
	}

}
