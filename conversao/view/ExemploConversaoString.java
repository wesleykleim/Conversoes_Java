package br.com.fiap.conversao.view;

import javax.swing.JOptionPane;

public class ExemploConversaoString {

	//Converter um tipo primitivo em uma String
	public static void main(String[] args) {
		//Ler o peso e a altura
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		
		String alturaString = JOptionPane.showInputDialog("Digite a altura");
		float altura = Float.parseFloat(alturaString);
		
		//Calcular o IMC
		float imc = peso/(altura*altura);
		
		//Transformar a altura e peso em Strings
		String alturaStr = String.valueOf(altura);
		String pesoStr = String.valueOf(peso);
		
		//Exibir o IMC
		JOptionPane.showMessageDialog(null, imc);
		
	}
}
