
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.jogo;

/**
 *
 * @author aluno
 */
public class Batalha {
    
    private int qtdTurnoLimite;
    private int qtdTurnoAtual;
    
    private Personagens personagemUm;
    private Personagens personagemDois;
    
    private Ataque ataqueUm; 
    private Ataque ataqueDois;
    
    private int personagemVitoriasUm;
    private int personagemVitoriasDois;
    
    public boolean emAndamento = true;
        
    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagens getPersonagemUm() {
        return personagemUm;
    }

    public Personagens getPersonagemDois() {
        return personagemDois;
    } 
    
    public void setPersonagemUm(Personagens personagemUm) {
        this.personagemUm = personagemUm;
    }

    public void setPersonagemDois(Personagens personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemVitoriasUm() {
        return personagemVitoriasUm;
    }

    public void setPersonagemVitoriasUm(int personagemVitoriasUm) {
        this.personagemVitoriasUm = personagemVitoriasUm;
    }

    public int getPersonagemVitoriasDois() {
        return personagemVitoriasDois;
    }

    public void setPersonagemVitoriasDois(int personagemVitoriasDois) {
        this.personagemVitoriasDois = personagemVitoriasDois;
    }
    public void ataquePersonagemUm()
    {        
       this.personagemUm.consumirMana(this.ataqueUm.getRequisitoMana());
       this.personagemUm.consumirStamina(this.ataqueUm.getRequisitoStamina());
       
       this.personagemDois.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
       this.personagemDois.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
       
        System.out.println("Personagem 1 atacou > personagem 2");
    }  
    
    public void ataquePersonagemDois()
    {           
       this.personagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
       this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());
       
       this.personagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
       this.personagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
       
        System.out.println("Personagem 2 atacou > pesonagem 1");
     }
      
      public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

     public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
            
    
    
}
