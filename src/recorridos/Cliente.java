
package recorridos;


public class Cliente {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(2);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(43);
        arbol.insertar(10);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
    }
}
