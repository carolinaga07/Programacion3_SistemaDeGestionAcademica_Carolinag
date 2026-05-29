public class Profesor extends Persona {
    private int Codigo;
    private String Especialidad;
    
    public Profesor(String nombre, String apellido, int codigo, String especialidad) {
        super(nombre, apellido);
        Codigo = codigo;
        Especialidad = especialidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    @Override
    public void MostrarInformacion(){
        
        System.out.println("========================");
        System.out.println("       INFORMACION:     ");
        System.out.println("========================");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Apellido:" + getApellido());
        System.out.println("Codigo:" + getCodigo());
        System.out.println("Especialidad:" + getEspecialidad());
    
    }

    
    
}
