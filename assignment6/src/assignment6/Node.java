package assignment6;



public class Node {
    Vote vote;
    Node next;
    Node(Vote vote){
        this.vote = vote;
    }
    Vote getData()
    {
        return this.vote;
    }
    Node getNext()
    {
        return this.next;
    }
}
