package models;

public class Lista {

    private Nodo cabeza;
    private int largo;

    public Nodo getCabeza() {
        return cabeza;
    }

    public int getlargo(){
        return largo;
    }

    public Lista() {
        cabeza = null;
        largo = 0;
    }

    public void add(String value) {
        largo++;
        Nodo p = new Nodo(value);
        Nodo q = cabeza;
        Nodo s = null;

        while (q != null) {
            s = q;
            q = q.getNodoSiguiente();
        }

        if (s == null) {
            cabeza = p;
        } else {
            s.setNodoSiguiente(p);
            p.setNodoAnterior(s);
        }
    }

    public void remove(String value) {
        largo--;
        Nodo q = cabeza;
        Nodo s = null, temp = null;

        while (!(q.getValue().equals(value))) {
            q = q.getNodoSiguiente();
        }

        s = q.getNodoAnterior();
        temp = q.getNodoSiguiente();
        
        if (temp == null && s == null) {
            cabeza = null;
        } else if (s == null) {
            cabeza = q.getNodoSiguiente();
        } else if(temp == null){
            s.setNodoSiguiente(null);
        }else {
            s.setNodoSiguiente(temp);
            temp.setNodoAnterior(s);
        }

    }

    public Lista reverse(){

        Lista lista = new Lista();
        Nodo iterador = cabeza;
        while(this.cabeza != null){
            while (iterador.getNodoSiguiente() != null) {
                iterador = iterador.getNodoSiguiente();
            }
            if(iterador != null){
                String value = iterador.getValue();
                lista.add(value);
                this.remove(value);
                iterador = cabeza;
                if(iterador.getNodoAnterior() == null && iterador.getNodoSiguiente() == null){
                    lista.add(this.cabeza.getValue());
                    return lista;

                    
                }
                
            }
            
        }
        return null;
        

    }

    public void escribir() {
        Nodo iterador = cabeza;
        while (iterador != null) {
            System.out.print(iterador.getValue() + " ");
            iterador = iterador.getNodoSiguiente();
        }
        System.out.println();
    }

}
