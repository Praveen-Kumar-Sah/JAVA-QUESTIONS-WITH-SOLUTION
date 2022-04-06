// import Ex99.Node;

// // creating own queue with head and rear it is always r=-1, f=-1 pop = dqueue and push = nqueue
// public class Ex105 <E> {
//     private Node<E> head, rear;

//     public void enqueue(E e){
       
//         Node<E> toAdd = new Node(e);
//         if(head == null){
//             head = rear = toAdd;
//             return;
//         }

//         rear.next = toAdd;
//         rear = rear.next;

//     }

//     public void dequeue(){

//         if(head == null){
//             return null;
//         }

//         Node <E> temp = head;
//         head = head.next;

//         if(head == null){
//             rear == null;
//         }
//         return rear.data;
//     }
// }
