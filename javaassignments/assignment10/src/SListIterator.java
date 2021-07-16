public class SListIterator<T> {
    Node<T> head;
    Node<T> curr;
    SListIterator(Node<T> next){
        curr = next;
        head = next;
    }
    public boolean hasNext(){
        return curr.next!=null;
    }
    public Node<T> next(){
        curr = curr.next;
        return curr;
    }
    public void insert(T data){
        curr.next = new Node<T>(data, curr.next);
        curr = curr.next;
    }
    public void remove(){
        Node temp =head;
        while(temp.next!=curr){
            temp = temp.next;
        }
        temp.next=null;
        curr=temp;
    }
}