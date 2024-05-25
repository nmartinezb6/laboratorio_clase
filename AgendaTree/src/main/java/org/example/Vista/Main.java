import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Mario", 123456789L, "mario@example.com", LocalDate.of(1981, 7, 9));
        agenda.agregarContacto("Link", 987654321L, "link@example.com", LocalDate.of(1986, 2, 21));
        agenda.agregarContacto("Peach", 456789123L, "peach@example.com", LocalDate.of(1985, 10, 18));

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Link:");
        Contacto contacto = agenda.buscarContacto("Link");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono() +
                    ", Correo Electrónico: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println("\nEliminando el contacto de Peach.");
        agenda.eliminarContacto("Peach");

        // Mostrar contactos después de la eliminación
        System.out.println("Contactos en la agenda después de eliminar a Peach:");
        agenda.mostrarContactos();
    }
}
