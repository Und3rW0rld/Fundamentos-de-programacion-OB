/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta
nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades
la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(24);
        cliente.setNombre("Sopi");
        cliente.setTelefono("21231231231");
        cliente.setCredito("Un Credito SuS");
        System.out.println("El cliente se llama: " +cliente.getNombre()+"\n"
                +"Tiene: "+cliente.getEdad()+" años"+"\n"+
                "Con número de teléfono: "+cliente.getTelefono()+"\n"+
                "Y credito: "+cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(27);
        trabajador.setNombre("UnderWorld");
        trabajador.setTelefono("212312331231");
        trabajador.setSalario("2000 DlS");
        System.out.println("El trabajador se llama: " +trabajador.getNombre()+"\n"
                +"Tiene: "+trabajador.getEdad()+" años"+"\n"+
                "Con número de teléfono: "+trabajador.getTelefono()+"\n"+
                "Y salario: "+trabajador.getSalario());

    }

}

