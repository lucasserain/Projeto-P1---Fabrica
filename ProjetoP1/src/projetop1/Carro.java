package projetop1;

/**
 * Classe referente ao Carro
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe contém os métodos e atributos de um Carro, que é um veiculo a ser gerado no mundo.
 */
/**Declaração da classe Carro que herda da classe Veiculo*/
public class Carro extends Veiculo  {
    
    /**Declara um construtor com os parametros todos os parametros da Superclasse.*/ 
    public Carro(int num_passageiros, int y, int x, int velocidade, boolean fabrica) {
        super(y, x, velocidade, fabrica);
        this.num_passageiros = num_passageiros;  
    }
    /**Declara um construtor com os parametros posição em x e y e velocidade do objeto*/ 
    public Carro(int x, int y){
        super(x,y,2);
    }
    /**Declara um construtor de Carro chamando a superclasse que recebe como parametro um tipo Carro.*/
    public Carro(Carro car){
        super();
    }

    private int num_passageiros;
    
}
