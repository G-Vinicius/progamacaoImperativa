/*
Exercícios:
1. Construir e exbir uma lista com 5 funcionários 
2. Pesquisar um funcionário pelo nome. Apresentar os dados do funcionario.
3. Ordenar pelo nome a lista de funcionários a partir do exercício 1.
*/


package SistemaCadastro.src.sistemacadastro;

import java.util.Scanner;

public class SistemaCadastro {
	
	public static void bubblesort (Funcionario f [ ]) {
		int i, fim, pos;
		Funcionario chave;
		boolean troca;
		fim = f.length - 2; pos = 0;
		do {
			troca = false;
			for (i = 0; i <= fim; i++) {
				if (f[i].nome.compareTo(f[i + 1].nome) > 0) {
					chave = f[i]; 
					f[i] = f[i+1]; 
					f[i+1] = chave;
					
					pos = i; 
					troca = true;
				}
			}
			fim = pos-1;
			} while (troca == true);
	}
	
	public static int buscaSequencial (Funcionario f[ ], String procurado) {
		int i;
		boolean achou = false;
		
		for (i = 0; i < f.length; i++) {
			if ((f[i].nome).compareTo(procurado) == 0) {
				achou = true;
				break;
			}
		}
		if (achou == true) {
			return i; // retorna a posi��o onde encontrou a chave
		}
		else {
			return -1; // retorna -1 indicando que n�o achou a chave
		}
	}

    public static void exibeFuncionario (Funcionario []f ) { 
          for (int i = 0; i < f.length; i++) {
              System.out.print("Nome: " + f[i].nome);
              System.out.println(" Salario: R$ " + f[i].salario);
          }
     }
    
    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int nf = 3; // número de funcionários
    int posicao;
    String procurado;
    //declaração do vetor de funcionários 
    Funcionario [] f; 
    f = new Funcionario[nf];
        
    //laço para cadastrar os funcionários
    for(int i = 0; i < nf; i++){ 
        System.out.println("Digite nome do "+ (i+1)+ "o funcionário: ");
        String n = s.nextLine();
        System.out.println("Digite salario do "+ (i+1)+ "o funcionário: ");
        double sal = s.nextDouble();
        f[i] = new Funcionario();
        f[i].nome = n;
        f[i].salario = sal;
        s.nextLine();
    }
                
    //exibe a lista de funcionários
    System.out.println("\nLista de Funcionários");
    exibeFuncionario(f);
    
    System.out.println("Os dados do funcionario pesquisado s�o:");
    posicao = buscaSequencial(f, "joao");
    if (posicao != -1) {
    	//System.out.println(f[posicao]);
    	System.out.print("Nome: " + f[posicao].nome);
        System.out.println(" Salario: R$ " + f[posicao].salario);
    }
    
    
    bubblesort(f);
    exibeFuncionario(f);
}
}
