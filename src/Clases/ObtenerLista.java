package Clases;

import java.util.ArrayList;

public class ObtenerLista {

    public ArrayList<String> stack; //Guarda nombre de las carpetas mientas se busca
    public ArrayList<String> rutasEncontradas;
    public int index = -1;

    public ObtenerLista() {
        stack = new ArrayList<>();
        rutasEncontradas = new ArrayList<>();
    }

    public void push(String dir) { //Agrega una carpeta a stack y aumenta el index
        index++;
        stack.add(dir);
    }

    public String pop() { //Devuelve la dirección de la siguiente carpeta a examinar (index=-1 significa que no hay carpetas en el stack)
        String dir;
        if (index == -1) {
            return "&%@#";
        } else {
            dir = stack.get(index);
            stack.remove(stack.size()-1);
            index--;
        }
        return dir;
    }

}
