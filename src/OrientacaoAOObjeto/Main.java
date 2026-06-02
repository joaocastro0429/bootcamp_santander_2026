package OrientacaoAOObjeto;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(3);

        Pessoa pessoa = new Pessoa("Maria", 25);

        Animal animal = new Animal();
        animal.setNome("Pingo");
        animal.setIdade(2);
        animal.setEspecie("Mamifero");

        System.out.println("Cachorro: " + cachorro.getNome() + ", idade: " + cachorro.getIdade());
        cachorro.latir();

        System.out.println("Animal: " + animal.getNome() + ", idade: " + animal.getIdade() + ", especie: " + animal.getEspecie());
        animal.latir();
        animal.emitirSom();

        pessoa.apresentar();
    }
}
