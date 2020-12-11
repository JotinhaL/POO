import java.util.Date;
import meuPacote.ValidaCPF;

public abstract class Pessoa {
    protected String CPF;
    protected String nome;
    protected Endereco endereco;
    protected String estCivil;
    protected String escolaridade;
    protected String telefone;
    protected Date dataNasc;
    protected char sexo;

    public Pessoa() {
        this("","", null,null,"","",null,'\0');
    }

    public Pessoa(String CPF, String nome, Endereco endereco, String estCivil, String escolaridade, String telefone, Date dataNasc, char sexo) {
        this.setCPF(CPF);
        this.nome = nome;
        this.endereco = endereco;
        this.estCivil = estCivil;
        this.escolaridade = escolaridade;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(ValidaCPF.isCPF(CPF))this.CPF = CPF;
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

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}


