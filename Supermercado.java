package ejercicio3;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Supermercado {
    private ArrayList<Producto> productos= new ArrayList<Producto>();
    
    public Supermercado() {
    	
    }
    
    
    public double comprar(ArrayList<Producto>miCompra) {
    	double total=0;
    	int indice=0;
    	Date date = new Date();
    	DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	System.out.println("Fecha "+dateFormat.format(date) + " Hora " + hourFormat.format(date));
    	while (indice<miCompra.size()) {
    		String producto;
    		int cantidad;
    		double precio;
    		producto = miCompra.get(indice).getNombre();
    		cantidad = miCompra.get(indice).getCantidad();
    		precio = miCompra.get(indice).getPrecio();
    		System.out.println(producto);
    		System.out.println(cantidad + "x" + precio);
    		total= total + miCompra.get(indice).getCantidad()* miCompra.get(indice).getPrecio();
    		indice++;	
    	}
    	return total;
    }
}
