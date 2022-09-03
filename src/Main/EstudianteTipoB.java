package Main;
/**
 * Clase hija de Información, aquí va a correr sus propios métodos para calcular las notas
 */
public class EstudianteTipoB extends Informacion{
    /**
     * Aquí se está aplicando la herencia, siendo clase hija
     */
    public EstudianteTipoB(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                           Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3, String notaPA, String notaPB, Integer notaFinal) {
        super(carne, nombre, correo, telefono, nick, tipo_estudiante, examen_promedio, quiz_promedio, tarea_promedio, proyecto1, proyecto2, proyecto3,notaPA, notaPB, notaFinal);
    }

    @Override
    /**
     * Se utiliza el concepto de sobreescritura
     * Se hace el método para obtener la nota de tipo B
     * Se utiliza el concepto de polimorfismo
     * */
    public String nota() {
        Integer promedioB = 0;

        promedioB = (getProyecto1()+getProyecto2()+getProyecto3())/3;
        setNotaPB(Integer.toString(promedioB));
        return Integer.toString(promedioB);
    }
    /**
     * Se hace el método para obtener la nota final de los estudiantes B
     */
    public Integer nota_final() {
        Integer resultado = 0;
        resultado = (getExamen_promedio() + getQuiz_promedio() + getTarea_promedio() + (getProyecto1() + getProyecto2() + getProyecto3())/3)/4;
        setNotaFinal(resultado);
        return resultado;
    }
}
