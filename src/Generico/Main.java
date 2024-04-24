package Generico;

import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V3.ClienteRepository;
import entidades.Cliente;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Crear una instancia de ClienteRepository
        ClienteRepository clienteRepository = new ClienteRepository();

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("001", "Juan", "Calle Principal 123", "12345678A", new ArrayList<>());
        Cliente cliente2 = new Cliente("002", "María", "Avenida Central 456", "87654321B", new ArrayList<>());

        // Guardar los clientes en el repositorio
        clienteRepository.save(cliente1);
        clienteRepository.save(cliente2);

        // Listar todos los clientes
        List<Cliente> todosLosClientes = clienteRepository.findAll();
        System.out.println("Todos los clientes:");
        for (Cliente cliente : todosLosClientes) {
            System.out.println(cliente.getCodigoCliente() +" "+ cliente.getNombre());
        }

        // Crear una instancia de ClienteRepository
        ClienteRepository clienteRepository2 = new ClienteRepository();
        // Listar todos los clientes
        List<Cliente> todosLosClientes2 = clienteRepository2.findAll();
        System.out.println("Todos los clientes:");
        for (Cliente cliente : todosLosClientes2) {
            System.out.println(cliente.getCodigoCliente() +" "+ cliente.getNombre());
        }

    }

}