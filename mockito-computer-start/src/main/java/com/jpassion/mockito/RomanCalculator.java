package com.jpassion.mockito;

public class RomanCalculator {

	public String transform(int i) {
		String num="";
		String num2="V";
		String num3="X";
		String num4="XV";
		String num5="XX";
		String num6="XXV";
		String num7="XXX";

		if(i<4) {
			for(int j=0;j<i;j++) {
				num=  num + "I";
			}
			return num;		
		}else if(i<9) {
			if(i==4) {
				return "IV";
			}else {
				for(int a=0; a<(i-5);a++) {
					num2 = num2 + "I";
				}
				return num2;
			}

		}else if(i<14){
			if(i==9) {
				return "IX";
			}else {
				for(int a=0; a<(i-10);a++) {
					num3 = num3 + "I";
				}
				return num3;
			}
		}
		return "XIV";
	
	}
	
	public String generadorNumerosRomanos(String numPrincipal,String numLimite,String numAnterior,String input) {
		int numeroPrincipal = Integer.parseInt(numPrincipal);
		int numeroLimite = Integer.parseInt(numLimite);
		int numeroAnterior = Integer.parseInt(numAnterior);
		int numeroInput = Integer.parseInt(input);
		
		if(numeroInput < numeroLimite) {
			if(numeroInput == numeroAnterior) {
				return "I" + numPrincipal;
			}else {
				for(int a = 0; a < (numeroInput-numeroPrincipal); a++) {
					numPrincipal = numPrincipal + "I";
				}
				return numPrincipal;
			}
		}
		return numPrincipal;
	}
	

}
