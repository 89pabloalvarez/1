package main;
import java.util.Scanner;
import main.methods;

public class principal {

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
		
		PrecioTotalAerolineas = methods.calculoPrecioPorEmpresa(distanciaIngresada, PrecioKmAerolineas);
		PrecioTotalLatam = methods.calculoPrecioPorEmpresa(distanciaIngresada, PrecioKmLatam);
		PrecioTDAerolineas = methods.calculoPrecioConTD(descuentoTD, PrecioTotalAerolineas);
		PrecioTDLatam = methods.calculoPrecioConTD(descuentoTD, PrecioTotalLatam);
		PrecioTCAerolineas = methods.calculoPrecioConTC(interesTC, PrecioTotalAerolineas);
		PrecioTCLatam = methods.calculoPrecioConTC(interesTC, PrecioTotalLatam);
		PrecioBTCAerolineas= methods.calculoPrecioConBTC(PrecioBTC,PrecioTotalAerolineas);
		PrecioBTCLatam= methods.calculoPrecioConBTC(PrecioBTC,PrecioTotalLatam);
		DifferenciaEntrePrecios = methods.calculoDifferenciaDePrecios(PrecioTotalAerolineas,PrecioTotalLatam);
		
		//////////////////////////////////////////////////////////////
		//////////////////////PRINT DEL EJERCICIO/////////////////////
		//////////////////////////////////////////////////////////////
		System.out.println("KMs Ingresados: "+distanciaInput);
		System.out.println();
		System.out.println("Precio Aerolineas: $"+methods.decimalFormated(PrecioTotalAerolineas));
		System.out.println("a) Precio con tarjeta de débito: $"+methods.decimalFormated(PrecioTDAerolineas));
		System.out.println("b) Precio con tarjeta de crédito: $"+methods.decimalFormated(PrecioTCAerolineas));
		System.out.println("c) Precio pagando con bitcoin: $"+methods.decimalFormated(PrecioBTCAerolineas));
		System.out.println("d) Mostrar precio unitario: $"+methods.decimalFormated(PrecioKmAerolineas));
		System.out.println();
		System.out.println("Precio Latam: $"+methods.decimalFormated(PrecioTotalLatam));
		System.out.println("a) Precio con tarjeta de débito: $"+methods.decimalFormated(PrecioTDLatam));
		System.out.println("b) Precio con tarjeta de crédito: $"+methods.decimalFormated(PrecioTCLatam));
		System.out.println("c) Precio pagando con bitcoin: $"+methods.decimalFormated(PrecioBTCLatam));
		System.out.println("d) Mostrar precio unitario: $"+methods.decimalFormated(PrecioKmLatam));
		System.out.println();
		System.out.println("La diferencia de precio es: $"+methods.decimalFormated(DifferenciaEntrePrecios));
		
		
		
		
	}

}
