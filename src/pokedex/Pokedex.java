package pokedex;

import java.util.ArrayList;

public class Pokedex extends Pokemon {

	static void imprimePokemon(ArrayList<Pokemon> pokemons) {
		String fogo = "FOGO";
		String agua = "AGUA";
		String eletrico = "ELETRICO";
		String planta = "PLANTA";

		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|                        POKEDEX                            |");
		System.out.println("+-----------------------------------------------------------+");		
		
		System.out.println("|--------------------POKEMONS DE FOGO-----------------------|");
		for (int i = 0; i < 10; i++) {
			
			if(pokemons.get(i).getTipo().equals(fogo)) {
				System.out.println("NOME: " + pokemons.get(i).getNome());
				System.out.println("TIPO: " + pokemons.get(i).getTipo());
				System.out.println("DESCRIÇÃO: " + pokemons.get(i).getDescricao());
				System.out.println("EVOLUÇÃO: " + pokemons.get(i).getEvolucao());				
				System.out.println("\n");
			}
		}
		
		System.out.println("\n|-------------------POKEMONS DE ÁGUA----------------------|");
		for (int i = 0; i < 10; i++) {
					
			if(pokemons.get(i).getTipo().equals(agua)) {
				System.out.println("NOME: " + pokemons.get(i).getNome());
				System.out.println("TIPO: " + pokemons.get(i).getTipo());
				System.out.println("DESCRIÇÃO: " + pokemons.get(i).getDescricao());
				System.out.println("EVOLUÇÃO: " + pokemons.get(i).getEvolucao());				
				System.out.println("\n");
			}
		}
		
		System.out.println("\n|--------------------POKEMONS ELÉTRICO--------------------|");
		for (int i = 0; i < 10; i++) {
			
			if(pokemons.get(i).getTipo().equals(eletrico)) {
				System.out.println("NOME: " + pokemons.get(i).getNome());
				System.out.println("TIPO: " + pokemons.get(i).getTipo());
				System.out.println("DESCRIÇÃO: " + pokemons.get(i).getDescricao());
				System.out.println("EVOLUÇÃO: " + pokemons.get(i).getEvolucao());				
				System.out.println("\n");
			}
		}
		
		System.out.println("\n|-------------------POKEMONS DE PLANTA--------------------|");
		for (int i = 0; i < 10; i++) {
			
			if(pokemons.get(i).getTipo().equals(planta)) {
				System.out.println("NOME: " + pokemons.get(i).getNome());
				System.out.println("TIPO: " + pokemons.get(i).getTipo());
				System.out.println("DESCRIÇÃO: " + pokemons.get(i).getDescricao());
				System.out.println("EVOLUÇÃO: " + pokemons.get(i).getEvolucao());				
				System.out.println("\n");
			}
		}
		
	}
}