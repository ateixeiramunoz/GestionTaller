package Generico;

import DATA_FRAMEWORK_OK.AlmacenDeDatos;
import Herramientas.HerramientasCliente;
import Herramientas.Navegacion;
import entidades.Cliente;
import entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setCodigoCliente("8888x");
        cliente1.setDni("12121211A");
        cliente1.setDireccion("Moncloa");
        cliente1.setNombre("Pedro");
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMarca("FORD");
        vehiculo1.setModelo("FOCUS");
        vehiculo1.setColor("MORADO");
        vehiculo1.setMatricula("123123F");

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(vehiculo1);
        cliente1.setVehiculos(vehiculos);
        //Guardar clientes
        AlmacenDeDatos.getClienteRepository().save(cliente1);

        HerramientasCliente herramientasCliente = new HerramientasCliente();
        String respuesta="";
        while (!respuesta.equalsIgnoreCase("x"))
        {
            Navegacion.mostrarMenuPrincipal();
            respuesta = Navegacion.leerRespuesta();
            if(respuesta.equalsIgnoreCase("1"))
            {
                Navegacion.mostrarMenuCliente();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasCliente.registroCliente();
                        break;
                    case  "2":
                        herramientasCliente.modificarCliente();
                        break;
                    case  "3":
                        herramientasCliente.eliminarCliente();
                        break;
                    case  "4":
                        herramientasCliente.muestraInfoCliente();
                        break;
                    case  "5":
                        herramientasCliente.listarClientes();
                        break;
                }
            }
            else if (respuesta.equalsIgnoreCase("2"))
            {
                Navegacion.mostrarMenuVehiculo();
                respuesta = Navegacion.leerRespuesta();
            }
        }
        if (respuesta.equalsIgnoreCase("x"))
        {
            System.exit(0);
        }

    }

}