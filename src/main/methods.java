package main;
import java.text.DecimalFormat;

public class methods {

	public static double calculoPrecioPorEmpresa(int a, double b) {
		return a*b;
	}
	
	public static double calculoPrecioConTD(int a, double b) {
		 return (100-a)/100*b;
	}
	
	public static double calculoPrecioConTC(int a, double b) {
		return ((a/100)*b)+b;
	}
	
	public static double calculoPrecioConBTC(double a, double b) {
		return b/a;
	}

	public static double calculoDifferenciaDePrecios(double a, double b) {
		double diff = b-a;
		if (diff < 0) {
			diff=diff*(-1);
		}
		return diff;
	}
	
	public static String decimalFormated(double a) {
		DecimalFormat formateador = new DecimalFormat("####.##");
		return formateador.format (a);
	}

}
