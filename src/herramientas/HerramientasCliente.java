package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Cliente;
import entidades.Vehiculo;

import java.util.*;

public class HerramientasCliente {

    public Cliente registroCliente()
    {
        Scanner s = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        List<Vehiculo> vehiculoList = new ArrayList<>();
        cliente1.setVehiculos(vehiculoList);

        System.out.println("Dime el codigo del cliente");
        String respuesta = s.next();
        cliente1.setCodigoCliente(respuesta);
        if (respuesta.equals("*")) {
            //throw new RuntimeException("Valor incorrecto para el campo nombre");
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.println("Dime el dni del cliente");
        respuesta = s.next();
        if (respuesta.length() !=10){
            throw new InputMismatchException("El Dni debe contener 10 caracteres");
        }else {
            cliente1.setDni(respuesta);
        }
        cliente1.setDni(respuesta);

        System.out.println("Dime la dirección del cliente");
        respuesta = s.next();
        cliente1.setDireccion(respuesta);

        System.out.println("Dime el nombre del cliente");
        respuesta = s.next();
        cliente1.setNombre(respuesta);

        System.out.println("Dime la edad del cliente");
        respuesta = s.next();
        cliente1.setEdad(Integer.valueOf(respuesta));

        return cliente1;
    }


    public Cliente modificarCliente() {
        Cliente cliente1 = new Cliente();
        System.out.println("MODIFICANDO CLIENTE");
        return cliente1;
    }

    public void eliminarCliente() {
        Cliente cliente1 = new Cliente();
        System.out.println("ELIMINANDO CLIENTE");
    }

    public void muestraInfoCliente() {

        System.out.println("Dime el codigo del cliente");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Cliente> cliente = AlmacenDeDatos.getClienteRepository().findById(id);
        if(cliente.isPresent())
        {
            System.out.println(cliente.get().getCodigoCliente());
            System.out.println(cliente.get().getNombre());
        }
        else {
            System.out.println("Cliente no encontrado");
        }
    }

    public void listarClientes() {
        List<Cliente> listaClientes = AlmacenDeDatos.getClienteRepository().findAll();
        System.out.println(listaClientes);
    }


}