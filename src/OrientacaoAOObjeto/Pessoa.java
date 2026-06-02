package OrientacaoAOObjeto;

public record Pessoa(String nome, int idade) {
    public void apresentar() {
        System.out.println("Pessoa: " + nome + ", idade: " + idade);
    }
}
