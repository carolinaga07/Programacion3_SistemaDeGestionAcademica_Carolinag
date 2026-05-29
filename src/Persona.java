public abstract class Persona {
    private String Nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido) {
        this.Nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public abstract void MostrarInformacion();

    
}
