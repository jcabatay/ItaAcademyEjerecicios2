package ascii274.appllication;
import java.util.Arrays;
import java.util.List;

public class Listas {	
	
	private List<String> nombres  = Arrays.asList("Víctor","Alberto","Marta",
			"Ana","Laura","Oscar");
	
	private List<String>meses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo",
			"Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
	
	public List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
			19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
			46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72,
			73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
			100);
	
	public List<String>textosINumeros = Arrays.asList("lola","15","1","Paco","155","Ester","10","Juan",
			"2","Ana","22","Andres","222","122");

	public List<String> getNombres() {
		return nombres;
	}
	
	public List<String> getMeses(){
		return meses;
	}
	
	public List<Integer> getNumeros(){
		return numeros;
	}
	
	public List<String> getTextosINumeros(){
		return textosINumeros;
	}
	

}
