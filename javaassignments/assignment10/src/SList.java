public class SList<T> {
    Node<T> head = new Node<T>(null);
    public SListIterator<T> iterator(){
        return new SListIterator<T>(head);
    }
    public String toString(){
        if(head.next == null)
            return "Empty List";
        SListIterator <T> it = this.iterator();
        String result = new String();
        while (it.hasNext()){
            result = result.concat(it.next() + (it.hasNext()?", ":""));
        }
        return result;
    }
}