package projetop1;
import java.util.ArrayList;
/**
 * Classe principal do projeto
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Programa que simula um mundo com bordas infinitas no qual são gerados 4 tipos de veiculos.
 * Os veiculos se movem e são gerados de maneira aleatória, ao passarem por fábricas(ROXO),
 * é gerado um novo veículo referente ao veiculo que passou pela fábrica.
 * Ao colidir com outros veiculos é aplicado a lei do mais forte.
 */
/**Classe principal do projeto*/
public class ProjetoP1 {
    
    public static void main(String[] args) {
        /** Instancia um objeto do tipo MUNDO, o qual é responsável por todos os dados do mundo do programa */
        Mundo world = new Mundo();
        /** chama o método desenhaMundo, o qual inicializa a matriz e aloca cada veiculo, suas colisões etc. */
        world.desenhaMundo(); 
    }
}
