package com.jpassion.mockito;

public class RomanCalculator {

	public String transform(int i) {
		String num="";
		String num2="V";
		String num3="X";

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
	
	
	private String calculadorRomano(int i,int base,int maximo,String romanoBase, 
			int indicador, String numero1, String numRomano,String cadena) {
		
		if(i==base) {
			return romanoBase;
		}else {
			for(int a=0; a<(i-(maximo-base));a++) {
				numRomano = numRomano + cadena;
			}
			return numRomano;
		}
	}
	
	

}