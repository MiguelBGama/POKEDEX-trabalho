package pokedex;

import java.util.Scanner;

/*
Grupo 1: Leví Melo, Luiz Gustavo Pereira, Bruna Rosa Rodrigues e Miguel Bragança
*/


public class Pokedex {
    /*
            quais atributos um pokedex teria?
            boolean  ligado;
            int qntPokemon = 10;
            Pokemon[qntPokemon] pokemon = new pokemon();
        
    */
    public static void main(String[] args) {
        //como a execução começa por aqui, pode ser um menu, que inicia com um metodo ligar que inicia os pokemons e as variavies e tudo necessario para o runtime
        Scanner scan = new Scanner(System.in);
        Pokemon pokemon = new Pokemon();
        int escolha = 0;
        
        do {
            // Statements
            //menu que chama as funcionalidades
            mostraMenu();
            switch(escolha){               
                case 1:    
                 //code to be executed;    
                 break;  //optional  
                case 2:    
                 //code to be executed;    
                 break;  //optional   
                case 3:    
                 //code to be executed; 

                default:     
                    escolha = 0;
                } 
            
               //Capturar pokemon
    
               //Treinar pokemon
        
               //ver meus pokemons
        
        //informações pokemon
        }while(escolha != 4);
    }
    
    public static void mostraMenu(){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("|---------- POKEDEX ----------|");
                System.out.println("|            MENU             |");
                System.out.println("|                             |");
                System.out.println("|     1- Capturar pokemon     |");
                System.out.println("|     2- Treinar pokemon      |");
                System.out.println("|     3- Ver pokemons         |");
                System.out.println("|     4- Sair                 |");
                System.out.println("|                             |");
                System.out.println("|-----------------------------|");
    }
    // Aqui vão ficar as ações do pokedex
        
        //Capturar pokemon
    
        //Treinar pokemon
        
        //ver meus pokemons
        
        //informações pokemon
}
