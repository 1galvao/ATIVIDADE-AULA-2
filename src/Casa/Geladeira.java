/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Galvão
 */
public class Geladeira {
    private String tipo; 
    private String cor;
    private int numPortas;
    private int capacidade;
    private int voltag;
    
    void imprimeDados(){
        System.out.println("---------Geladeira---------");
        System.out.println(" Fabricante  | "+tipo);
        System.out.println("N° de portas | "+numPortas);
        System.out.println(" Capacidade  | "+capacidade+"L");
        System.out.println("    Cor      | "+cor);
        System.out.println("  Voltagem   | "+voltag+"V");
        
    } 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVoltag() {
        return voltag;
    }

    public void setVoltag(int voltag) {
        this.voltag = voltag;
    }

}   