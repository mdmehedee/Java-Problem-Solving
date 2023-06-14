package assignment6;



enum Vote{
 YES,NO,INVALID;   
}

public class VoteList {

	Node head;
		
	 public VoteList()
        {
            this.head = null;
        }
    public Node getHead()
        {
            return this.head;
        }
  	
	public boolean add( Vote data)
	{
		
		Node new_node = new Node(data);
		new_node.next = null;

		
		if (this.head == null) {
			this.head = new_node;
		}
		else {
		
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		
		return true;
	}


	public int importVotes(Vote[] Votes)
    {
   
        for(int i = 0; i<Votes.length; i++)
        {
           add(Votes[i]);
        }  
        return Votes.length;
    } 
    public boolean isValid()
    {
        int totalVotes = 0, countInvalid = 0 ;
        Node currNode = this.head;
	
		
		while (currNode != null) {
		    totalVotes++;
			if(currNode.vote == Vote.INVALID)
			{
			    countInvalid++;
			}
			
			currNode = currNode.next;
		}
		float percentage = (countInvalid/totalVotes ) * 100; 
		if(percentage > 40)
		  return false;
		else
		  return true;
    }
    public Vote countVotes()
    {
        int countYes = 0 , countNo = 0, countInvalid = 0; 
        Node currNode = this.head;
        while (currNode != null) {
			if(currNode.vote == Vote.INVALID)
			{
			    countInvalid++;
			}
		    if(currNode.vote == Vote.NO)
			{
			    countNo++;
			}
		    if(currNode.vote == Vote.YES)
			{
			    countYes++;
			}
			
			currNode = currNode.next;
		}
		if(countNo == countYes || isValid() == false)
		{
		    return  Vote.INVALID;
		}
		else if(countNo > countYes)
		{
		    return Vote.YES;
		}
		else
		{
		    return Vote.NO;
		}
        
    } 
	
	public static void printList(VoteList list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
	
		
		while (currNode != null) {
			
			System.out.print(currNode.vote + " ");
	
		
			currNode = currNode.next;
		}
	}
		// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		VoteList christmasPartyVoting = new VoteList();

		// Insert the values
		Vote YES = Vote.YES;
		Vote NO = Vote.NO;
		Vote INVALID = Vote.INVALID; 
	    Vote[] friendVotes = {YES, YES, NO, INVALID, INVALID, NO, YES, NO};
	    System.out.println(christmasPartyVoting.importVotes(friendVotes)); // returns 8
	    System.out.println(christmasPartyVoting.isValid());
        System.out.println(christmasPartyVoting.countVotes());
        
		// Print the LinkedList
		printList(christmasPartyVoting);
	}
}
