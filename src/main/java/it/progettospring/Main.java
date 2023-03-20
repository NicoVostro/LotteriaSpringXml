package it.progettospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static int [] myNumbers = {40, 50, 60, 80, 90};
    static ApplicationContext context = null;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beansBis.xml");
        hasWin();
        beansGenerati();
    }
    static void hasWin(){
        int contatore = 0;
        Lotto lotteria = (Lotto) context.getBean("luckyfortune");
        Giocatore gioc1 = (Giocatore) context.getBean("player");
        int[] generati = lotteria.getNumber();
        for (int generato : generati) {
            System.out.print(generato + " ");
        }
        System.out.println();
        for(int x=0; x<5; x++){
            for(int i=0; i<5; i++){
                if(myNumbers[x] == generati[i]){
                    contatore++;
                }
            }
        }
        System.out.println("Ciao " + gioc1.getNomeGiocatore());
        System.out.printf("Hai indovinato %d numeri.%n", contatore);
        System.out.println("Hai puntato " + gioc1.getPuntato() + " euro.");
        int vinto = (contatore>1)? gioc1.getPuntato()*2 : 0;
        System.out.println("Hai vinto " + vinto + " euro.");
    }

    static void beansGenerati(){
        System.out.println("\nAbbiamo i seguenti beans: ");
        for (String singoliBean : context.getBeanDefinitionNames()) {
            System.out.println(singoliBean);
        }
    }
}