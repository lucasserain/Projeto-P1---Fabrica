package projetop1;

/**
 * Classe referente a moto
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe contém os métodos e atributos de uma Moto, que é um veiculo a ser gerado no mundo.
 */

/**Declaração da classe Moto que herda da classe Veiculo*/
public class Moto extends Veiculo {
    /**Declara um construtor sem parametros da classe Moto*/
    public Moto() {
    }
    /**Declara um construtor com os parametros posição x e y e velociadade da moto*/ 
    public Moto(int x, int y) {
        super(x, y, 3);
    }
    /**Declara um construtor de Moto chamando a superclasse passando como parametro um tipo Moto.*/    
    public Moto(Moto motobike) {
        super();
    }
    private String tipo;    
}
