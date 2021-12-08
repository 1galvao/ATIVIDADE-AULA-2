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
public class Principal {

    public static void main(String[] args) {
        Geladeira gela = new Geladeira();
        gela.setTipo("Brastemp");
        gela.setCor("Cinza");
        gela.setNumPortas(2);
        gela.setCapacidade(375);
        gela.setVoltag(220);
        
        gela.imprimeDados();
        
        Microondas micro = new Microondas();
        micro.setMarca("Electrolux");
        micro.setLitros(40);
        micro.setVolt(110);
        micro.setCor1("Branco");
        micro.setPoten(10);
        
        micro.imprimirDadoss();
    }
    
}
