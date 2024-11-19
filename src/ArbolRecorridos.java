class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

public class ArbolRecorridos {

    //inorden
    static void recorridoInOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        recorridoInOrden(nodo.izquierda);
        System.out.print(nodo.valor + " ");
        recorridoInOrden(nodo.derecha);
    }

    //posorden
    static void recorridoPosOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        recorridoPosOrden(nodo.izquierda);
        recorridoPosOrden(nodo.derecha);
        System.out.print(nodo.valor + " ");
    }

    public static void main(String[] args) {
        
        Nodo raiz = new Nodo(30);
        raiz.izquierda = new Nodo(20);
        raiz.derecha = new Nodo(40);
        raiz.izquierda.izquierda = new Nodo(10);
        raiz.izquierda.derecha = new Nodo(25);
        raiz.derecha.izquierda = new Nodo(35);
        raiz.derecha.derecha = new Nodo(50);

        System.out.println("Recorrido InOrden:");
        recorridoInOrden(raiz);

        System.out.println("\nRecorrido PosOrden:");
        recorridoPosOrden(raiz);
    }
}
