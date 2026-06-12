package OrientacaoAOObjeto;

// Superclasse (Classe Pai)
class Animal2 {
    protected String nome;

    public Animal2(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("Algum som genérico...");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

// Subclasse (Classe Filha) - herda de Animal
class Cachorro2 extends Animal2 {

    public Cachorro2(String nome) {
        super(nome); // chama o construtor da classe pai
    }

    @Override // sobrescreve o método da classe pai
    public void fazerSom() {
        System.out.println(nome + " late: Au Au!");
    }

    // Método específico do Cachorro
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}

// Outra subclasse
class Gato2 extends Animal2 {

    public Gato2(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " mia: Miau!");
    }
}

