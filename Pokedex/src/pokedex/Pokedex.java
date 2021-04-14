package pokedex;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = null;
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        int escolha;
        System.out.println("inicio da leitura");
        
        br = new BufferedReader(new FileReader("C:/Users/Usuario/Desktop/4-semestre/POO/Nova Pasta/POKEDEX-trabalho/Pokedex/src/pokedex/listaPokemons.txt"));
        String linha;
        System.out.println("meio da leitura");
        
        Pokemon p1 = new Pokemon();        
        while((linha = br.readLine()) != null){
            p1.setNome(linha);
            linha = br.readLine();
            p1.setDescricao(linha);
            linha = br.readLine();
            p1.setTipo(linha);
            linha = br.readLine();
            p1.setEvolucao(linha);
            pokemons.add(p1);
        }
        for(int cntrl = 0; cntrl < pokemons.size(); cntrl++){
            p1 = pokemons.get(cntrl);
            System.out.println("Nome:" + p1.getNome());
            System.out.println("Descricao:" + p1.getDescricao());
            System.out.println("Tipo:" + p1.getTipo());
            System.out.println("Evolução:" + p1.getEvolucao());
            System.out.println("");
        }
        
        /*
        iniciaPokemons();
        */
        do {
            // Statements
            //menu que chama as funcionalidades
            mostraMenu();
            escolha = scan.nextInt();
            switch(escolha){               
                case 1:     
                    System.out.println("case 1");
                 break;  //optional  
                case 2:      
                    System.out.println("case 2");
                 break;  //optional   
                case 3:    
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;

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
              //  System.out.print("\033[H\033[2J");  
              //  System.out.flush(); 
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
        
        //Ver meus pokemons
        
        //informações pokemon
}
