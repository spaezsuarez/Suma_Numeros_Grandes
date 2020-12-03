package models;

public class Lista {

    private Nodo cabeza;

    public Nodo getCabeza() {
        return cabeza;
    }

    public Lista() {
        cabeza = null;
    }

    public void add(int value) {
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

    public void remove(int value) {
        Nodo q = cabeza;
        Nodo s = null, temp = null;

        while (q.getValue() != value) {
            q = q.getNodoSiguiente();
        }

        s = q.getNodoAnterior();
        temp = q.getNodoSiguiente();

        if (temp == null) {
            s.setNodoSiguiente(null);
        } else if (s == null) {
            cabeza = q.getNodoSiguiente();
        } else {
            s.setNodoSiguiente(temp);
            temp.setNodoAnterior(s);
        }

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
