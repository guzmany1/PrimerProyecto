// Interfaz Tipo_Pago
public interface Tipo_Pago {
    void procesarPago(double monto);
}

// Clase Tarjeta que implementa la interfaz Tipo_Pago
public class Tarjeta implements Tipo_Pago {
   
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta: $" + monto);
        // Lógica para procesar el pago con tarjeta
    }
}

// Clase Efectivo que implementa la interfaz Tipo_Pago
public class Efectivo implements Tipo_Pago {
  
    public void procesarPago(double monto) {
        System.out.println("Pago en efectivo: $" + monto);
        // Lógica para procesar el pago en efectivo
    }
}

public class TipoPagoFactory {
    public static Tipo_Pago crearTipoPago(String tipo) {
        if (tipo.equalsIgnoreCase("TARJETA")) {
            return new Tarjeta();
        } else if (tipo.equalsIgnoreCase("EFECTIVO")) {
            return new Efectivo();
        } else {
            throw new IllegalArgumentException("Tipo de pago no válido");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tipo_Pago tipoPagoTarjeta = TipoPagoFactory.crearTipoPago("TARJETA");
        Tipo_Pago tipoPagoEfectivo = TipoPagoFactory.crearTipoPago("EFECTIVO");

        tipoPagoTarjeta.procesarPago(50.0);
        tipoPagoEfectivo.procesarPago(30.0);
    }
}
