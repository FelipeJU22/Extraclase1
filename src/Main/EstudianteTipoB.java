package Main;

public class EstudianteTipoB extends Informacion{
    public EstudianteTipoB(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                           Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3) {
        super(carne, nombre, correo, telefono, nick, tipo_estudiante, examen_promedio, quiz_promedio, tarea_promedio, proyecto1, proyecto2, proyecto3);
    }

    @Override
    public double nota() {
        double promedioB = 0.0;

        promedioB = (getProyecto1()+getProyecto2()+getProyecto3())/3.0;
        return promedioB;
    }
}
