package ec.edu.intsuperior.modelo;


public class Cliente extends Persona{
    String idCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String ci, String apellido1, String apellido2, String nombre1, String nombre2, String direccion, String correo, String celular, String fechaNacimiento) {
        super(ci, apellido1, apellido2, nombre1, nombre2, direccion, correo, celular, fechaNacimiento);
        this.idCliente = idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
   }
}