package proyectovehiculomain;

import Controlador.ControladorUsuVehi;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException {
            ControladorUsuVehi objControlador = new ControladorUsuVehi();
            objControlador.iniciarVista();
    }
    
}