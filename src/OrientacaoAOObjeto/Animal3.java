package OrientacaoAOObjeto;

public interface Animal3 {
    void emitirSom();
}

// Nota: Esta classe não pode ser pública se estiver no mesmo arquivo que uma interface pública
class Gato implements Animal3 {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}