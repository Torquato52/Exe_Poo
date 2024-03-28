import Ex_1.Circulo;
import Ex_1.ContaBancaria;
import Ex_1.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo cir = new Circulo(3);
        System.out.println(cir.getPerimetro());

        ContaBancaria cont = new ContaBancaria(1, "pedro", 200);
        cont.realizaDeposito(200);
        cont.realizaSaque(50);

        Funcionario func = new Funcionario();
        func.setNome("pedro");
        func.setSalario(2000.00);
        func.setCargo("programador");
        double salarioLiquido = func.getSalarioLiquido(100.00, 200.00);
        System.out.println("nome: " + func.getNome());
        System.out.println("cargo: " + func.getCargo());
        System.out.println("salario liquido: R$" + salarioLiquido);
    }
}