package planernutricional;
// Clase que maneja los datos locales

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalDataHandler {

    static final String NOMBREARCHIVO = "food_ids.dat";

    // Se generan objetos para los archivos
    static File fichero = new File(NOMBREARCHIVO);
    static RandomAccessFile archivo;
    static final byte TAMANO = 102; // Tamaño de registro

    int reg, posicion, registro;
    long tamanoArchivo;

    public void LocalDataHandeler() {
        try {
            reg = 0; // Numero del registro
            tamanoArchivo = 0; //

            archivo = new RandomAccessFile(fichero, "rw"); // Se instancia el archivo, hay 2 modos, "r" o read, y "rw" o read & write
            posicion = (archivo.length() == 0) ? 0 : (int) archivo.length() - TAMANO; // Posicion  -> total de bytes por registro

            archivo.seek(posicion); // Se posiciona en el registro correspondiente
            registro = (archivo.length() == 0) ? 0 : archivo.readInt(); // Se almacena el numero de registro de la ultima pos

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ingresarID(String food_id, String nombre) {
        try {
            // Incremento el registro y arreglo los datos
            registro++;
            food_id = (food_id.length() < 8) ? food_id + " ".repeat(7 - food_id.length()) : "errorFood_id";
            nombre = (nombre.length() < 30) ? nombre + " ".repeat(29 - food_id.length()) : "errorNombre";
            
            // Se abre el fichero para saber el tamano de este
            archivo = new RandomAccessFile(fichero, "r");
            tamanoArchivo = archivo.length();
            archivo.close();
            
            // Se ingresan los datos
            archivo = new RandomAccessFile(fichero, "rw");
            archivo.seek(tamanoArchivo);
            archivo.writeInt(registro);
            archivo.writeUTF(food_id);
            archivo.writeUTF(nombre);
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean existeID(String food_id){
        try {
            int total = 0;
            archivo = new RandomAccessFile(fichero, "r");
            food_id = (food_id.length() < 8) ? food_id + " ".repeat(7 - food_id.length()) : "errorFood_id";
            
            for (int i = 1; i < (archivo.length()/20+1); i++) {
                archivo.seek(TAMANO * (i - 1));
                archivo.readInt();
                
                String idEncontrado = archivo.readUTF();
                if (idEncontrado.equals(food_id)){
                    return true;
                } else {
                    total++;
                }
            }
            if (total == (archivo.length()/TAMANO)){
                System.out.println("No existe el id en el fichero");
                return false;
            }
            
            archivo.close();
        } catch (Exception e) {
            Logger.getLogger(LocalDataHandler.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

}
