package OrientacaoAOObjeto.Exercicios;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    // Setters com validações
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
        } else {
            this.nome = nome;
        }
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Erro: Nota deve estar entre 0 e 10!");
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Erro: Nota deve estar entre 0 e 10!");
        }
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            System.out.println("Erro: Nota deve estar entre 0 e 10!");
        }
    }

    // Método para calcular média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar aprovação
    public boolean verificarAprovacao() {
        return calcularMedia() >= 7;
    }

    // Método para exibir situação
    public void exibirSituacao() {
        double media = calcularMedia();
        boolean aprovado = verificarAprovacao();

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + String.format("%.2f", media));

        if (aprovado) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println("----------------------");
    }
}