package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option = 0;

		do {
			System.out.println("Escolha uma das op��es");
			System.out.println("0 - Voltar ao menu principal");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida.");
				break;

			}

		} while (option != 0);
		System.out.println("Volte sempre quando quiser aprender collections - list");
	}

	private static void aprenderArrayList() {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Thiago");
		nomes.add("Ariana");
		nomes.add("Filipe");
		nomes.add("Jo�o");
		nomes.add(2, "Inserido");
		nomes.add(0, "primeiro");
		nomes.add("Rubem");
		System.out.println("Quantos nomes? " + nomes.size());

		// variavel temporaria e a lista que quero percorrer
		// for de intera��o("item" em cada loop � uma String) - n�o tem acesso ao
		// contador
		for (String item : nomes) {
			System.out.println("O nome no momento �: " + item);

		}

		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No �ndice " + nome + " tem o valor " + nomes.get(nome));
		}

		System.out.println("O primeiro nome �: " + nomes.get(0));
		System.out.println("O segundo nome �: " + nomes.get(2));
		
		nomes.set(2, "Jurema");
		System.out.println("O terceiro nome atualizado � " + nomes.get(2));
		//nomes.set(0, nomes.get(0).toUpperCase());
		nomes.set(0, nomes.get(3).toUpperCase());
		System.out.println("O primeiro nome �: " + nomes.get(0));
		
		//usando o index para pegar a posi��o do elemento 
		System.out.println("Onde ser� que est� o primeiro? " + nomes.indexOf("Rubem"));
		
		System.out.println("Vou deletar quem estiver no �ndice 2 " + nomes.get(2));
		nomes.remove(2);
		nomes.remove(nomes.indexOf("Rubem"));// removendo no �ndice onde est� o Rubem
		
		ArrayList <String> interesses = new ArrayList <>();
		interesses.add("Aprender Java");
		interesses.add("Aprender JavaScript");
		interesses.add("Aprender Angular");
		interesses.add("Aprender HTML");
		interesses.add("Aprender a aprender");
		
		System.out.println("Tenho " +interesses.size()+ " interesses e eles s�o: ");
		
		for (String interesse : interesses) {
			System.out.println("O interesse � \t: " + interesse);
		}
		
		System.out.println("O item favorito 1 �: " + interesses.get(0));
		System.out.println("O item favorito 2 �: " + interesses.get(1));
		
		System.out.println("Vou deletar o item: " + interesses.get(3));
		interesses.remove(3);
		
		System.out.println("Vou deletar o item: " + interesses.get(2));
		interesses.remove("Aprender Angular"); //String funciona direto sem precisar usar o indexOf
		
		for (String interesse : interesses) {
			System.out.println("A lista de interesses  ficou assim \t: " + interesse);
		}
		
	}

	private static void aprenderLinkedList() {

	}

}
