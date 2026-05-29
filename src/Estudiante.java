public class Estudiante extends Persona{
    private int Matricula;
    private int Edad;
    private String Carrera;
    private String FechaDeInscripcion;
    
    public Estudiante(String nombre, String apellido, int matricula, int edad, String carrera,
            String fechaDeInscripcion) {
        super(nombre, apellido);
        Matricula = matricula;
        Edad = edad;
        Carrera = carrera;
        FechaDeInscripcion = fechaDeInscripcion;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getFechaDeInscripcion() {
        return FechaDeInscripcion;
    }

    public void setFechaDeInscripcion(String fechaDeInscripcion) {
        FechaDeInscripcion = fechaDeInscripcion;
    }

    @Override
    public void MostrarInformacion(){
        System.out.println("========================");
        System.out.println("       INFORMACION:     ");
        System.out.println("========================");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Apellido:" + getApellido());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Carrera:" + getCarrera());
    }
    
}