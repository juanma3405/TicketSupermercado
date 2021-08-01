package ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;



public class Test {
	
	public static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {	
		Supermercado miSuper= new Supermercado();
		ArrayList <Producto> miCompra= new ArrayList<Producto>();
		String ingresoNombreProducto="";
		double ingresoPrecioProducto;
		int cantidadProducto;
		Producto articuloComprado=null;
		System.out.println("Ingrese el producto comprado o F para finalizar");
		ingresoNombreProducto=input.next();
		while (!ingresoNombreProducto.equalsIgnoreCase("F")) {
			System.out.println("Ingrese el precio del producto");
			ingresoPrecioProducto=input.nextDouble();
		    System.out.println("Ingrese la cantidad comprada del producto");
		    cantidadProducto=input.nextInt();
		    articuloComprado = new Producto(ingresoNombreProducto, ingresoPrecioProducto, cantidadProducto);
			miCompra.add(articuloComprado);	
			System.out.println("Ingrese el producto comprado o F para finalizar");
			ingresoNombreProducto=input.next();
		}
		
		System.out.println("TOTAL  $" + miSuper.comprar(miCompra));

		
	}

}
