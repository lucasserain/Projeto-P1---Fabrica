package projetop1;

/**
 * Classe referente ao Caminhao
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe contém os métodos e atributos de um Caminhao, que é um veiculo a ser gerado no mundo.
 */

/**Declaração da classe Caminhao que herda da classe Veiculo*/
public class Caminhao extends Veiculo {
    
    /**Declara um construtor com parametros da classe Caminhao, passando a posição em x e y e a velocidade do veiculo.*/
    public Caminhao(int x, int y){
        super(x,y,1);
    }
    /**Declara um construtor de Caminhao chamando a superclasse passando como parametro um tipo Caminhao.*/
    public Caminhao (Caminhao truck){
        super();
    }
    private int capacidade_carga;
}
