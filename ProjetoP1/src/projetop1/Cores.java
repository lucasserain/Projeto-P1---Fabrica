package projetop1;
/**
 * Classe responsável por armazenar todas as cores e formatação do mundo do software.
 * @author Lucas Machado Serain 
 * @version 1.0
 * RA: 22.217.007-8
 * Projeto de P1 - POO - Mundo de Carros
 * Esta classe contém constantes definidas, as quais ao serem referenciadas permitem que seja
 * possível alterar a cor do console do JAVA.
 */

public class Cores {
    /**Declaração das constantes contendo as cores*/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_TESTE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001b[39m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_TESTE_BACKGROUND = "\u001B[35m";
    
    /**Função responsável por exibir a borda do mundo em cor Verde.*/
    public void printBorda(){
        System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET);
    }
    /**Função responsável por exibir a cor de fundo do mundo em cor Ciano.*/
    public void printBG(){
        System.out.print(ANSI_CYAN_BACKGROUND + " " + ANSI_RESET);
    }
    /**Função responsável por exibir as fábricas do mundo em cor Roxo.*/
    public void printFab(){
        System.out.print(ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET);
    }
    /**Função responsável por exibir os carros do mundo em cor Amarelo.*/
    public void printCarro(){
        System.out.print(ANSI_YELLOW_BACKGROUND+ " " + ANSI_RESET);
    }
    /**Função responsável por exibir os caminhões do mundo em cor Vermelho.*/
    public void printCaminhao(){
        System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
    }
    /**Função responsável por exibir as motos do mundo em cor Azul.*/
    public void printMoto(){
        System.out.print(ANSI_BLUE_BACKGROUND+ " " + ANSI_RESET);
    }
    /**Função responsável por exibir as bicicletas do mundo em cor Branco.*/
        public void printBike(){
        System.out.print(ANSI_WHITE_BACKGROUND+ " " + ANSI_RESET);
    }
    /**Função responsável por fazer a limpeza de cores.*/
    public void limpaTela(){
        System.out.print(" " + ANSI_RESET);
    }   
}
