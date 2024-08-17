package proyecto.multifiestas.Cajas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class IngresoDiario {
    private Date fecha;
    private double monto;

    public IngresoDiario(Date fecha, double monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }
}


public class RutinaCajas {
    private List<IngresoDiario> ingresosDelDia;

    public RutinaCajas() {
        ingresosDelDia = new ArrayList<>();
    }

  
    public void agregarIngresoDelDia(Date fecha, double monto) {
        ingresosDelDia.add(new IngresoDiario(fecha, monto));
    }

  
    public void mostrarIngresosYAsientosVendidos() {
     
        for (IngresoDiario ingreso : ingresosDelDia) {
            System.out.println("Fecha: " + ingreso.getFecha() + ", Monto: $" + ingreso.getMonto());
        
        }
    }
}
