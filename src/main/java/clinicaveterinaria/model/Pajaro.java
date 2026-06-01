package clinicaveterinaria.model;


public class Pajaro extends Animal implements IAnimalVolar, IAnimalCaminar {
    public Pajaro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PAJARO);
    }

    @Override
    public void volar() {
        System.out.println("El pajaro esta volando");
    }
    @Override
    public void caminar(){
        System.out.println("El pajaro esta caminando")
    }
}
