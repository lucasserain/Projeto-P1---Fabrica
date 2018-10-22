package projetop1;
/**
 * Classe referente a Bicicleta
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe contém os métodos e atributos de uma Bicicleta, que é um veiculo a ser gerado no mundo.
 */

/**Declaração da classe Bicicleta que herda da classe Veiculo*/
public class Bicicleta extends Veiculo {
    /**Declara um construtor sem parametros da classe Bicicleta*/
    public Bicicleta() {
    }
    /**Declara um construtor com os parametros posição x e y da bicicleta*/    
    public Bicicleta(int x, int y) {
    /**Aqui é chamado o construtor da SuperClasse(Veiculo) passando como parametro posição x e y e a velocidade do veiculo*/
        super(x, y, 1);
    }
    /**Declara um construtor de Bicicleta chamando a superclasse passando como parametro um tipo Bicicleta.*/
    public Bicicleta(Bicicleta bike) {
        super();
    }
    
}
