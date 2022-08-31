package Main;

public class EstudianteTipoA extends Informacion{ //Aquí se está aplicando la herencia, siendo clase hija
    public EstudianteTipoA(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                           Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3) {
        super(carne, nombre, correo, telefono, nick, tipo_estudiante, examen_promedio, quiz_promedio, tarea_promedio, proyecto1, proyecto2, proyecto3);
    }

    @Override //Se utiliza el concepto de sobreescritura
    public double nota() { //Se utiliza el concepto de polimorfismo
        double promedioA = 0.0;

        promedioA = (getExamen_promedio()+getQuiz_promedio()+getTarea_promedio())/3.0;
                return promedioA;
    }
