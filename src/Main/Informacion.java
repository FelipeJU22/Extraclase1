package Main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class Informacion { //Clase Padre //También es lo abstracto para crear las subclases
    private String carne;
    private String nombre;
    private String correo;
    private String telefono;
    private String nick;
    private String tipo_estudiante;
    private Integer examen_promedio;
    private Integer quiz_promedio;
    private Integer tarea_promedio;
    private Integer proyecto1;
    private Integer proyecto2;
    private Integer proyecto3;


    public Informacion(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                       Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3) {
        this.carne = carne;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nick = nick;
        this.tipo_estudiante = tipo_estudiante;
        this.examen_promedio = examen_promedio;
        this.quiz_promedio = quiz_promedio;
        this.tarea_promedio = tarea_promedio;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.proyecto3 = proyecto3;
    }

    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }


    public String getTelefono() {
        return telefono;
    }

    public String getNick() {
        return nick;
    }


    public String getTipo_estudiante() {
        return tipo_estudiante;
    }


    public Integer getExamen_promedio() {
        return examen_promedio;
    }



    public Integer getQuiz_promedio() {
        return quiz_promedio;
    }



    public Integer getTarea_promedio() {
        return tarea_promedio;
    }



    public Integer getProyecto1() {
        return proyecto1;
    }



    public Integer getProyecto2() {
        return proyecto2;
    }


    public Integer getProyecto3() {
        return proyecto3;
    }



    public abstract double nota();

    public double nota_final(){
        double nota_estudiante = 0.0;
        nota_estudiante = getExamen_promedio() + getQuiz_promedio() + getTarea_promedio();
        return nota_estudiante;
    }

    public static void Main(String[] args) throws Exception {
        int contador = 0;
        int variable = 1;

        ArrayList<EstudianteTipoA> listaA = new ArrayList<>();
        ArrayList<EstudianteTipoB> listaB = new ArrayList<>();
        List<String> lista0 = new ArrayList<>();
        //String archivo = MainController.arch;
        Scanner lectura = new Scanner(new File("C:\\Users\\Yoshant\\Desktop"));
        lectura.useDelimiter("[,:\r\n]+");
        while (lectura.hasNext()){
            if (variable <= 1 ){
                lectura.nextLine();
                variable++;
            }
            if (contador == 12) {
                if (Objects.equals(lista0.get(5), "A")){
                    listaA.add(new EstudianteTipoA(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                            lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                            Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))));
                    }

                else{
                    listaB.add(new EstudianteTipoB(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                            lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                            Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))));
                }
                lista0.clear();
                contador = 0;
                lectura.nextLine();
            } else {
                lista0.add(lectura.next());
                contador++;
            }
        }
        if (Objects.equals(lista0.get(5), "A")){
            listaA.add(new EstudianteTipoA(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                    lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                    Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))));
        }

        else{
            listaB.add(new EstudianteTipoB(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                    lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                    Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))));
        }
        lectura.close();
    }

}



