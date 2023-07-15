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
    private Double força;      
    private Double energia;
    private Double agilidade;
    private Double vitalidade;
    private Double forca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtributos(Double vida,Double mana,Double Stamina,Double forca,Double energia,Double agilidade,Double vitalidade){
      this.pontosVida    = vida;
      this.pontosMana    = mana;
      this.pontosStamina = Stamina;
      this.forca         = forca;
      this.energia       = energia;
      this.agilidade     = agilidade;
      this.vitalidade    = vitalidade;
            
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

    public Double getForça() {
        return força;
    }

    public void setForça(Double força) {
        this.força = força;
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
}