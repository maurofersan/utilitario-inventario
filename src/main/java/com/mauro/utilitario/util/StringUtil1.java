package com.mauro.utilitario.util;

/**
 * Clase con metodos complementarios para el manejo de Strings
 * 
 * @see java.lang.String
 * @author Mauro Fernandez
 * @since 1.0
 */
public class StringUtil1 {

	/**
	 * Retorna una cadena con el primer caracter en mayuscula y los demas
	 * caracteres en minuscula.
	 * <p>
	 * Example: <blockquote>
	 * 
	 * <pre>
	 * StringUtil.capitalize("mauro")  returns  "Mauro"
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * @since 1.0
	 * @param source:
	 *            cadena que se le aplica el capitalize
	 * @return cadena que se le aplico el capitalize
	 */
	public static String capitalize(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
		String primerCarecter = source.substring(0, 1);
		primerCarecter = primerCarecter.toUpperCase();
		String demasCaracteres = source.substring(1);
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCarecter + demasCaracteres;
	}

	/**
	 * Trunca cadena hasta un maximo de caracteres
	 * 
	 * @since 1.1
	 * @param cadena:
	 *            cadena a truncar
	 * @param maxCaracteres:
	 *            numero maximo de caracteres de la nueva cadena
	 * @return cadena truncada
	 */
	public static String truncate(String cadena, int maxCaracteres) {

		if (cadena == null) {
			return null;
		}
		if (cadena.length() <= maxCaracteres) {
			return cadena;
		}
		String cadenaTruncada = cadena.substring(0, maxCaracteres);
		return cadenaTruncada;
	}

	/**
	 * Multiplica la cadena ingresada por parametro, n veces
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena fuente
	 * @param numeroVeces:
	 *            numero de veces a repetir
	 * @return cadena repetida "n veces".
	 */
	public static String times(String cadena, int numeroVeces) {
		String resultado = "";
		if (cadena == null) {
			return null;
		}
		for (int i = 0; i < numeroVeces; i++) {
			resultado += cadena;
		}
		return resultado;
	}

	/**
	 * Invierte la cadena
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena a invertir
	 * @return cadena invertida.
	 */
	public static String reverse(String cadena) {
		String resultado = "";
		if (cadena == null) {
			return null;
		}
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}

	/**
	 * Recibe una cadena como parametro y le aplica capitalize a cada palabra
	 * que tenga esa cadena. Una palabra es cada conjunto de caracteres
	 * separados por espacios.
	 * <p>
	 * Example:<blockquote>
	 * 
	 * <pre>
	 * StringUtil.capitalizeAllWords("hola mundo") return "Hola Mundo"
	 * StringUtil.capitalizeAllWords("java wOrld") return "Java World"
	 * 
	 * </pre>
	 * </blockquote>
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de entrada.
	 * @return String con palabras de cadena capitalizada.
	 */
	public static String capitalizeAllWords(String cadena) {
		String resultado = "";
		boolean esInicioDePalabra = true;
		if (cadena == null) {
			return cadena;
		}
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			// if (esInicioDePalabra) {
			// resultado += Character.toUpperCase(caracter);
			// } else {
			// resultado += Character.toLowerCase(caracter);
			// }
			char carcaterTransformado = (esInicioDePalabra) ? Character.toUpperCase(caracter)
					: Character.toLowerCase(caracter);
			// if (Character.isWhitespace(caracter)) {
			// esInicioDePalabra = true;
			// } else {
			// esInicioDePalabra = false;
			// }
			esInicioDePalabra = Character.isWhitespace(caracter);
			resultado += carcaterTransformado;
		}
		return resultado;
	}

	/**
	 * Intercambia caracteres de la cadena a minuscula o mayuscula.
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            String a intercambiar caracteres
	 * @return caracteres de cadena intercambiados a minuscula o mayuscula.
	 */
	public static String swapCase(String cadena) {
		String resultado = "";
		if (cadena == null) {
			return cadena;
		}
		for (int i = 0; i < cadena.length(); i++) {
			char characterSwap;
			characterSwap = Character.isUpperCase(cadena.charAt(i)) ? Character.toLowerCase(cadena.charAt(i))
					: Character.toUpperCase(cadena.charAt(i));
			resultado += characterSwap;
		}
		return resultado;
	}

	/**
	 * Remueve los espacios a los extremos de la cadena especificada y si
	 * encuentra espacios de mas de un caracter entre palabras los convierte a
	 * espacios de un solo caracter.
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de String a quitar espacios al extremo y convertir
	 *            espacios mas de un caracter entre palabras en un solo espacio.
	 * @return cadena sin espacios al extremo y un solo espacio entre palabras.
	 */
	public static String fullTrim(String cadena) {
		String resultado = "";
		boolean esEspacio = true;
		if (cadena == null) {
			return cadena;
		}
		String cadenaTrim = cadena.trim();
		for (int i = 0; i < cadenaTrim.length(); i++) {
			if (Character.isWhitespace(cadenaTrim.charAt(i)) && esEspacio) {
				resultado += cadenaTrim.charAt(i);
				esEspacio = false;
			} else if (!Character.isWhitespace(cadenaTrim.charAt(i))) {
				resultado += cadenaTrim.charAt(i);
				esEspacio = true;
			}
		}

		return resultado;
	}

	/**
	 * Retorna verdadero si la cadena del primer parametro contiene la del
	 * segundo parametro ignorando mayusculas y minusculas.
	 * <p>
	 * 
	 * @since 1.2
	 * @param cadena :
	 *            Cadena que contiene a cad.
	 * @param cad :
	 *            Cadena contenida en cadena.
	 * @return true si cadena contiene a cad ignorando mayusculas o minusculas.
	 */
	public static boolean containsIgnoreCase(String cadena, String cad) {
		if (cadena == null || cad == null) {
			return false;
		}
		return cadena.toLowerCase().contains(cad.toLowerCase());
	}

}
