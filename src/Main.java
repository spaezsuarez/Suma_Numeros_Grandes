import models.Lista;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista l = new Lista();
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de elementos a ingresar"));

        for(int i = 0; i < cantidad; i++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: " + (i+1)));
            l.add(valor);
        }

        l.escribir();

        int remover = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a buscar"));
        l.remove(remover);

        l.escribir();

        entrada.close();
        System.exit(0);
        
    }
}