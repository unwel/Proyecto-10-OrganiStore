# Proyecto-10-OrganiStore
10. Diseña un sistema simple de gestión para una tienda de alimentos orgánicos que permita almacenar y gestionar la información de los productos y sus proveedores.

Crear una clase abstracta llamada "ProductoOrganico" que contenga los siguientes atributos y métodos.

## Atributos:
● nombre (String)

● tipo (String)

● precio (double)

## Métodos:
● Constructor que reciba todos los atributos e inicialice los valores.

● Getters y setters para cada atributo.

● Método "toString()" que devuelva una cadena con la información del

## producto.
● Crear dos clases que hereden de la clase "ProductoOrganico": "Fruta" y "Verdura". Ambas clases deben implementar métodos para calcular el precio de venta y aplicar descuentos.

### Para "Fruta":
● Añadir el atributo "tipoFruta" (String).

● Modificar el constructor para incluir el nuevo atributo.

● Implementar un método "calcularPrecioVenta()" que devuelva el precio de venta de la fruta, considerando su precio y tipo.

● Implementar un método "aplicarDescuento()" que devuelva el precio de la fruta con un descuento aplicado según ciertas condiciones.

### Para "Verdura":
● Añadir el atributo "tipoVerdura" (String).

● Modificar el constructor para incluir el nuevo atributo.

● Implementar un método "calcularPrecioVenta()" que devuelva el precio de venta de la verdura, considerando su precio y tipo.

● Implementar un método "aplicarDescuento()" que devuelva el precio de la verdura con un descuento aplicado según ciertas condiciones. Crear una clase llamada "TiendaOrganica" que contenga:
● Un atributo llamado "inventario" que sea una lista de objetos de la clase "ProductoOrganico".

● Un método llamado "agregarProducto()" que reciba un objeto de la clase "ProductoOrganico" y lo añada al inventario.

● Un método llamado "eliminarProducto()" que reciba el nombre del producto y lo elimine del inventario.

### Probar las clases anteriores en la clase principal que:
● Instancie una tienda de alimentos orgánicos.

● Añada productos al inventario (tanto "Fruta" como "Verdura").

● Muestre información de los productos utilizando el método "toString()".

● Elimine productos

● Calcule y muestre los precios de venta y descuentos aplicados de cada producto.
