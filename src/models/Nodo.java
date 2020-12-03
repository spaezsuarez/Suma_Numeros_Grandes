package models;

public class Nodo {

    private int value;
    private Nodo nodoSiguiente,nodoAnterior;

    public Nodo(int value){
        this.value = value;
        this.nodoSiguiente = null;
        this.nodoAnterior = null;
    }

    public Nodo(){}

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setNodoSiguiente(Nodo nodo){
        this.nodoSiguiente = nodo;
    }

    public Nodo getNodoSiguiente(){
        return nodoSiguiente;
    }

    public void setNodoAnterior(Nodo nodo){
        this.nodoAnterior = nodo;
    }

    public Nodo getNodoAnterior(){
        return nodoAnterior;
    }
}