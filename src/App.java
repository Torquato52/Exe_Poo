import Ex_1.Circulo;
import Ex_1.ContaBancaria;
import Ex_1.Funcionario;
import Ex_1.Pessoa;
import Ex_1.Produto;

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

        Produto pro = new Produto();
        pro.setNome("pedro");
        pro.setPreco(20);
        pro.setQtdeEstoque(12);

        System.out.println("nome do produto: " + pro.getNome());
        System.out.println("preço do produto: R$" + pro.getPreco());
        System.out.println("quantidade em estoque: " + pro.getQtdeEstoque());

        Pessoa pes = new Pessoa();
        pes.setNome("pedro");
        pes.setDataNascimento(15, 9, 2000);
        pes.setProfissao("pedreiro");

        System.out.println("nome: " + pes.getNome());
        System.out.println("data: " + pes.getDataNascimento());
        System.out.println("profissao: " + pes.getProfissao());

    }
}