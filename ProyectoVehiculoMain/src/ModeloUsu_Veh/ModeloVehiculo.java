package ModeloUsu_Veh;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ModeloVehiculo {
    String usuario;
    String url;
    String clave;
    Connection conex;

    public ModeloVehiculo() {
        usuario = "root";
        url = "jdbc:mysql://localhost:3306/registrousuario";
        clave = "";
        conex = null;
        try {
            hacerConexion();
        } catch (SQLException e) {
            System.err.println("Errorgogogogogogogogogogogo" + e.getMessage());
        }
    }

    public void hacerConexion() throws SQLException {
        if (conex == null || conex.isClosed()) {
            conex = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión bien  " + conex);
        }
    }
}