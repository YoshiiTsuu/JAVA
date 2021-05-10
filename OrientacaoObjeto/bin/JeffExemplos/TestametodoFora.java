package br.com.metodos;

public class TestametodoFora {

	static String cont(int i, int f) {
		
		 String numeroString = "";
		 for(int c = i; c <= f; c++) {
			 numeroString = numeroString + c + "";
		 }
		 return numeroString;
	}
}
