public class Switch {
    /*
    * Por último, para el Switch, deberás crear
    * la variable estacion, y distintos case para
    * las cuatro estaciones del año. Dependiendo del valor
    * de la variable estacion se deberá mandar un mensaje
    * por consola informando de la estación en la que está.
    * También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
    public static void main(String[] args) {
        String estacion = "VERANO";
        switch (estacion.toUpperCase()) {
            case "PRIMAVERA":
                System.out.println("Estamos en primavera!");
                break;
            case "VERANO":
                System.out.println("Estamos en verano!");
                break;
            case "OTOÑO":
                System.out.println("Hace otoño!");
                break;
            case "INVIERNO":
                System.out.println("Que frío, estamos en invierno!!");
                break;
            default:
                System.out.println("SUS: Lo ingresado no es reconocido como una estación");
        }
    }

}
