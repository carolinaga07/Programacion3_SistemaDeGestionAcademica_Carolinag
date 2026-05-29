public class Materia  {
    private int Codigo;
    private String Nombre;
    private int cantidadCreditos;
    
    public Materia(int codigo, String nombre, int cantidadCreditos) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.cantidadCreditos = cantidadCreditos;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public void MostrarInfo(){
        System.out.println("========================");
        System.out.println("       INFORMACION:     ");
        System.out.println("========================");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Codigo:" + getCodigo());
        System.out.println("Creditos:" + getCantidadCreditos());
    }

    



    

    
}
