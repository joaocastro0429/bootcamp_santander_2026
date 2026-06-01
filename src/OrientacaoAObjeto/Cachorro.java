package OrientacaoAObjeto;

public class Cachorro {
    String nome;
    String raca;
    int idade;
    boolean estaDormindo;


    public Cachorro(String nome, String raca, int idade, boolean estaDormindo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaDormindo = estaDormindo;
    }

    public void dormir(){
        System.out.println("Dormindo");
    }

    public  void acordar(){
        System.out.println("Acordando");
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.idade + " anos.");
    }
}
