import meuPacote.ValidaCPF;

public class Funcionario {
    protected String name;
    protected Endereco endereco;
    protected String CPF;
    protected String CTPS;
    protected Float salario;

    public Funcionario() {
        this("",null,"","",0f);
    }

    public Funcionario(String name, Endereco endereco, String CPF, String CTPS, Float salario) {
        this.name = name;
        this.endereco = endereco;
        this.setCPF(CPF);
        this.CTPS = CTPS;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if(ValidaCPF.isCPF(CPF) == true){
            this.CPF = CPF;
        }
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

}
