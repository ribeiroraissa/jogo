
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.jogo;

import java.util.Scanner;

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
    
     public Scanner teclado = new Scanner(System.in);
    
    
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
       
    System.out.printf("%s 1 atacou > %s \n", this.personagemUm.getNome(),this.personagemDois.getNome());
         
    }  
    
    public void ataquePersonagemDois()
    {           
       this.personagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
       this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());
       
       this.personagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
       this.personagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
       
       
    System.out.printf("%s 2 atacou > %s \n", this.personagemDois.getNome(),this.personagemUm.getNome());
      
    }
      
    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    public void setNome(){    
      System.out.println("Digite o nome do personagem 1:");
    
      String nome = teclado.next();
      
      this.personagemUm.setNome(nome);
      
      teclado.nextLine();
      
      System.out.println("Digite o nome do personagem 2:");
    
      nome = teclado.next();
      
      this.personagemDois.setNome(nome);
      
    }
    public void setClasses()
 {
    System.out.println("Por favor selecione a classe do personagem 1:");
    System.out.println("[1]mago | [2]Duelista | [3]Iron | [4]Faker");
   
    int classe = teclado.nextInt();
    
    if(classe == 1){
    this.personagemDois.setClasse(Classe.Mago());
    }
    if(classe == 2){
    this.personagemDois.setClasse(Classe.Duelista());
    }
    if(classe == 3){
    this.personagemDois.setClasse(Classe.iron());
    }
    if(classe == 4){
    this.personagemDois.setClasse(Classe.Faker());
    }
 }
}