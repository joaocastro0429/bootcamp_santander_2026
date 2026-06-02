package OrientacaoAOObjeto;

public class Animal extends Cachorro {
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void emitirSom() {
        System.out.println("Som de animal!");
    }
}
