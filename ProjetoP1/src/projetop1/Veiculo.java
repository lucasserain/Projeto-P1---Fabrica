package projetop1;
/**
 * Superclasse que abrange todos os veiculos do mundo
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta é uma superClasse responsável por todos os veiculos representados no mundo do software
 */

public class Veiculo  {
    /**Instanciamento da RandomNum criada para gerar números aleatórios. */
    RandomNum rand = new RandomNum();
    
    /**Declarçaõ de um construtor de Veiculo sem parametros*/
    public Veiculo() {};
    
    /**Declarçaõ de um construtor de Veiculo que recebe com parametro, posição x,y e velocidade.*/
    public Veiculo(int x, int y, int velocidade) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
    }

    /**Função move, responsável por realizar qualquer movimento de dentro do mundo*/
    public void move(){
        /**Chamando o método geraDir da classe rand, esse método gera um número de 0 a 4
         cada número está associado a uma direção, cada direção move o veiculo para uma posição na matriz.*/
        rand.geraDir();
        /**Quando o resultado de geraDir é igual a zero, então o veiculo se movimentará para cima, com o cálculo
         de sua posição em Y é igual  a sua posição em Y mais sua velocidade, dessa maneira cada veiculo terá sua própria velocidade.*/
        if(rand.geraDir()==0){ //Direção para cima
            this.y += this.velocidade;
        }
        /**Quando o resultado de geraDir é igual a 1, então o veiculo se movimentará para baixo, com o cálculo
         de sua posição em Y é igual  a sua posição em Y menos sua velocidade, dessa maneira cada veiculo terá sua própria velocidade.*/
        if(rand.geraDir()==1){ //Direção para baixo
            this.y -= this.velocidade;
        }
        /**Quando o resultado de geraDir é igual a 2, então o veiculo se movimentará para esquerda, com o cálculo
         de sua posição em X é igual  a sua posição em x menos sua velocidade, dessa maneira cada veiculo terá sua própria velocidade.*/
        if(rand.geraDir()==2){ //Direção para esquerda
            this.x -= this.velocidade;
        }
        /**Quando o resultado de geraDir é igual a 3, então o veiculo se movimentará para direita, com o cálculo
         de sua posição em X é igual  a sua posição em x mais sua velocidade, dessa maneira cada veiculo terá sua própria velocidade.*/
        if(rand.geraDir()==3){ //Direção para cima
            this.x += this.velocidade;
        }
        /**Como o mundo é infinito toda vez que o objeto passar pela borda ele deverá retornar para um ponto inicial, 
         a lógica é a seguinte, se o X do objeto for menor que 0, significa que ele está atravessando o mapa pela esquerda, então o objeto 
         é direcionado para uma posição a direita no mapa.*/
        if(this.x < 0)
            this.x=58;
        if(this.x >=58 )
            this.x = 1;
        if(this.y < 0)
            this.y=28;
        if(this.y >28 )
            this.y = 1;
    }
    
    
/**QMétodos get e set da classe.*/
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isFabrica() {
        return fabrica;
    }

    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }

    public Veiculo(int y, int x, int velocidade, boolean fabrica) {
        this.y = y;
        this.x = x;
        this.velocidade = velocidade;
        this.fabrica = fabrica;

    }
    private int x;
    private int y;
    private int velocidade;
    private boolean fabrica;
}
