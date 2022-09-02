package Main;

import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.*;


public class MainController implements Initializable {
    private ObservableList<Informacion> estudiantes;
    private ArrayList<EstudianteTipoA> estudiantesA = new ArrayList<>();
    private ArrayList<EstudianteTipoB> estudiantesB = new ArrayList<>();
    private File archivo;
    @FXML
    private TableView<Informacion> Tabla;
    @FXML
    private TableColumn<Informacion, String> slotCarne;
    @FXML
    private TableColumn<Informacion, String> slotNombre;
    @FXML
    private TableColumn<Informacion, String> slotCorreo;
    @FXML
    private TableColumn<Informacion, String> slotTelefono;
    @FXML
    private TableColumn<Informacion, String> slotNick;
    @FXML
    private TableColumn<Informacion, String> slotTipoEs;
    @FXML
    private TableColumn<Informacion, Integer> slotPromedioE;
    @FXML
    private TableColumn<Informacion, Integer> slotPromedioQ;
    @FXML
    private TableColumn<Informacion, Integer> slotPromedioT;
    @FXML
    private TableColumn<Informacion, Integer> slotProyecto1;
    @FXML
    private TableColumn<Informacion, Integer> slotProyecto2;
    @FXML
    private TableColumn<Informacion, Integer> slotProyecto3;
    @FXML
    private TableColumn<Informacion, Integer> slotNotaA;
    @FXML
    private TableColumn<Informacion, Integer> slotNotaB;
    @FXML
    private TableColumn<Informacion, Integer> slotFinal;

    FileChooser seleccionador = new FileChooser();


    @FXML

    void getText(MouseEvent event) {
        File archivo = seleccionador.showOpenDialog(new Stage());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        estudiantes = FXCollections.observableArrayList();
        this.slotCarne.setCellValueFactory(new PropertyValueFactory<>("carne"));
        this.slotNombre.setCellValueFactory(new PropertyValueFactory<>("nombreApellidos"));
        this.slotCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        this.slotTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.slotNick.setCellValueFactory(new PropertyValueFactory<>("nickname"));
        this.slotTipoEs.setCellValueFactory(new PropertyValueFactory<>("tipoEstudiante"));
        this.slotPromedioE.setCellValueFactory(new PropertyValueFactory<>("notaPromedioE"));
        this.slotPromedioQ.setCellValueFactory(new PropertyValueFactory<>("notaPromedioQ"));
        this.slotPromedioT.setCellValueFactory(new PropertyValueFactory<>("notaPromedioT"));
        this.slotProyecto1.setCellValueFactory(new PropertyValueFactory<>("notaP1"));
        this.slotProyecto2.setCellValueFactory(new PropertyValueFactory<>("notaP2"));
        this.slotProyecto3.setCellValueFactory(new PropertyValueFactory<>("notaP3"));
        this.slotNotaA.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoA"));
        this.slotNotaB.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoB"));
        this.slotFinal.setCellValueFactory(new PropertyValueFactory<>("notaFinal"));


    }
    @FXML
    private void crearTabla() throws Exception{
        int variable = 1;
        int contador = 0;
        int A = 0;
        int B = 0;


        ArrayList<EstudianteTipoA> listaA = new ArrayList<>();
        ArrayList<EstudianteTipoB> listaB = new ArrayList<>();

        List<String> lista0 = new ArrayList<>();
        Scanner lectura = new Scanner(new File(String.valueOf(archivo)));
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
                            Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))," "," ",0));
                }

                else{
                    listaB.add(new EstudianteTipoB(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                            lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                            Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))," "," ",0));
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
                    Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))," "," ",0));
        }

        else{
            listaB.add(new EstudianteTipoB(lista0.get(0), lista0.get(1), lista0.get(2), lista0.get(3), lista0.get(4),
                    lista0.get(5), Integer.parseInt(lista0.get(6)), Integer.parseInt(lista0.get(7)), Integer.parseInt(lista0.get(8)),
                    Integer.parseInt(lista0.get(9)), Integer.parseInt(lista0.get(10)), Integer.parseInt(lista0.get(11))," "," ",0));
        }
        while(A < estudiantesA.size()){
            estudiantesA.get(A).nota();
            estudiantesA.get(A).nota_final();
            A++;
        }
        while(B < estudiantesB.size()){
            estudiantesB.get(B).nota_final();
            estudiantesB.get(B).nota();
            B++;
        }

        estudiantes.addAll(estudiantesA);
        estudiantes.addAll(estudiantesB);
        this.Tabla.setItems(estudiantes);
        lectura.close();
    }




}
