package ascii274.view;
import ascii274.appllication.Cadena_InterfazFuncional;
import ascii274.appllication.Lambdas;
import ascii274.appllication.Listas;
import ascii274.appllication.Pi_InterfazFuncional;



public class MainLambda {

	public static void main(String[] args) {

		Listas listas = new Listas();
		Lambdas lambdas = new Lambdas();
		
		/*
		 * Fase 1 nivel 1. 
		 */
		//apartado 1/6
		lambdas.filterNamesStartsWithLength(listas.getNombres(),System.out::println,"A", 3);
		//apartado 2/6
		System.out.println("***** Print number Pair Odd *****");
		System.out.println(lambdas.getNumberToString(listas.getNumeros(), ","));		
		
		// apartado 3/6: retorn dels que contenen "o"
		lambdas.printNamesContentWith(listas.getNombres(), System.out::println, "o");
		
		// apartado 4/6
		lambdas.filterNameWithMaxLength(listas.getNombres(),System.out::println,"o", 5);
		// apartado 5/6
		lambdas.printMonth(listas.getMeses());		
		//aparado 6/6
		lambdas.printMonthMethodReference(listas.getMeses(), System.out::println);
		// Fase 1 nivel 2
		lambdas.printPiValue();
		// Fase 1 nivel 3 
		String cadena = "Esto es una cadena.";
		lambdas.printTextReverse(cadena);
		
		
		
		
	}
	
	

	
	
}
