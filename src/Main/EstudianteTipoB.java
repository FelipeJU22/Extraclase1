package Main;

public class EstudianteTipoB extends Informacion{ //Aquí se está aplicando la herencia, siendo clase hija
    public EstudianteTipoB(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                           Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3) {
        super(carne, nombre, correo, telefono, nick, tipo_estudiante, examen_promedio, quiz_promedio, tarea_promedio, proyecto1, proyecto2, proyecto3);
    }

    @Override //Se utiliza el concepto de sobreescritura
    public double nota() { //Se utiliza el concepto de polimorfismo
        double promedioB = 0.0;

        promedioB = (getProyecto1()+getProyecto2()+getProyecto3())/3.0;
        return promedioB;
    }

    public double nota_final() {
        double resultado = 0.0;
        resultado = getExamen_promedio() + getQuiz_promedio() + getTarea_promedio();
        return resultado;
    }
}
