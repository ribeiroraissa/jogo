package sp.senai.br.jogo;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main (String[] args){
    
        
        Personagens personagemUm = new Personagens();
        Personagens personagemDois = new Personagens();

        Batalha ultimateBattle  = new Batalha();

        Ataque ataqueUm    = new  Ataque();
        Ataque ataqueDois  = new  Ataque();

        personagemUm.setNome("Pagode");
        personagemUm.setAtributos(100.00,100.00,25.00,25.00,25.00,25.00,25.00);

        personagemDois.setNome("Rock");
        personagemDois.setAtributos(100.00,100.00,25.00,25.00,25.00,25.00,25.00);

        ataqueUm.setAtributos(5.00,1.00,5.00,0.00);
        ataqueDois.setAtributos(5.00,1.00,3.00,0.00);

        ultimateBattle.setPersonagemUm(personagemUm);
        ultimateBattle.setPersonagemDois(personagemDois);
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
        System.out.prinf("Vida P1: %f",ultimateBattle.getPersonagemUm().getPontosVida());
        System.out.prinf("Vida P2: %f",ultimateBattle.getPersonagemDois().getPontosVida());
    }   
}