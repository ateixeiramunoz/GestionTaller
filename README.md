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

 - Clientes  -> 
 - Vehículos
 - Repuestos
 - Empleados

 
## PRECARGA DE DATOS  (Catálogo)

- Modelos
- Marcas
- Piezas/Repuestos
- Proveedores
- Servicios (catálogo)






## EVOLUCIÓN DEL DISEÑO - 23/04/2024

 - No se considera necesario inventariar y/o convertir en entidades las Marcas y/o Modelos de coches/piezas. 
Por ello se eliminan las entidades asociadas.
 - Se incluyen las entidades de Cita, Instalación de Pieza, Trabajo Realizado y Reparación, todas ellas destinadas 
a controlar las garantías asociadas a todos los trabajos y/o piezas incluidas en una misma factura.   
 - Se incluye 