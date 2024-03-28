package Ex_1;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;
    private double salarioLiquido;

    public Funcionario() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public double getSalarioLiquido(double descontos, double beneficios) {
        double salarioLiquido = salario - descontos + beneficios;
        
        if (salarioLiquido < 1412.00) {
            salarioLiquido = 1412.00;
        }

        return salarioLiquido;
    }
}
