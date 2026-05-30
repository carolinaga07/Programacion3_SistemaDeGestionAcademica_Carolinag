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


}
