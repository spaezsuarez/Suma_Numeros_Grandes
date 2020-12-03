package controllers;

import models.Lista;

public class Controller {

    private Lista listaUno,listaDos;
    private String result;

    public String getResult() {
        return result;
    }

    public Lista initList(String data,Lista lista){
        for(int i = data.length(); i >= 0 ;i = i-4){
            try{
                lista.add(Integer.parseInt(data.substring(i-4,i)));
            }catch(IndexOutOfBoundsException e){
                lista.add(Integer.parseInt(data.substring(0,i)));
            }
        }

        return lista.reverse();
    }

    public Controller(String num1,String num2){
        listaUno = new Lista();
        listaDos = new Lista();

        listaUno = initList(num1,listaUno);
        listaDos = initList(num2,listaDos);

        listaUno.escribir();
        listaDos.escribir();


    }
    
}
