/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20251006;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        nodo primer_nodo = new nodo(50);
        nodo segundo_nodo = new nodo(80);
        nodo tercer_nodo = new nodo(90);
        
        System.out.println(primer_nodo.data);
        System.out.println(segundo_nodo.data);
        System.out.println(tercer_nodo.data);
        
        
        primer_nodo.siguiente = segundo_nodo;
        segundo_nodo.siguiente = tercer_nodo;
        
        nodo actual = primer_nodo; // Nodo cabeza/head = primer nodo
        
        while(actual != null){
            
            System.out.print(actual.data + " -> ");
            actual = actual.siguiente;
            
        }
        
        System.out.println("null");
        
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        
        ListaEnlazada mi_lista = new ListaEnlazada();
        
        mi_lista.agregaAlInicio(10);
        mi_lista.agregarAlFinal(100);
        mi_lista.agregarEn(1, 50);
        
        mi_lista.mostrar();
    }
    
}
