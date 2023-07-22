/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.jogo;

/**
 *
 * @author aluno
 */
public class Personagens {
    
    private String nome;
    private Double pontosVida;
    private Double pontosMana;
    private Double pontosStamina;
    private Double forca;      
    private Double energia;
    private Double agilidade;
    private Double vitalidade;
    private Classe classe;

    
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    
            
    }         
    public Double getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(Double pontosVida) {
        this.pontosVida = pontosVida;
    }

    public Double getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(Double pontosMana) {
        this.pontosMana = pontosMana;
    }

    public Double getForca() {
        return forca;
    }

    public void setForça(Double forca) {
        this.forca = forca;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public Double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Double agilidade) {
        this.agilidade = agilidade;
    }

    public Double getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(Double vitalidade) {
        this.vitalidade = vitalidade;
    }
    
    public void consumirMana(Double Mana){
         this.pontosMana -= Mana;
    }
    public void consumirStamina(Double Stamina){
         this.pontosStamina -= Stamina;
    } 
    public void sofrerDanoFisico(Double dano){
         this.pontosVida -= dano;
    }     
    public void sofrerDanoMagico (Double dano){
         this.pontosVida -= dano;

    }
    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    
    this.pontosVida        = classe.pontosVida;
    this.pontosMana        = classe.pontosMana;
    this. pontosStamina    = classe.pontosStamina;
    this.forca             = classe.força;
    this. energia          = classe.energia;
    this. agilidade        = classe.agilidade;
    this. vitalidade       = classe.vitalidade;
}
}