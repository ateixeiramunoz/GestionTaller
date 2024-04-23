# APLICACIÓN DE GESTIÓN DE TALLER

##  Objetivos

### Introducción

El proyecto tiene como objetivo proporcionar el diseño para una aplicación de gestión de taller.

La aplicación deberá cumplir con los siguiente requisitos:

 - Gestión de Respuestos
 - Gestión de Clientes
 - Tipos de Servicios
 - Coste de los servicios
 - Proveedores
 - Tipos de vehículos
 - Horario
 - Vehículos En Reparación
 - Albaranes
 - Facturas



## ENTIDADES  DETECTADAS

 - Albarán
 - Cita
 - Cliente
 - Empleado
 - Factura
 - Instalación De Pieza
 - ~~Marca de Coche~~
 - ~~Marca de Repuesto~~
 - Pieza
 - Proveedor
 - Reparación
 - Servicio
 - Trabajo Realizado
 - Vehículo


## RELACIONES

 - Cliente posee Vehículo
 - Vehículo necesita pieza
 - Empleado atiende cliente
 - Proveedor entrega/provee repuesto
 - Empleado repara vehículo
 - Cliente solicita servicio
 - Servicio genera factura
 - Marca de Coche fabrica Vehículo
 - Marca de repuestos fabrica Repuesto

## ACCIONES / FUNCIONALIDADES

 - Atención al cliente / histórico de atención -> Ficha de cliente
 - Recepción de Repuestos -> Albaran
 - Reparación -> Piezas, Factura
 - Solicitud de Servicios -> 
 - Facturación -> Factura
 

## ENTIDADES CON CRUD

- Cliente: Necesita CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar la información de los clientes del taller, como agregar nuevos clientes, ver detalles de clientes existentes, actualizar la información de un cliente y eliminar clientes si es necesario.

- Vehículo: Requiere CRUD para administrar la información de los vehículos que son atendidos en el taller. Esto incluye agregar nuevos vehículos, ver detalles de vehículos existentes, actualizar la información de un vehículo (por ejemplo, la fecha de la ITV), y eliminar vehículos de ser necesario.

- Cita: La gestión de citas implica CRUD para programar nuevas citas, ver detalles de citas existentes, actualizar información de citas (como la fecha y hora), y cancelar citas si es necesario.

- Factura: Necesita CRUD para generar nuevas facturas para los servicios y piezas utilizadas en las reparaciones, ver detalles de facturas existentes, actualizar información de facturas (por ejemplo, agregar o eliminar servicios), y eliminar facturas en caso de ser necesario.

- TrabajoRealizado: Requiere CRUD para registrar los trabajos realizados durante las reparaciones, ver detalles de los trabajos realizados, actualizar información de trabajos realizados (por ejemplo, la fecha de inicio o fin), y eliminar registros de trabajos realizados si es necesario.

- Reparación: Similar a las facturas, necesita CRUD para gestionar las reparaciones realizadas en los vehículos, lo que incluye programar nuevas reparaciones, ver detalles de reparaciones existentes, actualizar información de reparaciones (como la lista de trabajos realizados), y eliminar registros de reparaciones si es necesario

- Albarán: Si el taller maneja la recepción y gestión de pedidos de piezas o repuestos, entonces el albarán sería necesario para registrar la recepción de los productos, ver detalles de los albaranes existentes, actualizar información (como la cantidad recibida de piezas) y eliminar albaranes si es necesario.

- Proveedor: Si el taller trabaja con proveedores para obtener piezas o repuestos, entonces la entidad proveedor necesitaría CRUD para agregar nuevos proveedores, ver detalles de proveedores existentes, actualizar información (como la dirección o el contacto) y eliminar proveedores si es necesario.




## PRECARGA DE DATOS

Esta sección describe la precarga de datos del catálogo que se utiliza en el sistema. La precarga de datos es una parte fundamental de la configuración inicial del sistema y proporciona información básica necesaria para su funcionamiento. El catálogo incluye los siguientes elementos:

- Piezas/Repuestos: Una colección de piezas y repuestos que pueden ser utilizados en las reparaciones de los vehículos. Cada pieza o repuesto está asociado con una marca y puede ser suministrado por uno o varios proveedores.
- Proveedores: Una lista de proveedores de piezas y repuestos que suministran productos al taller. Cada proveedor puede ofrecer una variedad de piezas y repuestos de diferentes marcas.
- Servicios (catálogo): Un conjunto de servicios ofrecidos por el taller, como reparaciones, mantenimiento y otros servicios especializados. Cada servicio está asociado con una descripción y un precio, que se utilizan para calcular los costos de las reparaciones y generar facturas para los clientes.




### TAREAS PENDIENTES

#### PRIMARIAS

- Registro de Cliente
- Registro de Vehículo de Cliente
- Creación de Cita
- Registro de Trabajo Realizado
- Recepción de material / Registro de albarán
- Emisión de Factura

#### SECUNDARIAS / SE PUEDEN HACER A MANO
- Registro de Empleado



# EVOLUCIÓN DEL DISEÑO 


### 23/04/2024
 - No se considera necesario inventariar y/o convertir en entidades las Marcas y/o Modelos de coches/piezas. 
Por ello se eliminan las entidades asociadas.
 - Se incluyen las entidades de Cita, Instalación de Pieza, Trabajo Realizado y Reparación, todas ellas destinadas 
a controlar las garantías asociadas a todos los trabajos y/o piezas incluidas en una misma factura.   


