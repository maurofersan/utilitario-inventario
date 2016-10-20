package com.mauro.utilitario.util;

public final class ConvertUtil {

	private ConvertUtil() {
	}

	public static Integer toInteger(Object source) {
		if (source == null) {
			return null;
		}
		if (source instanceof Integer) {
			return (Integer) source;
		}
		try {
			return Integer.parseInt(source.toString());
		} catch (Exception e) {
			System.err.println("Integer invalido: " + source);
			return null;
		}
	}

	public static Double toDouble(Object source) {
		if (source == null){
			return null;
		}
		if (source instanceof Double) {
			return (Double) source;
		}
		try {
			return Double.parseDouble(source.toString());			
		} catch (Exception e) {
			System.err.println("Double invalido: " + source);
			return null;
		}
	}
}
