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
public class Node {
    private Node next;
    private Node prev;
    private Element info;
    
    public Node(Element info){
        this.next=null;
        this.prev=null;
        this.info=info;
    }
    public Element getInfo(){
        return this.info;
    }
    public Node getNext(){
        return this.next;
    }
    public Node getPrev(){
        return this.prev;
    }
    public void setInfo(Element info){
        this.info.setInfo(info.getInfo());
    }
    public void setNext(Node next){
        this.next=next;
    }
    public void setPrev(Node prev){
        this.prev=prev;
    }
    
}
