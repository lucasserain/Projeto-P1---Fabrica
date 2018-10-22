
package projetop1;
import java.util.Random;
/**
 * Classe referente a geração de números aleatórios
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe é responsavel por gerar números aleatórios dada a circustância.
 */

/**Declaração da classe RandomNum */
public class RandomNum {
    private int random;
    /**Neste método é gerado um número de 0 a 4, esses números são responsáveis por gerar a movimentação aleatória dos objetos.*/
    public int geraDir(){
        int randDir =  (int) (1 + Math.random() * 3);
        return randDir;
    }
    
    /**Método responsável por gerar a posição do objto no mapa, para isso recebe como parametro
     o tamanho máximo e permitido locomação da matriz.*/
    public int geraPos(int valor){
        int randPos = (int) (1 + Math.random() * valor);
        return randPos;
    }
}
