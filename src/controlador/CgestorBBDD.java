package controlador;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fran
 */
public class CgestorBBDD {

    private Connection conexion;

    /*
    CONSTRUCTOR
     */
    public CgestorBBDD() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");

        this.conexion = DriverManager.getConnection("jdbc:sqlite:evetask.db");
    }

    /**
     * Metodo que comprueba si existe el fichero base de datos y devuelve la
     * comprobacion
     *
     * @return boolean
     */
    public static boolean comprobarBBDDFile() {
        File archivo = new File("evetask.db");

        return archivo.exists();
    }

    /**
     * Metodo que crea el fichero junto con la estructua de la base de datos
     *
     * @throws java.sql.SQLException
     */
    public void crearArchivoBBDD() throws SQLException {
        String sql = "CREATE TABLE tarea "
                + "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + "nombre VARCHAR UNIQUE NOT NULL)";

        PreparedStatement estado = conexion.prepareStatement(sql);

        estado.execute();
        sql = "CREATE TABLE historial "
                + "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + "nombre VARCHAR NOT NULL,"
                + "fecha TEXT NOT NULL,"
                + "hora INTEGER NOT NULL,"
                + "minuto INTEGER NOT NULL)";
        
        estado = conexion.prepareStatement(sql);
        
        estado.execute();

    }

}
