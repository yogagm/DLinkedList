/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dlinkedlist;

/**
 *
 * @author Yogayustiawan
 */
public class DLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List L=new List();
        Node node=new Node(new Element(1));
        L.insertLast(node);
        node=new Node(new Element(7));
        L.insertLast(node);
        L.view();
        
    
    }
    
}
