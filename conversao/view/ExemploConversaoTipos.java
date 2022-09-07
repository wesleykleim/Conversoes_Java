package br.com.fiap.conversao.view;

public class ExemploConversaoTipos {

	//Converter um tipo primitivo em outro tipo primitivo
	public static void main(String[] args) {
		
		//Conversão implícita (automática)
		// byte > short > int > long > float > double
		
		byte idade = 10;
		int idadeInt = idade;
		long idadeLong = idadeInt;
		float idadeFloat = idadeLong;
		
		//Conversão explícita
		float peso = 75.5f; //f -> tipo float
		int pesoInt = (int) peso; //cast -> forçar o valor a ser do tipo especificado no parenteses
		
		System.out.println(pesoInt);
		
	}
}