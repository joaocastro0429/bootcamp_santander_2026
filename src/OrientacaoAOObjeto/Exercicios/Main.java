package OrientacaoAOObjeto.Exercicios;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", 8.5, 7.0, 9.0);

        System.out.println("=== SITUAÇÃO INICIAL ===");
        aluno.exibirSituacao();

        // Alterando uma das notas
        System.out.println("=== ALTERANDO NOTA 2 ===");
        aluno.setNota2(5.0);
        aluno.exibirSituacao();

        // Testando validações
        System.out.println("=== TESTANDO VALIDAÇÕES ===");
        aluno.setNome("");  // Deve mostrar erro
        aluno.setNota1(15); // Deve mostrar erro
        aluno.setNota1(-3); // Deve mostrar erro
    }
}
