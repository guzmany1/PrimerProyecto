import java.util.Date;

public class PrimerProyecto {
    public static void main(String[] args) {
        // Crear un proveedor
        Proveedor proveedor = new Proveedor("Proveedor XYZ", "Juan Pérez", "Calle Principal 123", "555-12345");

        // Crear un material
        Material material = new Material("Madera", "Material de construcción", 100, proveedor, 25.0, "Madera de pino de alta calidad");

        // Crear un producto
        Producto producto = new Producto("Silla de madera", 10, 50.0, true);

        // Crear una orden de compra
        OrdenCompra ordenCompra = new OrdenCompra(new Date(), 1, 500.0, 10, "En proceso");

        // Crear un cliente
        Cliente cliente = new Cliente("Cliente A", "12345-6", "555-12345", "Silla de madera", 3);

        // Crear una orden de venta
        OrdenVenta ordenVenta = new OrdenVenta(new Date(), 1, "Venta al por mayor", 150.0, 3);

        // Crear una instancia de Inventario
        Inventario inventario = new Inventario(material, proveedor, producto, ordenCompra, cliente, ordenVenta);

     
        System.out.println("Información del Inventario:");
        System.out.println(inventario);
    }
}
