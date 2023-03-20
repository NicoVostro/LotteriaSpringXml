package it.progettospring;

public class Giocatore {
    private int puntato;
    private int[] giocati;
    private String nomeGiocatore;

    public int getPuntato() {
        return puntato;
    }
    public void setPuntato(int puntato) {
        this.puntato = puntato;
    }
    public int[] getGiocati() {
        return giocati;
    }
    public void setGiocati(int[] giocati) {
        this.giocati = giocati;
    }
    public String getNomeGiocatore() {
        return nomeGiocatore;
    }
    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }
}
