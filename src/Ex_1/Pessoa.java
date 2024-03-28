package Ex_1;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public Pessoa(){

    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();
        
        if (hoje.getMonthValue() < dataNascimento.getMonthValue() || 
            (hoje.getMonthValue() == dataNascimento.getMonthValue() && 
            hoje.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }
        
        return idade;
    }
}