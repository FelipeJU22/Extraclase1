package Main;

public class EstudianteTipoA extends Informacion {
    /**
     * Aquí se está aplicando la herencia, siendo clase hija
     */
    public EstudianteTipoA(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                           Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3, String notaPA, String notaPB, Integer notaFinal) {
        super(carne, nombre, correo, telefono, nick, tipo_estudiante, examen_promedio, quiz_promedio, tarea_promedio, proyecto1, proyecto2, proyecto3,notaPA, notaPB, notaFinal);
    }

    @Override
    /**
     * Se utiliza el concepto de sobreescritura
     */
    public String nota() {
        /**
         * Se utiliza el concepto de polimorfismo
         */
        Integer promedioA = 0;

        promedioA = (getExamen_promedio() + getQuiz_promedio() + getTarea_promedio()) / 6;
        setNotaPA(Integer.toString(promedioA));
        return Integer.toString(promedioA);
    }

    public Integer nota_final() {
        Integer resultado = 0;
        resultado = getExamen_promedio() + getQuiz_promedio() + getTarea_promedio();
        return resultado;
    }
}