package OrientacaoAObjeto;

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador",3,false);
        meuCachorro.dormir();
        meuCachorro.acordar();
        meuCachorro.fazerAniversario();
        System.out.println("O Cachorro foi adicionado com sucesso!");
    }
}
