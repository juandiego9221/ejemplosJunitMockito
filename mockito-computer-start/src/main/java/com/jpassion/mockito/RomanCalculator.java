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
		
		String gen = generadorNumerosRomanos("","V","5","4",i);
		

//		if(i<4) {
//			for(int j=0;j<i;j++) {
//				num=  num + "I";
//			}
//			return num;		
//		}else if(i<9) {
//			if(i==4) {
//				return "IV";
//			}else {
//				for(int a=0; a<(i-5);a++) {
//					num2 = num2 + "I";
//				}
//				return num2;
//			}
//
//		}else if(i<14){
//			if(i==9) {
//				return "IX";
//			}else {
//				for(int a=0; a<(i-10);a++) {
//					num3 = num3 + "I";
//				}
//				return num3;
//			}
//		}else if(i<19) {
//			generadorNumerosRomanos(num4,"19","14",);
//		}
//		
//		
		return gen;
	
	}
	
	public String generadorNumerosRomanos(String numPrincipal,String numeroPriSiguiente,String numLimite,String numAnterior,int input) {
		int numeroLimite = Integer.parseInt(numLimite);
		int numeroAnterior = Integer.parseInt(numAnterior);
		
		if(input < numeroLimite) {
			if(input == numeroAnterior) {
				return "I" + numeroPriSiguiente;
			}else {
				if(input<4) {
					for(int a = 0; a < input; a++) {
						numPrincipal = numPrincipal + "I";
					}
				}
				for(int a = 0; a < (input-(numeroLimite+1)); a++) {
					numPrincipal = numPrincipal + "I";
				}
				return numPrincipal;
			}
		}
		return numPrincipal;
	}
	

}
