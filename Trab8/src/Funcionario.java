import meuPacote.ValidaCPF;

import java.util.Date;

public class Funcionario extends Pessoa {
    protected String CTPS;
    protected static Float salBase;
    protected Date dataAdm;
    protected String cargo;

    public Date getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(Date dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Funcionario() {
        this("","",null,"",
                "","",null,'\0',"",null,"");
    }

    public Funcionario(String CPF, String nome, Endereco endereco, String estCivil,
                       String escolaridade, String telefone, Date dataNasc, char sexo, String CTPS,
                       Date dataAdm, String cargo) {
        super(CPF, nome, endereco, estCivil, escolaridade, telefone, dataNasc, sexo);
        this.CTPS = CTPS;
        this.dataAdm = dataAdm;
    }

    public static Float getSalBase() {
        return salBase;
    }

    public static void setSalBase(Float salBase) {
        Funcionario.salBase = salBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if (ValidaCPF.isCPF(CPF) == true) {
            this.CPF = CPF;
        }
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "CTPS='" + CTPS + '\'' +
                ", dataAdm=" + dataAdm +
                ", cargo='" + cargo + '\'' +
                ", CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", estCivil='" + estCivil + '\'' +
                ", escolaridade='" + escolaridade + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNasc=" + dataNasc +
                ", sexo=" + sexo +
                '}';
    }

    public float calcSalario(){
        return salBase;
    }
    
    @Override
    public void mostraDados() {
        System.out.println(toString());
    }
}