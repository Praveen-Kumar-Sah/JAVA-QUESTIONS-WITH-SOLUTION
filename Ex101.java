
// creating own generic stack and vector with Ex99
public class Ex101 <E>{
    private Ex99<E> ll = new Ex99<>();
    void push(E e) throws Exception{
        ll.add(e);
    }

    E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Pipping from empty is not allowed");   
        }
        return ll.removeLast();
    }

    E peek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Peeking from empty is not allowed");   
        }
        return ll.getLast();
    }
    
}
