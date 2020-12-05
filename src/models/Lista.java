package models;

public class Lista {

    private Nodo cabeza, cola;
    private int largo;

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public int getlargo() {
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

        if (p.getNodoSiguiente() == null) {
            cola = p;
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
        } else if (temp == null) {
            s.setNodoSiguiente(null);
            cola = s;
        } else {
            s.setNodoSiguiente(temp);
            temp.setNodoAnterior(s);
        }

    }

    public Lista reverseList(int largo) {

        Lista lista = new Lista();
        Nodo iterador = cola;

        for (int i = 0; i < largo; i++) {
            if (iterador != null) {
                String value = iterador.getValue();
                lista.add(value);
                this.remove(value);
            }
            iterador = cola;
        }
        return lista;
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
