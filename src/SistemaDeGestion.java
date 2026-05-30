import java.util.ArrayList;

public class SistemaDeGestion {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Materia> materias = new ArrayList<>();

    public void RegistrarE (Estudiante e){
        estudiantes.add(e);
        System.out.println("Estudiante Registrado!!");
    }

    public void RegistrarM (Materia m){
        materias.add(m);
        System.out.println("Materia Registrada!!");
    }

    public void RegistrarP(Profesor p){
        profesores.add(p);
        System.out.println("Profesor Registrado!!");
    }

    public Estudiante BuscarPorMatricula (String matricula){

        for (int i = 0; i < estudiantes.size(); i++){
            Estudiante e = estudiantes.get(i);
            if(e.getMatricula().equalsIgnoreCase(matricula)){
                return e;
            }
        }
        return null;

    }
    

    public Materia BuscarPorCodigo (String codigo){

        for (int i = 0; i < materias.size(); i++){
            Materia m = materias.get(i);
            if(m.getCodigo().equalsIgnoreCase(codigo)){
                return m;
            }
        }
        return null;

    }

    public void MostrarEstudiante(){

        for (int i = 0; i < estudiantes.size(); i++){
            Estudiante e = estudiantes.get(i);
            e.MostrarInformacion();
        }

    }

    public void MostrarMateria(){

        for (int i = 0; i < materias.size(); i++){
            Materia m = materias.get(i);
            m.MostrarInfo();
        }

    }

    public void Promedios(){
        System.out.println("======================");
        System.out.println(" REPORTE DE PROMEDIOS ");
        System.out.println("======================");

        for(int i = 0; i < estudiantes.size(); i++){
            Estudiante e = estudiantes.get(i);
            double Promedio = e.CalcularPromedio();
            String Estado = (Promedio >= 60) ? "APROBADO" : "REPROBADO";
            System.out.printf("%-20s / Promedio: %5.2f  / %s%n" ,
            e.getNombre() + " " + e.getApellido(), Promedio, Estado);
            
        }
    }

    public void AsignarMateria(String matricula, String codigo){
        Estudiante e = BuscarPorMatricula(matricula);
        Materia m = BuscarPorCodigo(codigo);

        if ( e == null || m == null){
            System.out.println("No encontrado");
            return;
        }

        e.AgregarMateria(m);
        System.out.println("Materia Asignada!!");
        
    }

    public void RegistrarCalificacion (String matricula, String codigo, double nota){
        Estudiante e = BuscarPorMatricula(matricula);
        Materia m = BuscarPorCodigo(codigo);

        if ( e == null || m == null){
            System.out.println("No encontrado");
            return;
        }

        e.AgregarCalificacion(new Calificacion(m, nota));
        System.out.println("Calificacion Registrada!!");
        
    }


}
