package OrientacaoAOObjeto.Exercicios;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produtos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco <= 0){
            System.out.println("o valor não pode ser negativo");
        }
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {

        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque <= 0){
            System.out.println("A quantidade de podutos não pode ser negativo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void  exibirInformacoes(){
        getNome();
        getPreco();
        getQuantidadeEstoque();
    }


}
