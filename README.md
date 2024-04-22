# APLICACIÓN DE GESTIÓN DE TALLER

##  Objetivos

### Introducción

El proyecto tiene como objetivo proporcionar una aplicación de gestión de taller.

La aplicación deberá cumplir con los siguiente requisitos:

 - Gestión de Respuestos
 - Gestión de Clientes
 - Tipos de Servicios
 - Coste de los servicios
 - Proveedores
 - Tipos de vehiculos
 - Horario
 - VehiculosEnReparacion
 - Albaranes
 - Facturas



## ENTIDADES  DETECTADAS

 - Cliente
 - Empleado
 - Marca de Coche
 - Marca de Repuesto
 - Repuesto 
 - Vehículo
 - Proveedor
 - Albarán
 - Factura
 - Servicio


## RELACIONES

 - Cliente posee Vehículo
 - Vehículo necesita repuesto
 - Empleado atiende cliente
 - Proveedor provee repuesto
 - Empleado repara vehículo
 - Cliente solicita servicio
 - Servicio genera factura
 - Marca de Coche fabrica Vehículo
 - Marca de repuestos fabrica Repuesto


## ACCIONES / FUNCIONALIDADES

 - Atención al cliente / histórico de atención
 - Recepción de Repuestos
 - Reparación
 - Solicitud de Servicios
 - Facturación
 - La recepción de Repuestos genera un Albarán


## ENTIDADES CON CRUD

 - Clientes
 - Vehículos
 - Repuestos
 - Empleados


## PRECARGA DE DATOS

- Modelos
- Marcas
- Repuestos
- Proveedores
- Servicios (catálogo)




