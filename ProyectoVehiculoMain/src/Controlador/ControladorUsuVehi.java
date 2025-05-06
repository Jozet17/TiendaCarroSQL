package Controlador;

import RegistroUsuario.VistaUsuario;
import RegistroVehiculo.VistaVehiculo;
import ModeloUsu_Veh.ModeloUsuario;
import ModeloUsu_Veh.ModeloVehiculo;
import java.sql.SQLException;

public class ControladorUsuVehi {
    private VistaUsuario objVista;
    private VistaVehiculo objVehiculo;
    private ModeloUsuario objUsuario;
    private ModeloVehiculo objModelo;

    // Datos del usuario y vehículo
    private String nombre;
    private String cedula;
    private String contraseña;
    private String serial;
    private int idMarca;
    private String combustible;
    private String caracteristicas;

    public ControladorUsuVehi() {
        objUsuario = new ModeloUsuario();
        objModelo = new ModeloVehiculo();
    }
    
    public ControladorUsuVehi(String nombre, String cedula, String contraseña) {
        this();
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }
    
    public ControladorUsuVehi(String nombre, String serial, int idMarca, String combustible, String caracteristicas) {
        this();
        this.nombre = nombre;
        this.serial = serial;
        this.idMarca = idMarca;
        this.combustible = combustible;
        this.caracteristicas = caracteristicas;
    }

    public void iniciarVista() throws SQLException {
        objVista = new VistaUsuario();
        objVista.setVisible(true);
        objUsuario.hacerConexion();
        objModelo.hacerConexion();}
    }
