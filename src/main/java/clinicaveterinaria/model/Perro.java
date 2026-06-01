package clinicaveterinaria.model;


public class Perro extends Animal implements IAnimalCaminar, IAnimalNadar {
    public Perro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PERRO);
    }

    @Override
    public void caminar() {
        System.out.println("El perro esta caminando");
    }
    @Override
    public void nadar(){
        System.out.println("El perro esta nadando");
    }
}
