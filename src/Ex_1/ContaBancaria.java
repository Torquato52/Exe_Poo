package Ex_1;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(int numeroConta, String nome, double saldo){
        this.saldo = saldo;
    }

    public void realizaDeposito(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.\n saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void realizaSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.\n saldo: "+saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }
    
}