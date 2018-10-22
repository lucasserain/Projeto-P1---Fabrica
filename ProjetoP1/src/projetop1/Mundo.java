package projetop1;
import java.util.ArrayList;
/**
 * Classe referente a criação, desenho e atualização do mapa do software
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta é a classe mais importante do software, com  ela é possivel, atualizar e desenhar o mundo e seus objetos.
 * Cores: Verde = Bordas do mapa, Ciano = Background, Rosa = Fábricas.
 * Amarelo = Carro, Caminhao = Vermelho, Moto = Azul, Bicicleta = Branco.
 */
/**Declaração da classe Mundo */
public class Mundo{
    /**Instanciamento da classe color, responsável por gerar as cores do console. */
    Cores color = new Cores();
    /**Instanciamento da classe rand, responsável por gerar numeros aleatorios.*/
    RandomNum rand = new RandomNum();
    /**Declaração do ArrayList de carro, com o nome do objeto de car.*/
    ArrayList<Carro> car = new ArrayList<>();
    /**Declaração do ArrayList de Caminhão, com o nome do objeto de truck.*/
    ArrayList<Caminhao> truck = new ArrayList<>();
    /**Declaração do ArrayList de Moto, com o nome do objeto de motobike.*/
    ArrayList<Moto> motobike = new ArrayList<>();
    /**Declaração do ArrayList de bike, com o nome do objeto de bike.*/
    ArrayList<Bicicleta> bike = new ArrayList<>();

    /**Construtor do mundo sem parametro, utilizado para setar seu tamanho máximo.*/
    public Mundo() {
        this.tamanho_x = 30;
        this.tamanho_y = 60;
    }
    /**Declaração do método desenhaMundo, resposável por desenhar todos os componentes do mapa.*/
    public void desenhaMundo()
    {   
        /**Variavel para definir o numéro de veiculos inicialmente gerados*/
        int numVec = 10;
        /**Flag para indicar se o objeto foi exibido ou não, caso não haja a utilização de flag, ao realizar
         o print dos objetos os mesmos irão icrementar  a matriz, dessa maniera deixando-a maior e incorreta.*/
        boolean Flag;

        /**Criação dos veiculos através de arraylist, ao gerar um veiculo é solicitado sua posição no X e Y do mundo
         os valores foram gerados pela classe RandomNum;*/
        for (int i = 0; i<numVec ; i++){
            car.add(new Carro(rand.geraPos(58), rand.geraPos(28)));
        }
        for (int i = 0; i<numVec ; i++){
            truck.add(new Caminhao(rand.geraPos(58), rand.geraPos(28)));
        }  
        for (int i = 0; i<numVec ; i++){
            motobike.add(new Moto(rand.geraPos(58), rand.geraPos(28)));
        }
        for (int i = 0; i<numVec ; i++){
            bike.add(new Bicicleta(rand.geraPos(58), rand.geraPos(28)));
        }
       /**Condição para que o programa rode equanto estiver true (1).*/
       while(true)
        {   
            /**Utilizado um Try Catch para que a exibição do console no NetBeans seja arepsentado de forma correta,
             a ausencia desta linha remete a uma exibição confusa e inperceptivel de uso.*/
            try
            /**Faz com que haja um delay de 500ns para a exibição do software.*/    
            {Thread.sleep(500);
                Thread.sleep(500);
            } 
            catch (InterruptedException ex) {}
            for (int i = 0; i < 100; i++) 
            {
                System.out.println();
            }
            
            /**Exibição das informações do mundo, quantos veiculos e quantas colisões registradas.*/
            System.out.println("Carros: " + car.size());//Contador de carros
            System.out.println("Motos: " + motobike.size());//Contador de cmotos
            System.out.println("Bicicletas: " + bike.size());//Contador de bicicletas
            System.out.println("Caminhões: " + truck.size());//Contador de Caminhões
            System.out.println("Colisões: " + cont_Coli);//Contador de Colisão

            /**Este for garante que seja desenhada a matriz do mundo, desenhando-a conforme os
             atributos de tamanho em x e y*/
            /**For para percorrer linhas.*/
            for(int i = 0;i<this.tamanho_x;i++)
            {   /**For para percorrer colunas.*/
                for(int j = 0;j<this.tamanho_y;j++)
                {   /**Desabilita a flag para impressão, dessa maneira é entendido que nada foi printado ainda.*/
                    Flag = false;
                    /** For para percorrer o arraylist de Carro, utilizado a terceira opção para percorrer.*/
                    for (Carro car : car) 
                    {   /**Teste para verificar qual posição na matriz o carro se encontra em cada indice.*/
                        if (j == car.getX() && i == car.getY()) 
                        {   /**Chamada da função que desenha o carro na matriz.*/
                            color.printCarro();
                            /**Habilitação da flag de impressão, assim é entendindo que o objeto já foi impresso na tela
                             *Caso contrário, o programa irá imprimir o objetivo e ele irá acrescentar valores a matriz,
                             * fazendo-a exceder seu limite.*/
                            Flag = true;
                            /**Teste para verificar se o veiculo está postado em uma fábrica,
                             * esse teste verifica se ele está em uma posição de numero 2,
                             *caso esteja é chamado então a função fabricaVeiculo, com o parametro de identificação.
                             *Essa função gera mais um carro no mapa.*/
                            if(mapa[i][j] == 2)
                            {
                                fabricaVeiculo(1);
                            }
                            /**Força o encerramento da operação.*/
                            break;
                        }
                    }
                    /**Teste para verificar se flag está em true, se estiver nada é feito e a lógica é seguida sequencialmente*/
                    if (Flag) {} 
                    else
                    {   /** For para percorrer o arraylist de Caminhão, utilizado a terceira opção para percorrer.*/
                        for (Caminhao truck : truck) 
                        {   /**Teste para verificar qual posição na matriz o caminhão se encontra em cada indice.*/
                            if (j == truck.getX() && i == truck.getY()) 
                            {   /**Chamada da função que desenha o caminhão na matriz.*/
                                color.printCaminhao();
                                /**Habilitação da flag de impressão, assim é entendindo que o objeto já foi impresso na tela
                                *Caso contrário, o programa irá imprimir o objetivo e ele irá acrescentar valores a matriz,
                                * fazendo-a exceder seu limite.*/
                                Flag = true;
                                /**Teste para verificar se o veiculo está postado em uma fábrica,
                                * esse teste verifica se ele está em uma posição de numero 2,
                                *caso esteja é chamado então a função fabricaVeiculo, com o parametro de identificação.
                                *Essa função gera mais um camihão no mapa.*/
                                if(mapa[i][j] == 2)
                                {
                                    fabricaVeiculo(2);
                                }
                                /**Força o encerramento da operação.*/
                                break;
                            }
                        }
                    }
                    /**Teste para verificar se flag está em true, se estiver nada é feito e a lógica é seguida sequencialmente*/
                    if (Flag) {}
                    else
                    {   /** For para percorrer o arraylist de Moto, utilizado a terceira opção para percorrer.*/
                        for (Moto motobike : motobike) 
                        {   /**Teste para verificar qual posição na matriz o caminhão se encontra em cada indice.*/
                            if (j == motobike.getX() && i == motobike.getY()) 
                            {   /**Chamada da função que desenha o carro na matriz.*/
                                color.printMoto();
                                /**Habilitação da flag de impressão, assim é entendindo que o objeto já foi impresso na tela
                                *Caso contrário, o programa irá imprimir o objetivo e ele irá acrescentar valores a matriz,
                                * fazendo-a exceder seu limite.*/                                
                                Flag = true;
                                /**Teste para verificar se o veiculo está postado em uma fábrica,
                                * esse teste verifica se ele está em uma posição de numero 2,
                                *caso esteja é chamado então a função fabricaVeiculo, com o parametro de identificação.
                                *Essa função gera mais uma moto no mapa.*/                               
                                if(mapa[i][j] == 2)
                                {
                                    fabricaVeiculo(3);
                                }
                                /**Força o encerramento da operação.*/
                                break;
                            }
                        }
                    }
                    /**Teste para verificar se flag está em true, se estiver nada é feito e a lógica é seguida sequencialmente*/
                    if (Flag) {}
                    else
                    {   /** For para percorrer o arraylist de Bicicleta, utilizado a terceira opção para percorrer.*/
                        for (Bicicleta bike : bike) 
                        {   /**Teste para verificar qual posição na matriz a bicicleta se encontra em cada indice.*/
                            if (j == bike.getX() && i == bike.getY()) 
                            {   /**Chamada da função que desenha a moto na matriz.*/
                                color.printBike();
                                /**Habilitação da flag de impressão, assim é entendindo que o objeto já foi impresso na tela
                                *Caso contrário, o programa irá imprimir o objetivo e ele irá acrescentar valores a matriz,
                                * fazendo-a exceder seu limite.*/   
                                Flag = true;
                                /**Teste para verificar se o veiculo está postado em uma fábrica,
                                * esse teste verifica se ele está em uma posição de numero 2,
                                *caso esteja é chamado então a função fabricaVeiculo, com o parametro de identificação.
                                *Essa função gera mais uma bicicleta no mapa.*/                                 
                                if(mapa[i][j] == 2)
                                {
                                    fabricaVeiculo(4);
                                }
                                /**Força o encerramento da operação.*/
                                break;
                            }
                        }   
                    }
                    /**Teste para verificar se flag está em true, se estiver nada é feito e a lógica é seguida sequencialmente*/                    
                    if (Flag) {}
                    else
                    {   /**Verifica a matriz mapa e caso o valor seja 1 entende-se que são as bordas do mapa, então é
                        *chamado a função para printar a borda do mapa.*/
                        if(this.mapa[i][j]==1)
                        { //Desenha bordas
                            color.printBorda();
                        }
                        /**Verifica a matriz mapa e caso o valor seja 2 entende-se que são as fábricas no mapa, então é
                        *chamado a função para printar as fabricas no mapa.*/
                        if(this.mapa[i][j]==2)
                        {   //Desenha Fabrica
                            color.printFab();
                            
                        }
                        /**Verifica a matriz mapa e caso o valor seja 0 entende-se que é o fundo andável do mapa, então é
                        *chamado a função para printar o fundo do mapa.*/
                        if(this.mapa[i][j]==0)
                        { //Desenha fundo
                            color.printBG();
                        }
                    }
                    Colisao();                 
                }
            /**Pular uma linha depois de ser realizado o for de impressão.*/       
            System.out.println();
            }
            /**Percorre o arraylist de carro é a cada indice é chamado a função de mover do veículo.*/
            for (Carro car : car) 
            {
                car.move();
            }
            /**Percorre o arraylist de caminhão é a cada indice é chamado a função de mover do veículo.*/
            for (Caminhao truck : truck) 
            {
                truck.move();
                /**Aqui ocorre um incremente de uma váriavel contador, a cada movimento do caminhão a variavel
                 *cont_Mov_Truck é incrementada, isso para que seja possível realizar o movimento da bicileta.*/
                cont_Mov_Truck++;
            }
            /**Percorre o arraylist de moto é a cada indice é chamado a função de mover do veículo.*/
            for (Moto motobike : motobike) 
            {
                motobike.move();
            }
            /**Percorre o arraylist de bicileta, como a bicicleta tem sua velocidade em 0.5, então ela só se move a cada 
             * duas iterações, ou seja, a cada dois movimentos do caminhão a bicicleta se move uma vez.*/
            for (Bicicleta bike : bike) 
            {
                if(cont_Mov_Truck %2 ==0)
                {
                    bike.move();
                }
            }
            

        }
    }
    
    /**Função que gera veiculo toda vez que o mesmo passa por uma fábrica.*/
    public void fabricaVeiculo(int tipo){
        /**Toda vez que e um carro passa por uma fábrica é gerado um outro carro com posição aleatória no mapa*/
        if(tipo==1){
            car.add(new Carro(rand.geraPos(58), rand.geraPos(28)));
       }
        /**Toda vez que e um caminhão passa por uma fábrica é gerado um outro caminhão com posição aleatória no mapa*/
        if(tipo==2){
            truck.add(new Caminhao(rand.geraPos(58), rand.geraPos(28)));
       }
        /**Toda vez que e uma mota passa por uma fábrica é gerado uma outra moto com posição aleatória no mapa*/
        if(tipo==3){
            motobike.add(new Moto(rand.geraPos(58), rand.geraPos(28)));
       }
        /**Toda vez que e uma bicicleta passa por uma fábrica é gerado uma outra bicicleta com posição aleatória no mapa*/
       if(tipo==4){
            bike.add(new Bicicleta(rand.geraPos(58), rand.geraPos(28)));
       }       
    }
    /**Lógica da colisão, quando x veiculo colidir com x veiculo, lei do mais forte se aplicara e o mais fraco ser eliminado*/
    public void Colisao(){
        /**Lógica da colisão do caminhão em relação aos outros veiculos, é verificado todo o array do caminhão contanto que ele não esteja vazio
         * e então e verficado a colisao buscando seu x e Y e comparando com de outros veiculos, depois é excluido o ojeto do array e então o mesmo é atualizado
         *para que as posições do vetor se ajustem..*/
        for(int i=0; i< truck.size() && !truck.isEmpty(); i++){
            for(int j=i+1; j < (truck.size() - 1); j++){
                if(truck.get(i).getY() == truck.get(j).getY() && truck.get(i).getX() == truck.get(j).getX()){
                    truck.remove(j);
                    truck.remove(i);
                    j = i+1;
                    cont_Coli++;
                }
            }
            for(int k=0; k<car.size() && !car.isEmpty(); k++){
                if(truck.get(i).getY() == car.get(k).getY() && truck.get(i).getX() == car.get(k).getX()){
                    car.remove(k);
                    k--;   
                    cont_Coli++;
                }
            }
            for(int l = 0; l < motobike.size() && !motobike.isEmpty(); l++){
                if(truck.get(i).getY() == motobike.get(l).getY() && truck.get(i).getX() == motobike.get(l).getX()){
                    motobike.remove(l);
                    l--;
                    cont_Coli++;
                }
                
            }
            for(int m = 0; m < bike.size() && !bike.isEmpty(); m++){
                if(truck.get(i).getY() == bike.get(m).getY() && truck.get(i).getX() == bike.get(m).getX()){
                    bike.remove(m);
                    m--;
                    cont_Coli++;
                }
                
            }         
            
        }
//Carro
   for(int i=0; i< car.size() && !car.isEmpty(); i++){
            for(int j=i+1; j < (car.size() - 1); j++){
                if(car.get(i).getY() == car.get(j).getY() && car.get(i).getX() == car.get(j).getX()){
                    car.remove(j);
                    car.remove(i);
                    j = i+1;
                    cont_Coli++;
                }
            }
            for(int l = 0; l < motobike.size() && !motobike.isEmpty(); l++){
                if(car.get(i).getY() == motobike.get(l).getY() && car.get(i).getX() == motobike.get(l).getX()){
                    motobike.remove(l);
                    l--;
                    cont_Coli++;
                }
                
            }
            for(int m = 0; m < bike.size() && !bike.isEmpty(); m++){
                if(car.get(i).getY() == bike.get(m).getY() && car.get(i).getX() == bike.get(m).getX()){
                    bike.remove(m);
                    m--;
                    cont_Coli++;
                }
                
            }         
        }
   //Moto
   for(int i=0; i< motobike.size() && !motobike.isEmpty(); i++){
            for(int j=i+1; j < (motobike.size() - 1); j++){
                if(motobike.get(i).getY() == motobike.get(j).getY() && motobike.get(i).getX() == motobike.get(j).getX()){
                    motobike.remove(j);
                    motobike.remove(i);
                    j = i+1;
                    cont_Coli++;
                }
            }
            for(int m = 0; m < bike.size() && !bike.isEmpty(); m++){
                if(motobike.get(i).getY() == bike.get(m).getY() && motobike.get(i).getX() == bike.get(m).getX()){
                    bike.remove(m);
                    m--;
                    cont_Coli++;
                }
                
            }         
        }
   //Bike
      for(int i=0; i< bike.size() && !bike.isEmpty(); i++){
            for(int j=i+1; j < (bike.size() - 1); j++){
                if(bike.get(i).getY() == bike.get(j).getY() && bike.get(i).getX() == bike.get(j).getX()){
                    bike.remove(j);
                    bike.remove(i);
                    j = i+1;
                    cont_Coli++;
                }
            }         
        }
    }
    /**Declarção do atributo mapa, o qual representa a matriz do mundo.*/
    public int mapa[][]=
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,1},
        {1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
        {1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    /**Atributo que representa o tamanhao em X do mapa.*/
    private int tamanho_x;
    /**Atributo que representa o tamanhao em Y do mapa.*/
    private int tamanho_y;
    /**Atributo que representa o contador de movimento do caminhão.*/
    public int cont_Mov_Truck = 0;
    /**Atributo que representa o contador de colisões.*/
    public int cont_Coli = 0;
}
