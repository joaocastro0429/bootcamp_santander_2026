package OrientacaoAObjeto;

public record CachorroRecord(String nome, String raca, int idade) {

    // Construtor canônico (valida os dados na criação)
    public CachorroRecord {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        // Não precisa de 'this.nome = nome'. A atribuição é automática no final.
    }

    // Você também pode adicionar métodos normais.
    public String descricaoCompleta() {
        return nome + " é um " + raca + " de " + idade + " anos.";
    }
}