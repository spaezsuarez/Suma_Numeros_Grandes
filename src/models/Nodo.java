package models;

public class Nodo {

    private String value;
    private Nodo nodoSiguiente,nodoAnterior;

    public Nodo(String value){
        this.value = value;
        this.nodoSiguiente = null;
        this.nodoAnterior = null;
    }

    public Nodo(){}

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
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