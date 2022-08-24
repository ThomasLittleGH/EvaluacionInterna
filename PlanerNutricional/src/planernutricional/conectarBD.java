package planernutricional;
// clase que permite realizar la coneccin a la base de datos

// se importan biblioteccas necesarias para la conexion
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conectarBD {

    Connection conectar = null;
    public List<Usuarios> arregloUsuarios = new ArrayList<>();
    public List<Alimentos> arregloAlimentos = new ArrayList<>();
    public List<MetasNutricional> arregloMetasNutricionales = new ArrayList<>();
    machineID identificante;

    public Connection conexion() {
        // Metodo que establece la conexion con la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // El orden de objeto es: drive + servidor + puerto + Bd + user + clave
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd_nutricion", "admin", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }

    public void crearArrayUsuarios() {
        // Metodo que crea un arreglocon los usuarios en la base de dato
        identificarID();
        arregloUsuarios.clear();
        try {
            Statement st = conectar.createStatement(); //obj para realiza la conexion
            ResultSet rs = st.executeQuery("SELECT * from user");
            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setMachine_id(rs.getString(3));
                usuario.setSelected_food_ids(rs.getString(4));
                usuario.setPeso(rs.getFloat(5));
                usuario.setPeriodo(rs.getInt(6));
                usuario.setCalorias(rs.getFloat(7));
                usuario.setProteinas(rs.getFloat(8));
                usuario.setCarbohidratos(rs.getFloat(9));
                usuario.setVit_a(rs.getFloat(10));
                usuario.setVit_c(rs.getFloat(11));
                usuario.setVit_k(rs.getFloat(12));
                usuario.setFibra(rs.getFloat(13));
                usuario.setCalcio(rs.getFloat(14));

                if (identificante.checkSameOS(usuario.getMachine_id())) {
                    arregloUsuarios.add(usuario);
                }
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ACTUALIZAR
    public void crearArrayAlimentos() {
        // Metodo que crea un arreglo con la informacion de los alimentos utilizando losdatos de la base de datos
        arregloAlimentos.clear();
        try {
            Statement st = conectar.createStatement(); //obj para realiza la conexion
            ResultSet rs = st.executeQuery("SELECT * from alimentos");
            while (rs.next()) {
                Alimentos Alimento = new Alimentos();
                Alimento.setId(rs.getInt(1));
                Alimento.setNombre(rs.getString(2));
                Alimento.setCalorias(rs.getFloat(3));
                Alimento.setProteinas(rs.getFloat(4));
                Alimento.setCarbohidratos(rs.getFloat(5));
                Alimento.setVit_a(rs.getFloat(6));
                Alimento.setVit_c(rs.getFloat(7));
                Alimento.setVit_k(rs.getFloat(8));
                Alimento.setFibra(rs.getFloat(9));
                Alimento.setCalcio(rs.getFloat(10));
                arregloAlimentos.add(Alimento);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearArrayDatosNutricionales() {
        // Metodo que crea un arreglo que contiene las metas de cada usuario con la informacion almacenada en la base de datos.
        arregloMetasNutricionales.clear();
        try {
            Statement st = conectar.createStatement(); //obj para realiza la conexion
            ResultSet rs = st.executeQuery("SELECT * from nutritionValues");
            while (rs.next()) {
                MetasNutricional metaNutricion = new MetasNutricional();
                metaNutricion.setId(rs.getInt(1));
                metaNutricion.setCalorias(rs.getFloat(2));
                metaNutricion.setProteinas(rs.getFloat(3));
                metaNutricion.setCarbohidratos(rs.getFloat(4));
                metaNutricion.setVit_a(rs.getFloat(5));
                metaNutricion.setVit_c(rs.getFloat(6));
                metaNutricion.setVit_k(rs.getFloat(7));
                metaNutricion.setFibra(rs.getFloat(8));
                metaNutricion.setCalcio(rs.getFloat(9));
                arregloMetasNutricionales.add(metaNutricion);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR- No se pueden crear los botones");
        }
    }

    public void identificarID() {
        identificante = new machineID();
        try {
            identificante.identificarOS();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
