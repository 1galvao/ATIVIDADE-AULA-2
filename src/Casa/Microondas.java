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
public class Microondas {
    private String marca;
    private int litros;
    private String cor1;
    private int volt;
    private int poten;

    void imprimirDadoss(){
        System.out.println();
        System.out.println("---------Micro-ondas---------");
        System.out.println("    Fabricante     | "+marca);
        System.out.println("      Litros       | "+litros+"L");
        System.out.println("     Voltagem      | "+volt+"V");
        System.out.println("        Cor        | "+cor1);
        System.out.println("Niveis de potência | "+poten);
    }

    public int getPoten() {
        return poten;
    }

    public void setPoten(int poten) {
        this.poten = poten;
    }
 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public String getCor1() {
        return cor1;
    }

    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }  
}
    
            
