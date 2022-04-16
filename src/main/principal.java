package main;
import java.util.Scanner;
import java.text.DecimalFormat;
import main.methods;

public class principal {
	
	static double calculoPrecioPorEmpresa(int a, double b) {
		return a*b;
	}
	
	static double calculoPrecioConTD(int a, double b) {
		 return (100-a)/100*b;
	}
	
	static double calculoPrecioConTC(int a, double b) {
		return ((a/100)*b)+b;
	}
	
	static double calculoPrecioConBTC(double a, double b) {
		return b/a;
	}

	static double calculoDifferenciaDePrecios(double a, double b) {
		double diff = b-a;
		if (diff < 0) {
			diff=diff*(-1);
		}
		return diff;
	}
	
	static String decimalFormated(double a) {
		DecimalFormat formateador = new DecimalFormat("####.##");
		return formateador.format (a);
		//return Double.valueOf(formateador.format (a));
	}
	
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////
		/////////////////////VARIABLES A UTILIZAR/////////////////////
		//////////////////////////////////////////////////////////////

		int distanciaIngresada;
		int descuentoTD=10;
		int interesTC=25;
		double PrecioKmAerolineas = 188.2934640338505;
		double PrecioKmLatam = 190.4091339915374;
		double PrecioBTC = 4606954.55;
		double PrecioTotalAerolineas,PrecioTotalLatam;
		double PrecioTDAerolineas,PrecioTDLatam;
		double PrecioTCAerolineas,PrecioTCLatam;
		double PrecioBTCAerolineas,PrecioBTCLatam;
		double DifferenciaEntrePrecios;
		
		//////////////////////////////////////////////////////////////
		////////////////////INPUT DE LOS KILOMETROS///////////////////
		//////////////////////////////////////////////////////////////

		System.out.println("Por favor ingrese los kilómetros a recorrer.");
		Scanner inputScaner = new Scanner (System.in);
		String distanciaInput = inputScaner.nextLine();
		distanciaIngresada = Integer.valueOf(distanciaInput);
		
		//////////////////////////////////////////////////////////////
		///////////////////////////CÁLCULOS///////////////////////////
		//////////////////////////////////////////////////////////////
		
		PrecioTotalAerolineas = calculoPrecioPorEmpresa(distanciaIngresada, PrecioKmAerolineas);
		PrecioTotalLatam = calculoPrecioPorEmpresa(distanciaIngresada, PrecioKmLatam);
		PrecioTDAerolineas = calculoPrecioConTD(descuentoTD, PrecioTotalAerolineas);
		PrecioTDLatam = calculoPrecioConTD(descuentoTD, PrecioTotalLatam);
		PrecioTCAerolineas = calculoPrecioConTC(interesTC, PrecioTotalAerolineas);
		PrecioTCLatam = calculoPrecioConTC(interesTC, PrecioTotalLatam);
		PrecioBTCAerolineas= calculoPrecioConBTC(PrecioBTC,PrecioTotalAerolineas);
		PrecioBTCLatam= calculoPrecioConBTC(PrecioBTC,PrecioTotalLatam);
		DifferenciaEntrePrecios = calculoDifferenciaDePrecios(PrecioTotalAerolineas,PrecioTotalLatam);
		
		//////////////////////////////////////////////////////////////
		//////////////////////PRINT DEL EJERCICIO/////////////////////
		//////////////////////////////////////////////////////////////
		System.out.println("KMs Ingresados: "+distanciaInput);
		System.out.println();
		System.out.println("Precio Aerolineas: $"+decimalFormated(PrecioTotalAerolineas));
		System.out.println("a) Precio con tarjeta de débito: $"+decimalFormated(PrecioTDAerolineas));
		System.out.println("b) Precio con tarjeta de crédito: $"+decimalFormated(PrecioTCAerolineas));
		System.out.println("c) Precio pagando con bitcoin: $"+decimalFormated(PrecioBTCAerolineas));
		System.out.println("d) Mostrar precio unitario: $"+decimalFormated(PrecioKmAerolineas));
		System.out.println();
		System.out.println("Precio Latam: $"+decimalFormated(PrecioTotalLatam));
		System.out.println("a) Precio con tarjeta de débito: $"+decimalFormated(PrecioTDLatam));
		System.out.println("b) Precio con tarjeta de crédito: $"+decimalFormated(PrecioTCLatam));
		System.out.println("c) Precio pagando con bitcoin: $"+decimalFormated(PrecioBTCLatam));
		System.out.println("d) Mostrar precio unitario: $"+decimalFormated(PrecioKmLatam));
		System.out.println();
		System.out.println("La diferencia de precio es: $"+decimalFormated(DifferenciaEntrePrecios));
		
		
		
		
	}

}
