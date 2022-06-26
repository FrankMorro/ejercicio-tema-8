public class Main {
    public static void main(String[] args) {
        /*
            Para practicar la encapsulación:
            Crear clase Persona.
            Crear variables las privadas edad, nombre y telefono de la clase Persona.
            Crear gets y sets de cada propiedad.
            Crear un objeto persona en el main.
            Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola

         */

        Persona persona = new Persona();
        persona.setNombre("Johnny Martinez");
        persona.setEdad(48);
        persona.setTelefono("+58 414-306-8272");

        System.out.println("");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Núm. Teléfono: " + persona.getTelefono());

        System.out.println("");
        System.out.println("Excelente, ejercicio completado!");
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}