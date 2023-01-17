public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Juanito");
        persona.setTelefono("313231231");
        System.out.println("La persona se llama: "+persona.getNombre()+
                "\nTiene: "+persona.getEdad()+" años\ny su numero de telefono es: "+persona.getTelefono());
    }
}
