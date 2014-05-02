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
public class List {
    private Node first;
    
    public List(){
        this.first=null;
    }
    public void setFirst(Node l){
        this.first=l;
    }
    public Node getFirst(){
        return this.first;
    }
    public void view(){
        Node L=this.getFirst();
        while(L!=null){
            System.out.print(L.getInfo().getInfo()+" ");
            L=L.getNext();
        }
    }
    public void insertLast(Node L){
        Node a=this.getFirst();
        if(a==null) this.setFirst(L);
        else {
            while(a.getNext()!=null){
                a=a.getNext();
            }
            a.setNext(L);
            L.setPrev(a);
        }
    }
}
