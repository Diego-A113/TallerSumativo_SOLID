package clinicaveterinaria.model;


public class Pez extends Animal implements IAnimalNadar {
    public Pez(int id, String nombre) {
        super(id, nombre, TipoAnimal.PEZ);
    }

    @Override
    public void nadar(){
        System.out.println("El pez esta nadando");
    }


}
