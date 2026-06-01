package OrientacaoAObjeto;

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador",3,false);
        CachorroRecord meuCachorro2 =
                new CachorroRecord("viralata1", "viralata", 3);

        System.out.println(meuCachorro2.nome());
        System.out.println(meuCachorro2.descricaoCompleta());
        meuCachorro.acordar();
        meuCachorro.fazerAniversario();
        System.out.println("O Cachorro foi adicionado com sucesso!");
    }
}
