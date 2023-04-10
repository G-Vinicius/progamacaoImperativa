package mainPackage;

public class Main {
	public static void main(String[] args) {
		int auxiliar = 1;
		int[] numeros = new int[10];
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = auxiliar * 3;
			auxiliar++;
		}
		
		System.out.println("Quinto elemento do vetor: " + numeros[4]);
		
		//printVetorInt(numeros);
		
	}
	
	public static void printVetorInt (int[] vetor) {
		for (int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
