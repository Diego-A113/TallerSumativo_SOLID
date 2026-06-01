package clinicaveterinaria.model;


public class Gato extends Animal implements IAnimalCaminar {
    public Gato(int id, String nombre) {
        super(id, nombre, TipoAnimal.GATO);
    }

    @Override
    public void caminar() {
        System.out.printlm("El gato camina");
    }
}
