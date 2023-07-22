package sp.senai.br.jogo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    public Scanner teclado = new Scanner(System.in);
    
    public static void perguntarNomes(){
    
 
    }    
    
    public static void main (String[] args){
    
        
        Personagens personagemUm = new Personagens();
        Personagens personagemDois = new Personagens();
       
         
        Batalha ultimateBattle  = new Batalha();

        Ataque ataqueUm    = new  Ataque();
        Ataque ataqueDois  = new  Ataque();
       
        ataqueUm.setAtributos(5.00,1.00,5.00,0.00);
        ataqueDois.setAtributos(5.00,1.00,3.00,0.00);

        ultimateBattle.setPersonagemUm(personagemUm);
        ultimateBattle.setPersonagemDois(personagemDois);
        
         ultimateBattle.setNome();
         ultimateBattle.setClasses();
        
        ultimateBattle.setAtaqueUm(ataqueUm);
        ultimateBattle.setAtaqueDois(ataqueDois);  
    
        while(ultimateBattle.emAndamento == true){

        ultimateBattle.ataquePersonagemUm();
         
        if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 || ultimateBattle.getPersonagemUm().getPontosVida()== 0.00){
        ultimateBattle.emAndamento = false;
    
    }
        ultimateBattle.ataquePersonagemDois();

        if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 || ultimateBattle.getPersonagemUm().getPontosVida()== 0.00){
        ultimateBattle.emAndamento = false;
    }
    
    }
        System.out.printf("Vida P1: %f",ultimateBattle.getPersonagemUm().getPontosVida());
        System.out.printf("Vida P2: %f",ultimateBattle.getPersonagemDois().getPontosVida());
    }   
}