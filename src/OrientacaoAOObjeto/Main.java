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

        System.out.println();
        System.out.println("Exemplo de polimorfismo:");
        Animal2[] animais = {
            new Cachorro2("Bolt"),
            new Gato2("Mia")
        };

        for (Animal2 item : animais) {
            item.fazerSom();
            item.dormir();
        }

        System.out.println();
        System.out.println("Segundo exemplo de polimorfismo: pagamentos");
        FormaPagamento[] pagamentos = {
            new Pix(150.0),
            new CartaoCredito(250.0),
            new Boleto(99.9)
        };

        for (FormaPagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
            pagamento.confirmar();
        }
    }
}
