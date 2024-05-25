import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(String nombre, long telefono, String correoElectronico, LocalDate fechaNacimiento) {
        contactos.add(new Contacto(nombre, telefono, correoElectronico, fechaNacimiento));
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono() +
                    ", Correo Electrónico: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        }
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
        }
    }
}
