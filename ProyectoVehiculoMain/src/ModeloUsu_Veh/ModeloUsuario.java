package ModeloUsu_Veh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModeloUsuario {
    String usuario;
    String url;
    String clave;
    Connection conex;

    public ModeloUsuario() {
        usuario = "root";
        url = "jdbc:mysql://localhost:3306/registrousuario";
        clave = "";
        conex = null;
    }

    public void hacerConexion() throws SQLException {
        conex = DriverManager.getConnection(url, usuario, clave);
        System.out.println("Conexión exitosa: " + conex);
    }
}