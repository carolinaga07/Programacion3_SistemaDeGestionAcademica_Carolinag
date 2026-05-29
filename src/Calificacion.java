public class Calificacion {

    private Materia materia;
    private double Nota;
   
    public Calificacion(Materia materia, double nota) {
        this.materia = materia;
        this.Nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double nota) {
        Nota = nota;
    }

    

    
    
}
