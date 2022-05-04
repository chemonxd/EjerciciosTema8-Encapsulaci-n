import java.util.Scanner;

public class Tarea3CalsePersona {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("ingresa un nombre");
        persona.setNombre(entrada.nextLine());

        System.out.println("Introdice una edad");
        persona.setEdad(Integer.parseInt(entrada.next()));

        System.out.println("Introduce su número de teléfono");
        persona.setTelefono(entrada.next());

        System.out.println("El nombre es: "+persona.getNombre());
        System.out.println("La edad es: "+persona.getEdad());
        System.out.println("El teléfono es: "+persona.getTelefono());

    }

}

class Persona{
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
